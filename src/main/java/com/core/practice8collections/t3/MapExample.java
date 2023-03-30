package src.main.java.com.core.practice8collections.t3;

import src.main.java.com.core.practice8collections.t2.Person;

import java.util.HashMap;
import java.util.Map;
//collections - map(HashMap,LinkedHashMap) comparator
public class MapExample {

    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(1, "Sveta", "Svetikova");

        Map<Integer, Person> map = new HashMap<>();

        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        System.out.println(map.get(1));
        //map.put(sveta.getId(), sveta); вместо вани под 1 станет света, тк перетрём, поэтому неоходимо уникальность ключа
        map.putIfAbsent(sveta.getId(), sveta); // положить в мап , если такого ключа нету.

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Person person : map.values()) {
            System.out.println(person.getFirstName());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        System.out.println(map.containsKey(5));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
