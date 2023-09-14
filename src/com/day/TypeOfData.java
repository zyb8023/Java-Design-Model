package com.day;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class TypeOfData {
    // 冒泡排序，两两比较，大的放最后
    // 外层循环控制比较次数，内层循环控制比较内容
    public void sortArray(int @NotNull [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    // 选择排序
    // 首先在未排序序列中找到最小（大）元素\
    // 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
    public void sortArray2(int @NotNull [] arr) {
        int minIndex;
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            // 找到最小索引
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换最小值
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
    public void chartToInt() {
        char word = 's';
        char wo = '我';
        System.out.println((int)word);
        System.out.println((int)wo);
    }
    public static void main(String[] args) {
        int arr[] = {8, 2, 14, 18, 3, 1, 100};
        System.out.println(Arrays.toString(arr));
//        for (int a: arr) {
//            System.out.println(a);
//        }
        TypeOfData t = new TypeOfData();
//        t.sortArray(arr);
        t.sortArray2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
