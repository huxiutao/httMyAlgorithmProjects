package com.delta.algorithm;

/**
 * 选择排序(Selection-sort)是一种简单直观的排序算法。
 * 它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 */
public class SelectSort {

    public static int[] Sort(int[] intArr) {
        if (intArr.length<=0) {
            return intArr;
        }
        int length = intArr.length;
        int temp = 0;
        int minIndex = 0;
        for (int i=0; i<length-1; i++) {
            minIndex = i;
            for(int j=i+1; j<length; j++) {

                if (intArr[j] < intArr[minIndex]) { // 寻找最小的数
                    minIndex = j;   // 将最小数的索引保存
                }
            }

            temp = intArr[minIndex];
            intArr[minIndex] = intArr[i];
            intArr[i]=temp;
        }
        return intArr;
    }
}
