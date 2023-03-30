package src.main.java.com.core.practice8collections.t3;

import src.main.java.com.core.practice8collections.t2.Person;

import java.util.LinkedHashMap;
import java.util.Map;
//collections - map(HashMap,LinkedHashMap) comparator
public class LinkedHashMapExample {

    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(5, "Sveta", "Svetikova");

        Map<Integer, Person> map = new LinkedHashMap<>();

        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());  // в отличии от hashmap останется тот же порядок как и добавляли объекты
        }
    }
}
