package com.delta.algorithm;

public class BubbleSort {
    /**
     *
     * @param intArr
     * @return
     */
    public static int[] Sort(int[] intArr) {
        if (intArr.length<=0) {
            return intArr;
        }
        int length = intArr.length;
        int temp = 0;
        for (int i=0; i<length; i++) {
            for(int j=0; j<length-i-1; j++) {
                if (intArr[j]>intArr[j+1]) {
                    temp = intArr[j+1];
                    intArr[j+1]=intArr[j];
                    intArr[j]=temp;
                }
            }
        }
        return intArr;
    }
}
