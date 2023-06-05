
// Напишите программу, которая считывает 2 действительных числа и выводит их частное. Если это
// невозможно, то выводит слово "Error".
//
// Sample Input:
//      10 2
// Sample Output:
//      5.0

import java.util.Scanner;

public class TaskNumber34 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numberOne = line.nextInt();
        int numberTwo = line.nextInt();
        if (numberTwo != 0) System.out.println((double) numberOne / numberTwo);
        else System.out.println("Error");
    }
}
