package src.main.java.com.core.practice4principles_oop;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight: " + weight);
    }

    public void open() {
        System.out.println("Я открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
