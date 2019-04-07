package com.delta.algorithm;

public class TestMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] intArr = {2,4,56,5,6,6,6,7,8,7,9,7,0,8,9};
        int[] result = BubbleSort.Sort(intArr);
        printIntArr(result);
        System.out.println();
        System.out.println("------------------");
        result = SelectSort.Sort(intArr);
        printIntArr(result);
        System.out.println();
        System.out.println("------------------");
        result = InsertionSort.Sort(intArr);
        printIntArr(result);
        System.out.println();
        System.out.println("------------------");
        result = ShellSort.Sort(intArr);
        printIntArr(result);

    }

    /**
     *
     * @param result
     */
    private static void printIntArr(int[] result) {
        for (int i : result) {
            System.out.print(i +"\t");
        }
    }
}
