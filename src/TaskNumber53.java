
// Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и
// номер столбца), фигуру, стоящую на другой указанной клетке.
// Входные данные: вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры
// (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
// Выходные данные: требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
//
// Sample Input:
//      2 2 2 5
// Sample Output:
//      YES
//
// Sample Input:
//      1 4 5 7
// Sample Output:
//      NO

import java.util.Scanner;

public class TaskNumber53 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int x1 = line.nextInt();
        int y1 = line.nextInt();
        int x2 = line.nextInt();
        int y2 = line.nextInt();
        if (x1 == x2 || y1 == y2) System.out.println("YES");
        else System.out.println("NO");
    }
}
