
// Робот ВАЛЛ-И решил отправиться в соседний город. Половину пути он проехал за t часов
// со скоростью x км/ч , а остальное расстояние со скоростью y км/ч. Рассчитайте, сколько
// времени ВАЛЛ-И был в пути.

import java.util.Scanner;

public class TaskNumber22 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int timeFirstDistance = line.nextInt();
        int speedFirstDistance = line.nextInt();
        int speedSecondDistance = line.nextInt();
        System.out.println(timeFirstDistance + (timeFirstDistance * speedFirstDistance) / speedSecondDistance);
    }
}
