package tasks.task3;

import java.util.Collections;
import java.util.List;

public class Solution {

    /*
    Условие: Написать метод, который принимает строку вида IP-адреса (с точками),
             и возвращает список всех допустимых IP-адресов, которые можно из неё
             составить, разбив на 4 числа от 0 до 255.
                1. Допустимый IP-адрес состоит из четырёх чисел (0-255), разделённых точками.
                2. Недопустимы адреса с числами больше 255, с начальными нулями (например, 01, 001).
                3. На входе строка s, состоящая только из цифр.
                4. Нужно вернуть список всех допустимых IP-адресов, которые можно составить, вставляя три точки в s.
                Примеры:
                        Вход: "25525511135"
                        Выход: ["255.255.11.135", "255.255.111.35"]

                        Вход: "0000"
                        Выход: ["0.0.0.0"]
     */

    public static void main(String[] args) {
        System.out.println(splitAddress("2552551113"));
        System.out.println(splitAddress("0000"));
    }

    private static String splitAddress(String line) {
        // проверка граничных условий
        if (!valid(line)) {
            return "Line is nor valid!";
        }

        // преобразовываем строку в массив
        char[] mass = line.toCharArray();

        // заводим два билдера - для формирования итогового результата и сохраненния промежуточного
        // результата на каждом шаге операции
        StringBuilder address = new StringBuilder();
        StringBuilder partOfAddress = new StringBuilder();

        // заполняем промежуточный результат значением
        partOfAddress.append(mass[0]);

        for (int i = 1; i < mass.length; i++) {
            if (Integer.parseInt(String.valueOf(partOfAddress)) < 255 && String.valueOf(partOfAddress).length() < 3) {
                partOfAddress.append(mass[i]);
            } else {
                address.append(partOfAddress).append(".");
                partOfAddress = new StringBuilder().append(mass[i]);
            }
        }
        if (!partOfAddress.isEmpty()) {
            address.append(partOfAddress);
        }
        return String.valueOf(address);
    }

    private static boolean valid(String line) {
        return line.length() >= 4 && line.length() <= 12;
    }
}
