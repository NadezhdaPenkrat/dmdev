package src.main.java.com.core.practice1oop.lesson2;
//oop - classes and objects
//classes and objects, constructor, reload, packages
public class ComputerRunner {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.load();
        System.out.println("computer1");
        computer.printState();
        System.out.println();

        Computer computer2 = new Computer(512, 8096);

        computer2.load();
        System.out.println("computer2");
        computer2.printState();

    }
}
