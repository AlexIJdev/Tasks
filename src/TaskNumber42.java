
// Вводится одно действительное число - температура воздуха на улице. Если она меньше, чем 22.4 градуса,
// то вывести "Холодно(", если больше, то вывести "Тепло!", если ровно 22.4 градуса, то вывести "Прохладно...".
//
// Sample Input:
//      19.3
// Sample Output:
//      Холодно(
//
// Sample Input:
//      33.1
// Sample Output:
//      Тепло!

import java.util.Scanner;

public class TaskNumber42 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        double temperature = line.nextDouble();
        if (temperature < 22.4) System.out.println("Холодно(");
        else if (temperature > 22.4) System.out.println("Тепло!");
        else System.out.println("Прохладно...");
    }
}
