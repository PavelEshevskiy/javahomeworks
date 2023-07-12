package homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPhoneBook {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNumber("Василий Иваныч", 123, phoneBook);
        addNumber("Петька Василич", 1234, phoneBook);
        addNumber("Анка Петровна", 546585, phoneBook);
        addNumber("Василий Иваныч", 8956477, phoneBook);
        addNumber("Вовка Марьиваныч", 12356233, phoneBook);
        addNumber("Петька Василич", 787897, phoneBook);

        phoneBook.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size())).forEach(System.out::println);
    }
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}
