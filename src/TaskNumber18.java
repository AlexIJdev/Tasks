
// Робот ВАЛЛ-И решил отправиться в соседний город. Половину пути он проехал за t часов
// со скоростью x км/ч , а остальное расстояние со скоростью y км/ч. Рассчитайте, сколько
// времени ВАЛЛ-И был в пути.
// Входные данные: построчно вводятся 3 целых неотрицательных числа:
// t - время, затраченное на первую половину пути;
// x - скорость на первой половине пути;
// y - скорость на второй половине пути.
// Гарантируется, что ВАЛЛ-И проехал целое число часов!!!
// Выходные данные: выведите одно единственное число - время, которое ВАЛЛ-И был в пути.
//
// Sample Input:
//      2
//      60
//      30
// Sample Output:
//      6
//
// Sample Input:
//      5
//      30
//      50
// Sample Output:
//      8

import java.util.Scanner;

public class TaskNumber18 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int timeFirstDistance = line.nextInt();
        int speedFirstDistance = line.nextInt();
        int speedSecondDistance = line.nextInt();
        System.out.println(timeFirstDistance + (timeFirstDistance * speedFirstDistance) / speedSecondDistance);
    }
}
