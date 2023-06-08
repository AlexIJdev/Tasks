
// Вводится целое число n (0 < n < 1000). Определите, является ли оно двузначным? Выведите в ответ "Yes"/"No".
//
// Sample Input:
//      8
// Sample Output:
//      No
//
// Sample Input:
//      23
// Sample Output:
//      Yes

import java.util.Scanner;

public class TaskNumber43 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int number = line.nextInt();
        if (number > 9 && number < 100) System.out.println("Yes");
        else System.out.println("No");
    }
}
