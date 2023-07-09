
// Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания. Программа должна
// считывать три числа a, b, c, затем программа должна менять их значения так, чтобы стали выполнены
// условия a <= b <= c, затем программа выводит тройку a, b, c.
// Входные данные: вводятся три числа, каждое записано в отдельной строке.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      2
//      6
//      -4
// Sample Output:
//      -4 2 6
//
// Sample Input:
//      2
//      3
//      4
// Sample Output:
//      2 3 4

import java.util.Scanner;

public class TaskNumber59 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int a = line.nextInt();
        int b = line.nextInt();
        int c = line.nextInt();
        if (a <= b) {
            if (a <= c) System.out.println((b <= c) ? a + " " + b + " " + c : a + " " + c + " " + b);
            else System.out.println(c + " " + a + " " + b);
        } else {
            if (b <= c) System.out.println((a <= c) ? b + " " + a + " " + c : b + " " + c + " " + a);
            else System.out.println(c + " " + b + " " + a);
        }
    }
}
