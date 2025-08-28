package com.javarush.task.task31.task3102;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Solution {

    /*
    1. Создание листа файлов;
    2. Создание листа путей к файлам;
    3. Создание очереди для обхода всех директорий, включая внутренние;
    4. Если файл - директория - добавляем ее в конец очереди, если файл - файл - добавляем в список файлов;
    5. Перевод листа файлов в лист путей.
     */

    public static List<String> getFileTree(String root) {
        // реализация итеративного подхода с помощью реализации интерфейса очереди Queue как LinkedList
        List<String> filesPath = new ArrayList<>(); // список всех путей к файлам

        File folder = new File(root); // директория
        List<File> files = new ArrayList<>(); // список всех файлов

        if (!folder.isDirectory()) {
            return filesPath;
        }

        Queue<File> queueFiles = new LinkedList<>(); // очереддь для добавления всех директорий
        queueFiles.add(folder);

        while (!queueFiles.isEmpty()) {
            File folderDown = queueFiles.poll();

            for (File file : Objects.requireNonNull(folderDown.listFiles())) {
                if (!file.isDirectory()) {
                    files.add(file);
                } else {
                    queueFiles.add(file);
                }
            }
        }

        for (File file : files) {
            filesPath.add(file.getAbsolutePath());
        }

        return filesPath;
    }

    public static void main(String[] args) {
        String path = "/Users/kate/Desktop/Скрины/Files";
        for (String way : getFileTree(path)){
            System.out.println(way);
        }
    }
}
