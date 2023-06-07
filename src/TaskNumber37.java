
// Водится 3 целых числа, выведите большее из них.
//
// Sample Input:
//      1 2 3
// Sample Output:
//      3

import java.util.Scanner;

public class TaskNumber37 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numberOne = line.nextInt();
        int numberTwo = line.nextInt();
        int numberThree = line.nextInt();
        int result = numberOne;
        if (numberTwo >= result) result = numberTwo;
        if (numberThree >= result) result = numberThree;
        System.out.println(result);
    }
}
