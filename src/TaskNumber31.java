
// Напишите программу, которая по введённым времени и скорости найдёт пройденный путь. Сначала вводится
// время движения, затем скорость.
//
// Sample Input:
//      5
//      10
// Sample Output:
//      50

import java.util.Scanner;

public class TaskNumber31 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int time = line.nextInt();
        int speed = line.nextInt();
        System.out.println(time * speed);
    }
}
