package src.main.java.com.core.practice2string;

import java.util.Arrays;
//string && stringBuilder
/**
 * Написать функцию разбивающая строку на равные части
 * по n символов и сохраняющая отдельные части в массив и
 * вывести этот массив.
 */
public class Task5 {

    public static void main(String[] args) {
        String str = "1234567890";
        int n = 3;
        String[] result = split(str, n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] split(String string, int n) {
        int arraySize = (int) Math.ceil(string.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < string.length(); i += n) {
            int endIndex = Math.min(string.length(), i + n);
            String sunstring = string.substring(i, endIndex);
            result[counter] = sunstring;
            counter++;
        }
        return result;
    }
}
