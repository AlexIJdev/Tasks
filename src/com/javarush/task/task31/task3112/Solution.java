package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("/Users/kate/Desktop/Скрины/Files"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        try {
            // получаем имя файла из строки-url
            String fileName = urlString.split("/")[urlString.split("/").length - 1];

            // создаем файл для записи туда содержимого url-объекта (там должен быть итоговый результат)
            Path downloadPath = downloadDirectory.resolve(fileName);

            // создаем url-объект для ссылки
            URL url = new URL(urlString);

            // задаем поток чтения байт из url-объекта
            InputStream inputStream = url.openStream();

            // создаем временный файл для записи туда содержимого url-объекта (там должен быть временный результат)
            Path tempPath = Files.createTempFile(null, null);

            // копируем содержимое потока во временный файл с опцией перезаписи - StandardCopyOption.REPLACE_EXISTING
            Files.copy(inputStream, tempPath, StandardCopyOption.REPLACE_EXISTING);

            // перемещаем tempFile в то место, на которое указывает downloadFile
            Files.move(tempPath, downloadPath);

            return downloadPath;

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
