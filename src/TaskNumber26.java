
// ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц.
// Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через d дней.
//
// Входные данные:
// Вводятся три целых неотрицательных числа:
// n - количество страниц в книге
// s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
// d - количество дней
//
// Выходные данные:
// выведите на экран ответ на задачу: сколько страниц останется прочитать ВАЛЛ-И через d дней.
// Sample Input:
//         100
//         10
//         3
//
// Sample Output:
//         70
//
// Sample Input:
//         800
//         30
//         10
//
// Sample Output:
//         500

import java.util.Scanner;

public class TaskNumber26 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int pagesOfTheBook = line.nextInt();
        int pagesReadOfDay = line.nextInt();
        int daysOfReading = line.nextInt();
        System.out.println(pagesOfTheBook - pagesReadOfDay * daysOfReading);
    }
}
