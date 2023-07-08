
// Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами (номер строки и номер столбца),
// фигуру, стоящую на другой указанной клетке.
// Входные данные: вводятся четыре числа: координаты коня (два числа) и координаты другой фигуры (два числа),
// каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
// Выходные данные: требуется вывести слово YES, если конь сможет побить фигуру за 1 ход и NO - в противном случае.
//
// Sample Input:
//      3 4 5 6
// Sample Output:
//      NO
//
// Sample Input:
//      7 3 5 4
// Sample Output:
//      YES

import java.util.Scanner;

public class TaskNumber55 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int x1 = line.nextInt();
        int y1 = line.nextInt();
        int x2 = line.nextInt();
        int y2 = line.nextInt();
        if (((Math.abs(x2 - x1) == 1) && (Math.abs(y2 - y1) == 2)) || ((Math.abs(x2 - x1) == 2) && (Math.abs(y2 - y1) == 1)))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
