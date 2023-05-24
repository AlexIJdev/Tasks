
// Напишите программу, которая считывает три целых числа и выводит их произведение.
//
// Sample Input:
//      5 4 2
// Sample Output:
//      40
//
// Sample Input:
//      0
//      3
//      78
// Sample Output:
//      0

import java.util.Scanner;

public class TaskNumber7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        System.out.println(numberOne * numberTwo * numberThree);
    }
}
