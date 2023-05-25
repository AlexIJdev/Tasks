
// Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить
// за n пирожков. Программа получает на вход три числа: a, b, n. Программа должна вывести два числа:
// стоимость покупки в рублях и копейках.
//
// Sample Input:
//      10 15 2
// Sample Output:
//      20 30
//
// Sample Input:
//      2 50 4
// Sample Output:
//      10 0

import java.util.Scanner;

public class TaskNumber11 {
    public static void main(String[] args) {
        Scanner lineOne = new Scanner(System.in);
        int ruble = lineOne.nextInt();
        int penny = lineOne.nextInt();
        int numberOfPies = lineOne.nextInt();
        System.out.println((ruble * numberOfPies + penny * numberOfPies / 100) + " " + penny * numberOfPies % 100);
    }
}
