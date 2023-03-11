package src.main.java.com.core.practice2string;
//string && stringBuilder
public class StringBuilderRunner {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < 100000; i++) {
            string += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        long startTime1 = System.currentTimeMillis();
        StringBuilder string1 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            string1.append(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);
    }
}
