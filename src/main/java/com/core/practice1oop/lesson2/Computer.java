package src.main.java.com.core.practice1oop.lesson2;

public class Computer {

    private int ssd = 256;
    int ram = 4096;

    public Computer() {
        System.out.println("Я был создан");
    }

    public Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    protected void load() {
        System.out.println("Я загрузился!!!");
    }

    public void printState() {
        System.out.println("ssd:" + ssd);
        System.out.println("ram:" + ram);
    }
}
