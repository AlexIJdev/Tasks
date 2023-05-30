
// ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц.
// Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через 5 дней.
// Входные данные: вводятся два целых неотрицательных числа:
// n - количество страниц в книге;
// s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день.
// Выходные данные: выведите на экран ответ на задачу: сколько страниц останется прочитать ВАЛЛ-И
// через 5 дней.
//
// Sample Input:
//      100
//      10
// Sample Output:
//      50
//
// Sample Input:
//      800
//      20
// Sample Output:
//      700

import java.util.Scanner;

public class TaskNumber21 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int pagesOfTheBook = line.nextInt();
        int pagesReadOnDay = line.nextInt();
        System.out.println(pagesOfTheBook - pagesReadOnDay * 5);
    }
}
