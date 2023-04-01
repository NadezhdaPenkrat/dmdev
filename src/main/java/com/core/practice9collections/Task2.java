package src.main.java.com.core.practice9collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//collections - TreeMap, Set , practice
public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(list));
    }

    public static int countUnique(List<Integer> array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.size(); i++) {
            set.add(array.get(i));
        }
        return array.size() - set.size();
    } // Set<Integer> set = new HashSet<>(array) return set.size; - более простое решение
}
