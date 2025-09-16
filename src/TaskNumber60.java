import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskNumber60 {
    public static void main(String[] args) {
        // Создаем объект java.util.Date и присваиваем ему текущую дату и время
        java.util.Date dateUtil = new java.util.Date();

        // Создаем объект java.sql.Date, используя полное имя класса, и присваиваем ему текущую дату
        java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());

        // Выводим оба объекта на консоль
        System.out.println(dateUtil);
        System.out.println(dateSql);
    }
}
