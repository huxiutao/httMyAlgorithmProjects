package com.delta.algorithm;

/**
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，
 * 找到相应位置并插入。
 */
public class InsertionSort {
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
        int preIndex = 0;
        int current = 0;
        for (int i=1; i<length; i++) {
            preIndex = i -1;
            current = intArr[i];
            while (preIndex>=0 && intArr[preIndex]>current) {
                intArr[preIndex+1] = intArr[preIndex];
                preIndex--;
            }
            intArr[preIndex+1] = current;
        }
        return intArr;
    }
}
