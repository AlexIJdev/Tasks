
// Дано произвольное положительное натуральное число. Найдите его последнюю цифру.
//
// Sample Input:
//      345
// Sample Output:
//      5

import java.util.Scanner;

public class TaskNumber12 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int randomNumber = line.nextInt();
        System.out.println(randomNumber % 10);
    }
}
