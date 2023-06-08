
// Вводится целое число n (0 < n < 1000). Определите, сколько в нём цифр. Выведите ответ на экран.
//
// Sample Input:
//      8
// Sample Output:
//      1
//
// Sample Input:
//      23
// Sample Output:
//      2

import java.util.Scanner;

public class TaskNumber44 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int number = line.nextInt();
        if (number > 0 && number < 10) System.out.println("1");
        else if (number > 9 && number < 100) System.out.println("2");
        else if (number > 99 && number < 1000) System.out.println("3");
    }
}
