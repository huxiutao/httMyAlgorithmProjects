package com.delta.algorithm;

/**
 * 1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。
 * 它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 */
public class ShellSort {
    /**
     *
     * @param intArr
     * @return
     */
    public static int[] Sort(int[] intArr) {
        if (intArr.length <= 0) {
            return intArr;
        }
        int length = intArr.length;
        for (int gap=length/2; gap > 0; gap = gap/2) {
            for (int i = gap; i < length; i++) {
                int j = i;
                int current = intArr[i];
                while (j-gap>=0 && current<intArr[j-gap]) {
                    intArr[j] = intArr[j-gap];
                    j = j - gap;
                }
                intArr[j] = current;
            }
        }
        return intArr;
    }
}
