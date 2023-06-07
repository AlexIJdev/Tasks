
// Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается
// сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
// Входные данные: вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек
// в шоколадке не превосходит 30000.
// Выходные данные: программа должна вывести слово YES, если возможно отломить указанное число долек,
// в противном случае вывести слово NO.
//
// Sample Input:
//      3 2 4
// Sample Output:
//      YES
//
// Sample Input:
//      3 2 1
// Sample Output:
//      NO

import java.util.Scanner;

public class TaskNumber40 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int n = line.nextInt();
        int m = line.nextInt();
        int k = line.nextInt();
        if ((k < n * m) && ((k % n) == 0 || (k % m) == 0)) System.out.println("YES");
        else System.out.println("NO");
    }
}
