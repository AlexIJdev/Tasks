package com.javarush.task.task31.task3105;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Solution {
    // создаем статический класс Content, который представляет собой каждый кусочек ZIP-архива
    static class Content {
        String fileName; // имя файла-архива (кусочка большего архива в контексте данной задачи)
        byte[] body; // массив байт для сохранения содержимого файла-архива

        public Content(String fileName, byte[] body) {
            this.fileName = fileName;
            this.body = body;
        }

        // получаем имя файла-архива
        public String getFileName() {
            return fileName;
        }

        // сохраняем в массив байт содержимое файла-архива
        public void saveToZip(ZipOutputStream zipOutputStream) throws IOException {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.write(body);
            zipOutputStream.closeEntry();
        }
    }

    // создаем статический метод getContent(String arg), который позволяет сохранить всю информацию из файла-архива
    private static List<Content> getContents(String arg) throws IOException {
        List<Content> entries = new ArrayList<>();
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(arg))) {
            ZipEntry currentEntry;
            byte[] buffer = new byte[1024];
            while ((currentEntry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int length;
                while ((length = zipInputStream.read(buffer)) > 0) {
                    byteArrayOutputStream.write(buffer, 0, length);
                }
                entries.add(new Content(currentEntry.getName(), byteArrayOutputStream.toByteArray()));
            }
        }
        return entries;
    }

    public static void main(String[] args) throws IOException {
        // получаем всю информацию из архива и сохраняем ее в списке (файл - его содержимое)
        List<Content> entries = getContents(args[1]);

        // создаем поток для записи в тот же архив, содержимое которого сохраняли
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(args[1]))) {
            // кладем в него  ZipEntry – «архивный объект»
            File file = new File(args[0]);
            zipOutputStream.putNextEntry(new ZipEntry("name/" + file.getName()));

            // кладем в данный ZipEntry сам файл
            Files.copy(file.toPath(), zipOutputStream);

            // копируем другие ZipEntry в архив (проверяем на несовпадение с первым ZipEntry)
            for (Content content : entries) {
                if (!content.getFileName().equals("name/" + file.getName())) {
                    content.saveToZip(zipOutputStream);
                }
            }
        }
    }
}
