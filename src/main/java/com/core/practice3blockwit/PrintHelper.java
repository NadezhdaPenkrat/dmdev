package src.main.java.com.core.practice3blockwit;

import java.util.List;
import java.util.Map;

public class PrintHelper {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void printList(List<Integer> list) {
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time of reading: " + (endTime1 - startTime1));
    }

    public static Book getBookByISBN(Map<Integer, Book> map, Integer ISBN) {
        return map.get(ISBN);
    }
}
