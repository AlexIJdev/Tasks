package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // исходный файл (получаем его в java)
        File sourceFile = new File(args[1]);

        // директория
        File folder = new File(args[0]);

        // проходим по всем файлам в директории
        try (FileOutputStream fileOutputStream = new FileOutputStream(sourceFile, true)) {
            for (File file : Objects.requireNonNull(folder.listFiles())) {
                // проверяем, не превышает ли содержимое файла 50 байтов
                if (file.length() < 50) {
                    // создаем поток на чтение и запись
                    try (FileInputStream fileInputStream = new FileInputStream(file)) {
                        // читаем байты один за другим
                        int byteData;
                        while ((byteData = fileInputStream.read()) != -1) {
                            fileOutputStream.write(byteData);
                        }
                        fileOutputStream.write('\n');
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Чтение и запись файла " + file.getName() + " успешно завершена");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // создаем объект нового файла в той же папке c новым именем (пока только в java)
        File destFile = new File(sourceFile.getParentFile() + "/allFilesContent.txt");

        // если уже измененный файл присутствует в данной папке - предварительно удаляем его
        if (FileUtils.isExist(destFile)) {
            FileUtils.deleteFile(destFile);
        }

        // переименовываем файл и выводим корректное сообщение об успехе операции
        FileUtils.renameFile(sourceFile, destFile);
        System.out.println("Файл успешно переименован в: " + destFile.getAbsolutePath());
    }
}
