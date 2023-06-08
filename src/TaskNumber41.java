
// Яша плавал в бассейне размером N×M метров и устал. В этот момент он обнаружил, что находится на
// расстоянии x метров от одного из длинных бортиков (не обязательно от ближайшего) и y метров от
// одного из коротких бортиков. Какое минимальное расстояние должен проплыть Яша, чтобы выбраться
// из бассейна на бортик?
// Входные данные: программа получает на вход числа N, M, x, y.
// Выходные данные: программа должна вывести число метров, которое нужно проплыть Яше до бортика.
//
// Sample Input:
//      23
//      52
//      8
//      43
// Sample Output:
//      8
//
// Sample Input:
//      18
//      90
//      3
//      63
// Sample Output:
//      3

import java.util.Scanner;

public class TaskNumber41 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int n = line.nextInt();
        int m = line.nextInt();
        int xLongBoard = line.nextInt();
        int yShortBoard = line.nextInt();
        if (xLongBoard >= yShortBoard) System.out.println(yShortBoard);
        else System.out.println(xLongBoard);
    }
}
