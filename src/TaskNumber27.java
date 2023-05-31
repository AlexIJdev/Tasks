//
// ВАЛЛ-И за 1 день выучивает n иностранных слов. Составьте программу, которая рассчитает, сколько
// иностранных слов выучит робот за d дней.
// Входные данные:
// n - количество слов;
// d - количество дней.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      8
//      3
// Sample Output:
//      24
//
// Sample Input:
//      10
//      10
// Sample Output:
//      100

import java.util.Scanner;

public class TaskNumber27 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numberOfWords = line.nextInt();
        int numberOfDay = line.nextInt();
        System.out.println(numberOfWords * numberOfDay);
    }
}
