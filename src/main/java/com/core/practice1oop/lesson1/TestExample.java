package src.main.java.com.core.practice1oop.lesson1;
//oop - classes and objects
public class TestExample {
    public static void main(String[] args) {
        int value = 100;
        int[] array = new int[5];
        int[] array1 = {value, 500, 11, 50};

        printArray(array);
        printArray(array1);
    }

    private static void printArray(int[] arrays) {
        for (int value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
