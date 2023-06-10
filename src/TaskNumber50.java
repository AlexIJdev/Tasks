
// Вводится два целых числа - длины катетов прямоугольного треугольника. Найдите гипотенузу этого треугольника.
//
// Sample Input:
//      3 4
// Sample Output:
//      5.0
//
// Sample Input:
//      5 12
// Sample Output:
//      13.0

import java.util.Scanner;

public class TaskNumber50 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        double leg_One = line.nextDouble();
        double leg_Two = line.nextDouble();
        System.out.println(Math.sqrt(leg_One * leg_One + leg_Two * leg_Two));
    }
}
