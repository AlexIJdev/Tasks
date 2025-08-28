package com.javarush.task.task31.task3103;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Solution {
    public static byte[] readBytes(String fileName) throws IOException {
        /*
            1. формируем объект Path для файла;
            2. реализуем метод readAllBytes класса Files.
         */
        return Files.readAllBytes(Paths.get(fileName));
    }

    public static List<String> readLines(String fileName) throws IOException {
        /*
            1. формируем объект Path для файла;
            2. реализуем метод readAllLines класса Files (используем стандартную кодировку).
         */
        return Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
         /*
            1. определеляем объет Path для файла;
            2. реализуем метод write класса Files.
         */
        Files.write(Paths.get(fileName), bytes);
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
        /*
            1. определеляем объеты Path для файлов;
            2. реализуем метод copy класса Files.
         */
        Files.copy(Paths.get(resourceFileName), Paths.get(destinationFileName));
    }
}
