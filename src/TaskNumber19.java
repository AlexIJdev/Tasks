
// ВАЛЛ-И решил отметить день рождения и пригласил x друзей. На каждого гостя ему необходимо
// приготовить 10 грамм заварки и по n пирожному. Килограмм чая на развес стоит t рублей,
// а одно пирожное - k рублей. Во сколько обойдется ВАЛЛ-И чаепитие? Гарантируется, что все
// числа в решения задачи окажутся целыми.
// Входные данные: вводятся 4 целых неотрицательных числа:
// x - количество приглашенных друзей;
// t - стоимость килограмма чая;
// k - стоимость одного пирожного;
// n - количество пирожных.
// Выходные данные: выведите одно целое число - ответ на задачу.
//
// Sample Input:
//      3
//      500
//      30
//      2
//
// Sample Output:
//      195

import java.util.Scanner;

public class TaskNumber19 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int numbersFriends = line.nextInt();
        int priseTea = line.nextInt();
        int priseCake = line.nextInt();
        int numbersCakes = line.nextInt();
        System.out.println((int) ((numbersFriends * 0.01 * priseTea) + (numbersFriends * numbersCakes * priseCake)));
    }
}
