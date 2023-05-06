
// Дано трехзначное число. Найдите сумму его цифр.

import java.util.Scanner;

public class TaskNumber17 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int randomNumber = line.nextInt();
        System.out.println((randomNumber / 100) + ((randomNumber % 100) / 10) + (randomNumber % 10));
    }
}
