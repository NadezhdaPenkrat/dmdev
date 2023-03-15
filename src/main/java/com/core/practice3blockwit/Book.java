package src.main.java.com.core.practice3blockwit;

public class Book {

    private String name;
    private Integer ISBN;

    public Book(String name, Integer ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getISBN() {
        return ISBN;
    }

}
