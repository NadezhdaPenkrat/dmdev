package src.main.java.com.core.practice8collections.t3;

import src.main.java.com.core.practice8collections.t2.Person;

import java.util.*;
//collections - map(HashMap,LinkedHashMap) comparator
public class SortExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345", "14", "678");

        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetikova")
        );
        Collections.sort(personList);
        System.out.println(personList);

        personList.sort(new PersonComparator());
        //personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println(personList);
    }

    public static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}


