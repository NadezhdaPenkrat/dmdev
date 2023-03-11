package src.main.java.com.core.practice2string;
//string && stringBuilder
/**
 * Написать функцию, принимающую в качетсве параметров имя,фамилию и отчество и возвращающую инициалы
 * в формате Ф.И.О . Результат в верхнем регистре, а входные - в любом регистре.
 */

public class Task3 {
    public static void main(String[] args) {

        String name = "Vas9";
        String surname = "ivanov";
        String patronymic = "LIvanovich";
        System.out.println(format(name, surname, patronymic));

    }

    public static String format(String name, String surname, String patronymic) {

        char nameChar = name.toUpperCase().charAt(0);
        char surnameChar = surname.toUpperCase().charAt(0);
        char patronymicChar = patronymic.toUpperCase().charAt(0);

        return String.format("%s.%s.%s.", nameChar, surnameChar, patronymicChar);

    }
}
