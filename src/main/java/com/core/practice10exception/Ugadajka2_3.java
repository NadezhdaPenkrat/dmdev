package src.main.java.com.core.practice10exception;

public class Ugadajka2_3 {

    public static void main(String[] args) {
        try {
            System.err.println(" 0");

            try {
                System.err.println(" 1");
                if (true) {
                    throw new Exception();
                }
                System.err.println(" 2");
            } catch (Throwable e) {
                System.err.println(" 3");
                throw new RuntimeException(e);
            } finally {
                System.err.println(" 4");
            }
            System.err.println(" 5");

        } catch (Exception e) {
            System.err.println(" 6");
        } finally {
            System.err.println(" 7");
        }
        System.err.println(" 8");
    }
}
