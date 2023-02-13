package com.utils;

/**
 * @Package com.utils
 * @Author : 李俊杰
 * @Date : 2023/2/9 17:45
 * @Desc :打印公共组件
 */
public class Print {
    /**
     * 打印
     * @param arr
     */
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }

    /**
     * 交换位置
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
