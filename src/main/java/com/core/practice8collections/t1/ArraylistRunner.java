package src.main.java.com.core.practice8collections.t1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//collections - arrayList and linkedList
public class ArraylistRunner {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(5);
        integers.add(1); // добавление в конец - О(1)
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6); // запуститься принудительное увеличение капасити - метод grow

        System.out.println(integers.get(2));
        System.out.println(integers.contains(4)); // поиск по значению - О(n) , тк необходимо проитерироваться по элементам

        List<Integer> integers1 = new LinkedList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        integers1.add(6);

        System.out.println(integers1.get(2));
        System.out.println(integers1.contains(4));

    }
}
