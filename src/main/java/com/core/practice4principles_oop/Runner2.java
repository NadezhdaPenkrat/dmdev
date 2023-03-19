package src.main.java.com.core.practice4principles_oop;
//principles oop - object, initialization, encapsulation, polymorphism,…
//… inheritance, abstract class, instanceof
public class Runner2 {

    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        print(laptop, mobile);
        printRandom(laptop, mobile);

    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static void printRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printRandom();
            System.out.println();
        }
    }
}
