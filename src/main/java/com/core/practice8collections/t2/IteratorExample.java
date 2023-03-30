package src.main.java.com.core.practice8collections.t2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//collections - Iterator, equals and hashcode
public class IteratorExample {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> integers = new ArrayList<>(list);



        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        for (Iterator<Integer> iterator1 = integers.iterator(); iterator1.hasNext(); ) {
            Integer next = iterator1.next();
            if (next == 3 || next == 4) {
                iterator1.remove();
            }
        }
        System.out.println(integers);
    }
}
