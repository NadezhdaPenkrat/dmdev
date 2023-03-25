package src.main.java.com.core.practice6enump;
//enums
public enum ProcessorType implements Describable {

    BIT_32("bit_32"),
    BIT_64("bit_64");

    @Override
    public String getDescription() {
        return name + " description";
    }

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
