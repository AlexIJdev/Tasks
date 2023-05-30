
// ВАЛЛ-И встретил n детей и хочет разделить между ними k яблок так, чтобы каждому досталось
// поровну. Не делящийся остаток он собирается отнести ЕВЕ. Сколько яблок достанется каждому
// ребенку? Сколько яблок получит ЕВА? Результат выведите в одной строке через пробел в указанном
// порядке.
// Входные данные: два натуральных числа:
// n - количество детей;
// k - количество яблок.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      2
//      6
// Sample Output:
//      3 0
//
// Sample Input:
//      4
//      25
// Sample Output:
//      6 1

import java.util.Scanner;

public class TaskNumber23 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numbersOfChildren = line.nextInt();
        int numbersOfApple = line.nextInt();
        System.out.println((numbersOfApple - (numbersOfApple % numbersOfChildren)) / numbersOfChildren + " " + (numbersOfApple % numbersOfChildren));
    }
}
