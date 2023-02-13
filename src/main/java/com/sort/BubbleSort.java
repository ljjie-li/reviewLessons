package com.sort;

import com.common.Variable;
import com.utils.Print;

import java.util.Arrays;

/**
 * @Package com.sort
 * @Author : ���
 * @Date : 2023/2/9 17:43
 * @Desc :ð������
 * ���ڵ����������бȶ��滻λ��
 */
public class BubbleSort {
    public static void main(String[] args) {
        /*0,2,1,4,6,8,3,5,7,1,2,4,6,9*/
        /*0,1,2,3,4,5,6,7,8,9,10,11,12,13*/
        Print.printArray(Variable.NUM);
        bubbleSort(Variable.NUM);
        Print.printArray(Variable.NUM);
    }

    private static void bubbleSort(int[] arr) {
        if(null == arr || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            //0 ~ i
            for (int j = 1; j <= i; j++) {
                //ǰһλ�ͺ�һλ��
                if(arr[j-1] > arr[j]){
                    Print.swap(arr,j-1,j);
                }
            }
        }

    }
}
