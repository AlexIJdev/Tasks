
// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
// а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
// Программа должна вывести одно натуральное число.

import java.util.Scanner;

public class TaskNumber10 {
    public static void main(String[] args) {
        Scanner lineOne = new Scanner(System.in);
        int height = lineOne.nextInt();
        int heightCrawlUp = lineOne.nextInt();
        int heightCrawlDown = lineOne.nextInt();
        System.out.println(((height - heightCrawlDown) - 1) / (heightCrawlUp - heightCrawlDown) + 1);
    }
}
