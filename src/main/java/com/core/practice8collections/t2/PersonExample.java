package src.main.java.com.core.practice8collections.t2;

//collections - Iterator, equals and hashcode
public class PersonExample {

    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Ivan1", "Ivanov1");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));
    }
}
