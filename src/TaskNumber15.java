
// Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
// Программа получает на вход три числа: a, b, n. Программа должна вывести два числа: стоимость покупки в рублях и копейках.

import java.util.Scanner;

public class TaskNumber15 {
    public static void main(String[] args) {
        Scanner lineOne = new Scanner(System.in);
        int ruble = lineOne.nextInt();
        int penny = lineOne.nextInt();
        int numberOfPies = lineOne.nextInt();
        System.out.println((ruble * numberOfPies + penny * numberOfPies / 100) + " " + penny * numberOfPies % 100);
    }
}
