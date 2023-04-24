
// Дано произвольное положительное натуральное число. Найдите его последнюю цифру.

import java.util.Scanner;

public class TaskNumber7 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int randomNumber = line.nextInt();
        System.out.println(randomNumber % 10);
    }
}
