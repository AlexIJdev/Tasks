package tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

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
        System.out.println(restoreIpAddress("25525511135"));
        System.out.println(restoreIpAddress("0000"));
        System.out.println(restoreIpAddress("4"));
        System.out.println(restoreIpAddress("2552551113523526"));
        System.out.println(restoreIpAddress("25525511"));
    }

    /**
     * Главный метод, который принимает строку и возвращает список строк с IP-адресами
     */
    private static List<String> restoreIpAddress(String s) {
        List<String> result = new ArrayList<>(); // список для хранения всех валидных IP-адресов
        backtrack(s, 0, 0, new ArrayList<>(), result); // запускаем рекурсивный поиск (backtracking)
        return result; // возвращаем все найденные IP-адреса
    }

    /**
     * Рекурсивный метод, который пробует разбивать строку на части IP-адреса
     *
     * @param s       - исходная строка с цифрами
     * @param start   - текущая позиция в строке, с которой пытаемся взять сегмент
     * @param segment - номер текущего сегмента IP (0..3)
     * @param path    - текущий список сегментов (частей IP)
     * @param result  - итоговый список валидных IP-адресов
     */
    private static void backtrack(String s, int start, int segment, List<String> path, List<String> result) {
        // если уже взяли 4 сегмента
        if (segment == 4) {
            // и если дошли до конца строки - значит IP сформирован полностью и корректно
            if (start == s.length()) {
                // добавляем IP, соединяя сегменты точками
                result.add(String.join(".", path));
            }
            return; // выходим из рекурсии, т.к. либо нашли IP, либо вариант неудачен
        }

        // перебираем длины сегментов от 1 до 3
        for (int len = 1; len <= 3; len++) {
            // если длина сегмента выходит за пределы строки — прекращаем цикл
            if (start + len > s.length()) {
                break;
            }

            // вырезаем подстроку для текущего сегмента
            String part = s.substring(start, start + len);

            // проверяем, допустим ли этот сегмент (число от 0 до 255, без ведущих нулей)
            if (isValid(part)) {
                path.add(part); // добавляем сегмент в текущий путь

                // рекурсивно пытаемся заполнить следующий сегмент,
                // сдвигая начало на len символов и увеличивая счетчик сегментов
                backtrack(s, start + len, segment + 1, path, result);

                path.remove(path.size() - 1); // возвращаемся назад — удаляем последний добавленный сегмент
            }
        }
    }

    /**
     * Метод проверки валидности сегмента
     */
    private static boolean isValid(String s) {
        // Если длина больше 1 и строка начинается с '0' — это недопустимо (ведущие нули)
        if (s.length() > 1 && s.startsWith("0")) {
            return false;
        }

        // Преобразуем в число для проверки диапазона
        int val = Integer.parseInt(s);

        // Проверяем, что число в диапазоне 0..255
        return val >= 0 && val <= 255;
    }
}
