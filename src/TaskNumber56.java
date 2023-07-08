
// Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца),
// фигуру, стоящую на другой указанной клетке.
// Входные данные: вводятся четыре числа: координаты ферзь (два числа) и координаты другой фигуры (два числа),
// каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
// Выходные данные: требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае.
//
// Sample Input:
//      1 1 3 3
// Sample Output:
//      YES
//
// Sample Input:
//      1 1 2 3
// Sample Output:
//      NO

import java.util.Scanner;

public class TaskNumber56 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int x1 = line.nextInt();
        int y1 = line.nextInt();
        int x2 = line.nextInt();
        int y2 = line.nextInt();
        if ((x2 == x1) || (y2 == y1) || (Math.abs(y2 - y1) == Math.abs(x2 - x1))) System.out.println("YES");
        else System.out.println("NO");
    }
}
