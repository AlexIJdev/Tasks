
// Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения. Определите количество его
// корней. Вам достаточно вывести одно целое число - количество корней уравнения. Если корней бесконечно
// много, ты выведите строку "inf".
//
// Sample Input:
//      1
//      -5
//      6
// Sample Output:
//      2
//
// Sample Input:
//      1
//      2
//      1
// Sample Output:
//      1

import java.util.Scanner;

public class TaskNumber47 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int a = line.nextInt();
        int b = line.nextInt();
        int c = line.nextInt();
        int d = b * b - 4 * a * c;
        if (a != 0) {
            if (d < 0) System.out.println(0);
            else if (d == 0) System.out.println(1);
            else System.out.println(2);
        } else {
            if (b == 0 && c == 0) System.out.println("inf");
            else if (b == 0) System.out.println(0);
            else System.out.println(1);
        }
    }
}
