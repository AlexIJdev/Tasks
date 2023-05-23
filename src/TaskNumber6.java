
//  Дано целое число n. Выведите следующее за ним четное число.
//  При решении этой задачи нельзя использовать условную инструкцию if и циклы.
//  Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.
//
// Sample Input:
//      5
// Sample Output:
//      6
//
// Sample Input:
//      8
// Sample Output:
//      10


import java.util.Scanner;

public class TaskNumber6 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int number = line.nextInt();
        System.out.println(((number - 1) % 2) + ((number) % 2) + ((number + 1) % 2) + number);
    }
}
