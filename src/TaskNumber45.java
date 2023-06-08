
// Вводятся два целых числа:  a, b - коэффициенты линейного уравнения a * x + b = 0. Определите количество
// его корней. Вам достаточно вывести одно целое число - количество корней квадратного уравнения. Если
// корней бесконечно много, ты выведите строку "inf".
//
// Sample Input:
//      1
//      -5
// Sample Output:
//      1
//
// Sample Input:
//      0
//      2
// Sample Output:
//      0

import java.util.Scanner;

public class TaskNumber45 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int a = line.nextInt();
        int b = line.nextInt();
        if (a == 0 && b == 0) System.out.println("inf");
        else if (a == 0) System.out.println(0);
        else System.out.println(1);
    }
}
