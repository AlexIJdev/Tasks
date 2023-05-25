
// Дано трехзначное число. Найдите сумму его цифр.
//
// Sample Input:
//      179
// Sample Output:
//      17
//
// Sample Input:
//      300
// Sample Output:
//      3

import java.util.Scanner;

public class TaskNumber13 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int randomNumber = line.nextInt();
        System.out.println((randomNumber / 100) + ((randomNumber % 100) / 10) + (randomNumber % 10));
    }
}
