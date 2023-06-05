
// С клавиатуры вводятся два числа. Выведите на экран большее из них.
//
// Sample Input:
//      8 11
// Sample Output:
//      11

import java.util.Scanner;

public class TaskNumber32 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numberOne = line.nextInt();
        int numberTwo = line.nextInt();
        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        } else System.out.println(numberTwo);
    }
}
