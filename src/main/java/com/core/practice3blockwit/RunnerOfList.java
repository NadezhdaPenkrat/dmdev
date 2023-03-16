package src.main.java.com.core.practice3blockwit;

import java.util.*;

public class RunnerOfList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        ListsEvaluation.creationOfList(arrayList);
        PrintHelper.printList(arrayList);
        System.out.println();
        System.out.println();

        List<Integer> linkedList = new LinkedList<>();
        ListsEvaluation.creationOfList(linkedList);
        PrintHelper.printList(linkedList);
    }
}
