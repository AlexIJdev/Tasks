package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

public class Solutions {
    /*
    1. Выделяем входные параметры: путь к корневой папка + путь к результирующему файлу;
    2. Создание метода по обходу файлов в корневой директории и сбора их содержимого:
       - EnumSet - специализированный набор для хранения элементов перечислений (enum);
       - FileVisitOption - перечисление (enum) в Java, которое используется для настройки
       поведения при обходе файловой системы с помощью методов вроде Files.walkFileTree();
       - FOLLOW_LINKS - обход дерева по символическим ссылкам (в глубину);
       - NOFOLLOW_LINKS - обход дерева без символических ссылок (просто по файлам).
       - Paths.get(root) - путь к корневой парке в методе обхода walkFileTree;
       - options - поведение обхода;
       - maxDepth - глубина вложенности;
       - visitor - объект, реализующий интерфейс FileVisitor<Path>, который содержит методы,
       вызываемые при посещении файлов и директорий (например, visitFile, preVisitDirectory,
       postVisitDirectory, visitFileFailed). Здесь - собственная реализация - класс GetFiles;
    3. Создание пользовательского класса по обходу файлов - реализация SimpleFileVisitor:
       - SimpleFileVisitor - ласс в Java, реализующий интерфейс FileVisitor, который предназначен
         для обхода файловой системы;
       - Path - интерфейс, представляющий путь к файлу или директории в файловой системе;
       - BasicFileAttributes - интерфейс, содержащий базовые атрибуты файла: размер, дата последнего
         изменения, тип (файл или папка), права доступа и т.д.;
       - Files - класс с набором статических методов для работы с файлами и путями.
    4. Переименование результирующего файла;
    5. Проход по всем файлам  и получение содержимого.
     */

    // метод выполняет обход дерева файлов, начиная с указанной директории root, и
    // собирает содержимое всех файлов, удовлетворяющих определённым условиям, в карту (Map)
    public static Map<String, byte[]> getFileTree(String root) throws IOException {
        // мапа с файлами и их содержимым
        Map<String, byte[]> result = new TreeMap<>();
        // опция поведения обхода дерева файлов
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        // реализация самого обхода
        Files.walkFileTree(Paths.get(root), options, 20, new GetFiles(result));

        return result;
    }

    // это пользовательский обработчик для обхода файловой системы, который расширяет
    // SimpleFileVisitor<Path>. Он предназначен для сбора информации о файлах,
    // соответствующих определённым условиям, и сохранения их содержимого в переданную карту (Map)
    public static class GetFiles extends SimpleFileVisitor<Path> {
        private Map<String, byte[]> result;

        public GetFiles(Map<String, byte[]> result) {
            this.result = result;
        }

        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            File file = path.toFile();
            if (file.isFile() && file.length() <= 50) {
                result.put(path.getFileName().toString(), Files.readAllBytes(path));
            }
            // продолжаем обход дерева файлов (аналогично return FileVisitResult.CONTINUE)
            return super.visitFile(path, basicFileAttributes);
        }
    }

    public static void main(String[] args) {
        // путь к корневой папке
        String path = args[0];

        // путь к результирующему методу
        String resultFileAbsolutePath = args[1];

        try {
            File resultFile = new File(resultFileAbsolutePath);
            File destinationFile = new File(resultFile.getParentFile() + "/allFilesContent.txt");

            // если уже измененный файл присутствует в данной папке - предварительно удаляем его
            if (FileUtils.isExist(destinationFile)) {
                FileUtils.deleteFile(destinationFile);
            }

            // переименовываем файл и выводим корректное сообщение об успехе операции
            FileUtils.renameFile(resultFile, destinationFile);

            Map<String, byte[]> fileTreeMap = getFileTree(path);
            try (FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {
                for (byte[] bytes : fileTreeMap.values()) {
                    fileOutputStream.write(bytes);
                    fileOutputStream.write("\n".getBytes());
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
