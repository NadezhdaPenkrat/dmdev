package src.main.java.com.core.practice6enump;

import java.util.Arrays;
//enums
public class EnumRunner {

    public static void main(String[] args) {

        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType);
        System.out.println(processorType.name());
        System.out.println(processorType.toString());
        System.out.println(processorType.ordinal());
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(processorType.valueOf("BIT_32"));
        // System.out.println(processorType.valueOf("BIT_324")); упадёт исключение, тк нету такого значения
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(processorType.getDescription());

    }
}
