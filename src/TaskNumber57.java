
// По данному числу n закончите фразу "На лугу пасется..." одним из возможных продолжений: "n коров",
// "n корова", "n коровы", правильно склоняя слово "корова".
// Входные данные: дано число n (n<100).
// Выходные данные: программа должна вывести введенное число n и одно из слов: коров, корова или коровы,
// например, 1 корова, 2 коровы, 5 коров. Между числом и словом должен стоять ровно один пробел.
//
// Sample Input:
//      3
// Sample Output:
//      3 коровы
//
// Sample Input:
//      10
// Sample Output:
//      10 коров

import java.util.Scanner;

public class TaskNumber57 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int n = line.nextInt();
        if (n == 11 || n == 12 || n == 13 || n == 14 || n % 10 == 0 || n % 10 == 5 || n % 10 == 6 || n % 10 == 7 || n % 10 == 8 || n % 10 == 9)
            System.out.println(n + " коров");
        else if (n % 10 == 1) System.out.println(n + " корова");
        else System.out.println(n + " коровы");
    }
}
