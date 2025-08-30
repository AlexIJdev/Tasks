package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

// класс SearchFileVisitor — это расширение SimpleFileVisitor<Path>, предназначенное
// для поиска файлов по определённым критериям: он реализует логику фильтрации файлов
// во время обхода файловой системы
public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    public String getPartOfName() {
        return partOfName;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public String getPartOfContent() {
        return partOfContent;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        // проверяем, содержит ли название файла заданную строку - partOfName: если
        // partOfName не null и имя файла не содержит эту часть, файл пропускается (return CONTINUE).
        if (partOfName != null && !file.getFileName().toString().contains(partOfName)) {
            return FileVisitResult.CONTINUE;
        }

        // проверяем размер файла: если размер файла больше maxSize (если maxSize > 0) или меньше
        // minSize (если minSize > 0), файл пропускается
        byte[] content = Files.readAllBytes(file); // чтение содержимого файла
        if ((maxSize > 0 && content.length > maxSize) || (minSize > 0 && content.length < minSize)) {
            return FileVisitResult.CONTINUE;
        }

        // проверяем, имеется в содержимом файла partOfContent
        if (partOfContent != null && !partOfContent.isEmpty()) {
            String contentOfFile = new String(content);
            if (!contentOfFile.contains(partOfContent)) {
                return FileVisitResult.CONTINUE;
            }
        }

        // если все проверки пройдены, добаляем файл в список foundFiles
        foundFiles.add(file);
        return super.visitFile(file, attrs);
    }
}
