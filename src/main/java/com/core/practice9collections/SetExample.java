package src.main.java.com.core.practice9collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//collections - TreeMap, Set , practice
public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // список с произвольным расположением
        addString(set);

        Set<String> set1 = new LinkedHashSet<>(); // список в порядке добавдения
        addString(set1);

        Set<String> set2 = new TreeSet<>(); // отсортированный список (для стринг и инт)
        addString(set2);
    }

    public static void addString(Set<String> set) {
        System.out.println(set.add("eee"));
        System.out.println(set.add("bbb"));
        System.out.println(set.add("ccc"));
        System.out.println(set.add("ddd"));
        System.out.println(set.add("bbb"));
        System.out.println(set);
    }
}
