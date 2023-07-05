
// Вводятся три целых числа. Необходимо определить, существует ли треугольник с такими сторонами.
// В ответ выведите "Yes"/"No".
//
// Sample Input:
//      3 4 5
// Sample Output:
//      Yes
//
// Sample Input:
//      2 2 5
// Sample Output:
//      No

import java.util.Scanner;

public class TaskNumber51 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int side_One = line.nextInt();
        int side_Two = line.nextInt();
        int side_Three = line.nextInt();
        if ((side_One + side_Two > side_Three) && (side_Two + side_Three > side_One) && (side_One + side_Three > side_Two))
            System.out.println("Yes");
        else System.out.println("No");
    }
}
