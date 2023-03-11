package src.main.java.com.core.practice2string;
//string && stringBuilder
/**
 * Подсчитать количетво всех точек, запятых и восклицательных знаков в строке
 */
public class Task4 {

    public static void main(String[] args) {

        String string = "sfdg,.!121324>.!w4134!";
        System.out.println(string.length() - countValue(string).length());

    }

    public static String countValue(String str) {
        String result = str.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return result;
    }

}
