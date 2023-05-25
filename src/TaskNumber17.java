
// Робот ВАЛЛ-И каждый день меняет пароль от своей учетной записи на обучающей платформе.
// Ему нравится придумывать числа разной длины и суммировать их последние цифры.
// К получившемуся значению он добавляет строчные согласные буквы, входящие в его имя на латинице.
// Составьте программу для ВАЛЛ-И, которая позволяла бы ему придумывать 3 любых целых числа и
// выдавала бы пароль на текущий день.
// Входные данные: 3 натуральных числа.
// Выходные данные: выведите ответ на задачу (если в результате вычислений получается однозначное
// число, то добавлять 0 в начале не нужно)
//
// Sample Input:
//      123
//      204
//      15689
// Sample Output:
//      16vll
//
// Sample Input:
//      1723
//      13413477
//      1205
// Sample Output:
//      15vll

import java.util.Scanner;

public class TaskNumber17 {
    public static void main(String[] args) {
        Scanner lineOne = new Scanner(System.in);
        int numberOne = lineOne.nextInt() % 10;
        int numberTwo = lineOne.nextInt() % 10;
        int numberThree = lineOne.nextInt() % 10;
        System.out.println(numberOne + numberTwo + numberThree + "vll");
    }
}
