package com.javarush.task.task31.task3106;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {

        // получаем результирующий файл (вообще это объект-обертка для работы над файлом по опр. пути)
        File resultFile = new File(args[0]);

        // проверяем, существует ли физический файл по указанному пути;
        // если нет - создаем физический файл на диске по указанному пути
        if (!resultFile.exists()) {
            resultFile.createNewFile();
        }

        // создаем список потоков, занимающися чтением информации из разных кусочков архива
        List<FileInputStream> fileInputStreamList = new ArrayList<>();

        // расставляем кусочки архивов в правильном порядке: создаем список имен архивов и
        // сортируем его в порядке следования файлов
        List<String> filesName = new ArrayList<>(Arrays.asList(args).subList(1, args.length));
        Collections.sort(filesName);

        // создам поток чтения информации для каждого кусочка архива
        for (String file : filesName) {
            fileInputStreamList.add(new FileInputStream(file));
        }

        // создаем поток для чтения из ZIP-архива, объединяя несколько
        // потоков входных данных fileInputStream в один последовательный поток SequenceInputStream;
        // [SequenceInputStream — это класс в Java, который позволяет объединить несколько
        // потоков InputStream в один последовательный поток]
        // [Enumeration — это интерфейс в Java, который предоставляет способ последовательного перебора
        // элементов коллекции или набора данных; он был введен в ранних версиях Java (до появления Iterator)
        // и до сих пор используется в некоторых случаях]
        try (ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(Collections.enumeration(fileInputStreamList)))) {
            // заводим бесконечный цикл, пока все внутренний чати - ZipEntry -  не закончатся
            while (true) {
                ZipEntry zipEntry = zipInputStream.getNextEntry();
                if (zipEntry == null) {
                    break;
                }

                // создаем поток для записи содержимого из каждой частички - ZipEntry
                try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(resultFile))) {

                    // заводим буферную запись для оптимальной и быстрой записи
                    final int bufferSize = 1024;
                    byte[] buffer = new byte[bufferSize];
                    for (int readBytes; (readBytes = zipInputStream.read(buffer, 0, bufferSize)) > -1; ) {
                        outputStream.write(buffer, 0, readBytes);
                    }
                    outputStream.flush(); // обеспечиваем запись всей информации, без оставшихся "хвостов"
                }
            }
        }
    }
}
