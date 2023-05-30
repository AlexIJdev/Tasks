
// Робот ВАЛЛ-И любит играть в такую игру: он называет натуральное число, а ЕВА берет последнюю цифру
// этого числа и увеличивает на n. Какое число получила ЕВА?
// Входные данные: программа получает на вход два натуральных числа:
// x - число, которое загадывает ВАЛЛ-И;
// n - на сколько увеличивается последняя цифра
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      811
//      2
//  Sample Output:
//      3
//
//  Sample Input:
//      315689
//      10
// Sample Output:
//      19

import java.util.Scanner;

public class TaskNumber25 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numberOfVally = line.nextInt();
        int increaseNumber = line.nextInt();
        System.out.println((numberOfVally % 10) + increaseNumber);
    }
}
