
// Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере.
// Пробелы, знаки препинания, заглавные и строчные буквы важны! Вводится целое число, по модулю не превосходящее 10000.
// Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ",
// окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела.
// Аналогично в следующей строке для предыдущего числа.
//
// Sample Input:
//      179
// Sample Output:
//      The next number for the number 179 is 180.
//      The previous number for the number 179 is 178.
//
// Sample Input:
//      0
// Sample Output:
//      The next number for the number 0 is 1.
//      The previous number for the number 0 is -1.


import java.util.Scanner;

public class TaskNumber12 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int number = line.nextInt();
        System.out.println("The next number for the number " + number + " is " + (number + 1) + ".");
        System.out.println("The previous number for the number " + number + " is " + (number - 1) + ".");
    }
}
