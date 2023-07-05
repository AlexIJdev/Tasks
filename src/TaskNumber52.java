
// Даны координаты двух точек на плоскости, требуется определить, лежат ли они в одной координатной четверти
// или нет (все координаты отличны от нуля).
// Входные данные: вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).
// Выходные данные: программа должна вывести слово YES, если точки находятся в одной координатной четверти,
// в противном случае вывести слово NO.
//
// Sample Input:
//      1 1 2 2
// Sample Output:
//      YES
// Sample Input:
//      -1 3 4 -5
// Sample Output:
//      NO

import java.util.Scanner;

public class TaskNumber52 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int x1 = line.nextInt();
        int y1 = line.nextInt();
        int x2 = line.nextInt();
        int y2 = line.nextInt();
        if ((x1 > 0 && x2 > 0 && y1 > 0 && y2 > 0) || (x1 > 0 && x2 > 0 && y1 < 0 && y2 < 0) || (x1 < 0 && x2 < 0 && y1 > 0 && y2 > 0) || (x1 < 0 && x2 < 0 && y1 < 0 && y2 < 0))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
