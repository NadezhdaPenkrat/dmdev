package src.main.java.com.core.practice3blockwit;

import java.util.HashMap;
import java.util.Map;

public class RunnerOfMap {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", 12354887);
        Book book2 = new Book("Великий Гэтсби", 12354874);
        Book book3 = new Book("Ночь нежна", 89541554);
        Book book4 = new Book("Преступление и наказание", 15648411);
        Book book5 = new Book("Изучаем Java", 18987454);
        Book book6 = new Book("Мир дикого Запада", 98754611);

        Map<Integer, Book> bookMap = new HashMap<>();
        bookMap.put(book1.getISBN(), book1);
        bookMap.put(book2.getISBN(), book2);
        bookMap.put(book3.getISBN(), book3);
        bookMap.put(book4.getISBN(), book4);
        bookMap.put(book5.getISBN(), book5);
        bookMap.put(book6.getISBN(), book6);

        System.out.println(PrintHelper.getBookByISBN(bookMap, 15648411));

    }
}
