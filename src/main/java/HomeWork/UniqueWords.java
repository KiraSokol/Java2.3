package HomeWork;

import java.util.*;
public class UniqueWords {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Кот");
        set.add("Кенгуру");
        set.add("Собака");
        set.add("Ехидна");
        set.add("Змея");
        set.add("Выдра");
        set.add("Лиса");
        set.add("Хомяк");
        set.add("Кот");
        set.add("Енот");
        set.add("Тушканчик");
        set.add("Енот");
        set.add("Выдра");
        set.add("Енот");
        set.add("Ехидна");
        set.add("Ежик");
        System.out.println(set);

        List<String> uniqueWords = Arrays.asList("Кот", "Кенгуру", "Собака", "Ехидна", "Змея", "Выдра", "Лиса", "Хомяк", "Кот", "Енот", "Тушканчик", "Енот", "Выдра", "Енот", "Ехидна", "Ежик");

        System.out.println("\nКоличество:");
        Map<String, Integer> countWords = new HashMap<>();
        for (String s : uniqueWords) {
            countWords.put(s, countWords.getOrDefault(s, 0) + 1);
        }
        countWords.entrySet().forEach(System.out::println);

    }
}