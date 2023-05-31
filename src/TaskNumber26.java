
// ВАЛЛ-И собирается съездить на уборку в соседний город и хочет рассчитать время на дорогу. По карте
// он определил расстояние s в километрах и настроил свою скорость равной v км/ч. Составьте программу,
// которая поможет ВАЛЛ-И определять время, проводимое в пути.
// Входные данные:
// s - расстояние;
// v - скорость.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      600
//      60
// Sample Output:
//      10.0
//
// Sample Input:
//      100
//      20
// Sample Output:
//      5.0

import java.util.Scanner;

public class TaskNumber26 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        double distance = line.nextDouble();
        double speed = line.nextDouble();
        System.out.println(distance / speed);
    }
}
