
// ВАЛЛ-И и ЕВА решили встретиться и выехали навстречу друг другу. Скорость ВАЛЛ-И составляет x км/ч, а
// ЕВЫ - y км/ч. Когда они встретились, то ВАЛЛ-И сообщил, что был в пути t часов, а ЕВА сказала, что
// потратила на дорогу m часов. Составьте программу, которая бы вычислила, какое расстояние было между
// ВАЛЛ-И и ЕВОЙ в момент их отправления.
// Входные данные:
// x - скорость ВАЛЛ-И;
// y - скорость ЕВЫ;
// t - время ВАЛЛ-И;
// m - время ЕВЫ.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      10
//      5
//      2
//      3
// Sample Output:
//      35
//
// Sample Input:
//      60
//      50
//      3
//      4
// Sample Output:
//      380

import java.util.Scanner;

public class TaskNumber29 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int speedOfVally = line.nextInt();
        int speedOfEva = line.nextInt();
        int timeOfVally = line.nextInt();
        int timeOfEva = line.nextInt();
        System.out.println(speedOfVally * timeOfVally + speedOfEva * timeOfEva);
    }
}
