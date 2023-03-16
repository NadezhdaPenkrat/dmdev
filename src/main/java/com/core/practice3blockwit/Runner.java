package src.main.java.com.core.practice3blockwit;
//blockwit - hw1
public class Runner {
    public static void main(String[] args) {

        MyIntArrayList arrayList = new MyIntArrayList();
        ListsEvaluation listsEvaluation = new ListsEvaluation();
        PrintHelper printHelper = new PrintHelper();
        int index = 2;

        listsEvaluation.evalMyList(arrayList);
        printHelper.printArray(arrayList.array);
        System.out.printf("Число под индексом %d = %d\n", index, arrayList.get(index));
        System.out.printf("Размер массива(заполненных значений) = %d\n", arrayList.size);
        System.out.printf("Длина массива = %d\n", arrayList.array.length);
        arrayList.add(1111);
        printHelper.printArray(arrayList.array);

        arrayList.clear(arrayList.array);
        printHelper.printArray(arrayList.array);

    }
}
