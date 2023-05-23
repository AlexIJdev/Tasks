
// Длина Московской кольцевой автомобильной дороги —109 километров. Байкер Вася стартует с нулевого
// километра МКАД и едет со скоростью v километров в час. На какой отметке он остановится через t часов?
// Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по
// МКАД, если же значение v<0, то в отрицательном. Программа должна вывести целое число от 0 до 108 —
// номер отметки, на которой остановится Вася.
//
// Sample Input:
//      60
//      2
// Sample Output:
//      11
//
// Sample Input:
//      -1
//      1
// Sample Output:
//      108

import java.util.Scanner;

public class TaskNumber9 {
    public static void main(String[] args) {
        Scanner lineOne = new Scanner(System.in);
        int speed = lineOne.nextInt();
        int time = lineOne.nextInt();
        System.out.println((109 + ((speed * time) % 109)) % 109);
    }
}
