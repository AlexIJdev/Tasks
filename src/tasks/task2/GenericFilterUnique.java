package tasks.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Дана коллекция объектов произвольного типа T. Нужно написать универсальный метод, который:
 * - принимает список элементов типа T;
 * - отфильтровывает и возвращает новый список, содержащий только уникальные элементы;
 * - элементы считаются уникальными, если они удовлетворяют условию, задаваемому предикатом
 * [предикат — это функция (либо Predicate<T>), которая возвращает true, если элемент должен быть включён];
 * - если входной список равен null или содержит null элементы, метод выбрасывает собственное исключение
 * InvalidCollectionException с информативным сообщением.
 * - метод должен работать корректно и быть потокобезопасным.
 * - использовать дженерики и стримы.
 */

// задаем класс пользовательского исключения
class InvalidCollectionException extends RuntimeException {
    public InvalidCollectionException(String message) {
        super(message);
    }
}

public class GenericFilterUnique<T> {
    /**
     * Фильтрует уникальные элементы из списка по заданному предикату.
     *
     * @param collection входной список элементов (не должен быть null)
     * @param predicate  условие для фильтрации элементов
     * @return новый список с уникальными элементами, удовлетворяющими предикату
     * @throws InvalidCollectionException если входной список null или содержит null элементы
     */
    public List<T> filterUnique(List<T> collection, Predicate<T> predicate) {
        //
        if (collection == null) {
            throw new InvalidCollectionException("Входной список не может быть null");
        }

        if (collection.stream().allMatch(Objects::isNull)) {
            throw new InvalidCollectionException("Список не должен содержать null элементы");
        }

        return collection.stream()
                .filter(predicate).distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        GenericFilterUnique<String> genericFilterUnique = new GenericFilterUnique<>();
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");

        // пример предиката: только фрукты с длиной имени больше 4
        Predicate<String> predicate = s -> s.length() > 4;

        try {
            List<String> result = genericFilterUnique.filterUnique(input, predicate);
            System.out.println(result); //[apple, banana, orange]
        } catch (InvalidCollectionException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
