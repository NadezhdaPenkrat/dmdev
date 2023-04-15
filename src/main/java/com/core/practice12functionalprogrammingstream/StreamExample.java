package src.main.java.com.core.practice12functionalprogrammingstream;

import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {

        List<String> strings = List.of("11", "22", "33", "44", "55", "66", "77", "88");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(string -> Integer.valueOf(string)) //.map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .mapToInt(value -> value.intValue())    //преобразуем в стрим интов - min, max, avg i td
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
        //  .forEach(value -> System.out.println(value)); //.forEach(value -> System.out.println(value)); //

//        for (String string : strings) {
//            String value = string + string;
//            Integer integer = Integer.valueOf(value);
//            if (integer % 2 == 0) {
//                System.out.println(integer);
//            }
//        }
    }
}
