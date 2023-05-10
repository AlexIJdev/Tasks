
// Робот ВАЛЛ-И каждый день меняет пароль от своей учетной записи на обучающей платформе.
// Ему нравится придумывать числа разной длины и суммировать их последние цифры.
// К получившемуся значению он добавляет строчные согласные буквы, входящие в его имя на латинице.
// Составьте программу для ВАЛЛ-И, которая позволяла бы ему придумывать 3 любых целых числа и
// выдавала бы пароль на текущий день.

import java.util.Scanner;

public class TaskNumber21 {
    public static void main(String[] args) {
        Scanner lineOne = new Scanner(System.in);
        int numberOne = lineOne.nextInt() % 10;
        int numberTwo = lineOne.nextInt() % 10;
        int numberThree = lineOne.nextInt() % 10;
        System.out.println(numberOne + numberTwo + numberThree + "vll");
    }
}
