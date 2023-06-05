
// С клавиатуры построчно вводятся три строки. Необходимо определить, все ли он равны. Если да,
// то вывести "Yes", в противном случае - "No".
//
// Sample Input:
//      String
//      String
//      String
// Sample Output:
//      Yes
//
// Sample Input:
//      String
//      String
//      Not String
// Sample Output:
//      No

import java.util.Scanner;

public class TaskNumber33 {
    public static void main(String[] args) {
        Scanner lineInput = new Scanner(System.in);
        String lineOne = lineInput.nextLine();
        String lineTwo = lineInput.nextLine();
        String lineThree = lineInput.nextLine();
        if (lineOne.equals(lineTwo) && lineOne.equals(lineThree)) System.out.println("Yes");
        else System.out.println("No");
    }
}
