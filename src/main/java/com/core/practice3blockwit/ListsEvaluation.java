package src.main.java.com.core.practice3blockwit;

import java.util.List;
import java.util.Random;

public class ListsEvaluation {

    public void evalMyList(MyIntArrayList array) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= random.nextInt(100_000); i++) {
            int x = random.nextInt(100) + 1;
            array.add(x);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time of creation: " + (endTime - startTime));
    }

    public static void creationOfList(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int x = random.nextInt(100) + 1;
            list.add(x);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time of creation: " + (endTime - startTime));
    }
}
