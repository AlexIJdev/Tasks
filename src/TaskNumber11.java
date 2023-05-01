
// Напишите программу, которая считывает три целых числа и выводит их произведение.

import java.util.Scanner;

public class TaskNumber11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        System.out.println(numberOne * numberTwo * numberThree);
    }
}
