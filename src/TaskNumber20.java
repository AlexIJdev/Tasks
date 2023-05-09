
// Путешествуя, ВАЛЛ-И попал в логово к Дракону. Чтобы остаться в живых ему надо угадать число,
// которое задумали его головы. Первая голова называет любое целое число, вторая - увеличивает
// его на 3, а третья результат уменьшает в 2 раза. Составьте программу, которая позволит ВАЛЛ-И
// безошибочно вычислять результат.

import java.util.Scanner;

public class TaskNumber20 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int number = line.nextInt();
        System.out.println((double) (number + 3) / 2);
    }
}
