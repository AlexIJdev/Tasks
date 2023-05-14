// ВАЛЛ-И хочет по электронным часам, показывающим часы и минуты,  узнать сколько времени в минутах
// прошло от начала суток.
//
// Входные данные:
// два числа: часы (0 <= h < 24) и минуты (0 <= m < 60)
//
// Выходные данные:
// время от начала суток в минутах
//
// Sample Input:
// 2
// 45
//
// Sample Output:
// 165

import java.util.Scanner;

public class TaskNumber24 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int hours = line.nextInt();
        int minutes = line.nextInt();
        System.out.println(hours * 60 + minutes);
    }
}
