
// ВАЛЛ-И называет натуральное число, а ЕВА записывает 3 последовательных числа, следующих после него.
// Напишите программу, которая выводит числа  ЕВЫ через черточку.
// Входные данные: натуральное число.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      8
// Sample Output:
//      9-10-11

import java.util.Scanner;

public class TaskNumber30 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int number = line.nextInt();
        System.out.println((number + 1) + "-" + (number + 2) + "-" + (number + 3));
    }
}
