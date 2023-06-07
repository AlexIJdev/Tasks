
// С клавиатуры построчно вводятся три строки. Если среди них есть ровно две равные строки то
// вывести "Yes", в противном случае - "No".
//
// Sample Input:
//      String
//      Hello!
//      String
// Sample Output:
//      Yes
//
// Sample Input:
//      hello
//      String
//      Not String
// Sample Output:
//      No

import java.util.Scanner;

public class TaskNumber39 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        String lineOne = line.next();
        String lineTwo = line.next();
        String lineThree = line.next();
        if (lineOne.equals(lineThree) && lineTwo.equals(lineThree)) System.out.println("No");
        else if (lineOne.equals(lineThree) || lineTwo.equals(lineThree) || lineOne.equals(lineTwo))
            System.out.println("Yes");
        else System.out.println("No");
    }
}
