
// На одной строчке через пробел записаны два целых числа: длина и ширина прямоугольника.
// Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.
//
// Sample Input:
//      5 10
// Sample Output:
//      50
//      30

import java.util.Scanner;

public class TaskNumber9 {
    public static void main(String[] args) {
        Scanner lineOne = new Scanner(System.in);
        int numberOne = lineOne.nextInt();
        int numberTwo = lineOne.nextInt();
        System.out.println(numberOne * numberTwo);
        System.out.print(2 * (numberOne + numberTwo));
    }
}
