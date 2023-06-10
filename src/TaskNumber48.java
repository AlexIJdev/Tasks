
// Вася приехал в Америку и он оооооочень любит кофе. В Америке приобрести этот напиток можно лишь лицам
// достигшим  возраста 21 год. Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет")
// на вопрос: попьёт ли Вася сегодня кофе?
//
// Sample Input:
//      18
// Sample Output:
//      Нет
//
// Sample Input:
//      34
// Sample Output:
//      Да

import java.util.Scanner;

public class TaskNumber48 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int years = line.nextInt();
        System.out.println((years >= 21) ? "Да" : "Нет");
    }
}
