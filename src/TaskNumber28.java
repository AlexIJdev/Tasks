
// ВАЛЛ-И, катаясь на лифте, заметил, что между двумя соседними этажами он проезжает за t  секунд. Составьте программу, помогающую ВАЛЛ-И рассчитать, за сколько секунд он поднимется на этаж с номером n.
//
// Входные данные: программа получает на вход два натуральных числа:
// t - время в секундах, за которое лифт поднимается на один этаж, n - номер этажа, на который надо подняться ВАЛЛ-И
//
// Выходные данные: выведите ответ на задачу
//
// Sample Input:
//        2
//        5
// Sample Output:
//        8
//
// Sample Input:
//        5
//        2
// Sample Output:
//        5

import java.util.Scanner;

public class TaskNumber28 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int timeToClimbOneFloor = line.nextInt();
        int numberOfFloor = line.nextInt();
        System.out.println((numberOfFloor - 1) * timeToClimbOneFloor);
    }
}
