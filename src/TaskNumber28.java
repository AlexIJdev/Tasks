
// ВВАЛЛ-И случайно забрел на ферму, где увидел лошадей и гусей. Лошадей он насчитал h штук, гусей - g штук.
// Составьте программу, которая бы помогла ВАЛЛ-И узнать количество ног обитателей фермы.
// Входные данные:
// h - количество лошадей;
// g - количество гусей.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      8
//      4
// Sample Output:
//      40
//
// Sample Input:
//      2
//      3
// Sample Output:
//      14

import java.util.Scanner;

public class TaskNumber28 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numberOfHorses = line.nextInt();
        int numberOfGooses = line.nextInt();
        System.out.println(numberOfHorses * 4 + numberOfGooses * 2);
    }
}
