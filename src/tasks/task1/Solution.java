package tasks.task1;

/**
 * Коллекции: уникальные элементы сохраняя порядок
 * Проблема: дан список строк. Вернуть новый список, который содержит уникальные элементы в порядке их первого появления.
 * Вход: ["apple", "banana", "apple", "orange", "banana", "kiwi"]
 * Выход: ["apple", "banana", "orange", "kiwi"]
 */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getUniqueList(List.of("apple", "banana", "apple", "orange", "banana", "kiwi")));
    }

    public static List<String> getUniqueList(List<String> inputlist) {
        // собираем элементы в LinkedHashSet, который сохраняет порядок вставки и обеспечивает уникальность
        return new ArrayList<>(new LinkedHashSet<>(inputlist));
    }
}
