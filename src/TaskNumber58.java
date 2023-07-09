
// На сковородку одновременно можно положить k котлет. Каждую котлету нужно с каждой стороны обжаривать m
// минут непрерывно. За какое наименьшее время удастся поджарить с обеих сторон n котлет?
// Входные данные: вводятся 3 числа: k, m и n. Все числа не превосходят 32000.
// Выходные данные: вывести время, за которое все котлеты будут обжарены.
//
// Sample Input:
//      1
//      5
//      1
// Sample Output:
//      10
//
// Sample Input:
//      2
//      4
//      3
// Sample Output:
//      12

import java.util.Scanner;

public class TaskNumber58 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int k = line.nextInt();
        int m = line.nextInt();
        int n = line.nextInt();
        if (n <= k) System.out.println(m * 2);
        else if (n * 2 % k == 0) System.out.println((n * 2 / k) * m);
        else System.out.println((n * 2 / k) * m + m);
    }
}
