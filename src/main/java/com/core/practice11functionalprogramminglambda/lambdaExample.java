package src.main.java.com.core.practice11functionalprogramminglambda;

import java.util.Comparator;

public class lambdaExample {

    public static void main(String[] args) {
//        Comparator<Integer> comparator = new IntegerComparator();

//        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        };

//        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2); // alt+enter --->
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(25, 100));
    }

    // private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        //[модиф.] возвр название([параметры])
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }
//    }
}
