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
}
