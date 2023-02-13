package com.sort;

import com.common.Variable;
import com.utils.Print;

/**
 * @Package com.sort
 * @Author : 李俊杰
 * @Date : 2023/2/13 9:43
 * @Desc :插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        if (null == Variable.NUM || Variable.NUM.length < 2) {
            return;
        }
        Print.printArray(Variable.NUM);
//        insertSort(Variable.NUM);
        insertSort2(Variable.NUM);
        Print.printArray(Variable.NUM);
    }

    public static void insertSort(int[] arr) {
        //0-0
        //0-1
        //0-2
        //0-3 一直往前比
        int N = arr.length;
        for (int end = 1; end < N; end++){
            int newNumIndex  = end;
            while (newNumIndex -1 >= 0 && arr[newNumIndex-1] > arr[newNumIndex]){
                Print.swap(arr,newNumIndex-1,newNumIndex);
                newNumIndex--;
            }
        }
    }

    /**
     * 优化插入排序
     * @param arr
     */
    public static void insertSort2(int[] arr) {
        //0<-n
        int N = arr.length;

        for (int end = 1; end < N; end++) {
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre+1]; pre--){
                Print.swap(arr,pre,pre+1);
            }
        }
    }
}
