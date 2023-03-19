package src.main.java.com.core.practice4principles_oop;

import java.util.Random;

public interface Printable {

    String SOME_STR = "Print";
    Random RANDOM = new Random();

    void print();

    default void printRandom() {
        System.out.println(generateRandom());
        print();
    }

    default int generateRandom() {
        return RANDOM.nextInt();
    }
}
