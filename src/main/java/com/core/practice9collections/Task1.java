package src.main.java.com.core.practice9collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//collections - TreeMap, Set , practice
public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6,2344,23,22,32,31);
        System.out.println(uncount(list));
    }

    public static List<Integer> uncount(List<Integer> array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                arrayList.add(array.get(i));
            }
        }
        return arrayList;
    }
}
