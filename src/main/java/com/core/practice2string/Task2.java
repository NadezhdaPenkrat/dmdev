package src.main.java.com.core.practice2string;
//string && stringBuilder
// Написать функцию, принимающую 2 параметра: строку и слова и возвращающая true,
// если строка начинается и заканчивается этим словом

public class Task2 {

    public static void main(String[] args) {

        String string1 = "123sdfsdf321sdf sf123";
        String word = "123";
        System.out.println(check(string1, word));

    }

    public static boolean check(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }
}
