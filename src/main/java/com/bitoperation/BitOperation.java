package com.bitoperation;

/**
 *
 * @Package com.bitoperation
 * @Author : Àî¿¡½Ü
 * @Date : 2023/2/9 16:28
 * @Desc :Î»ÔËËã
 */
public class BitOperation {
    public static void main(String[] args) {
        int num = 4;
        int num1 = -4;
        print(num);
        print(num1);
        print(num<<1);
        print(num1<<1);
        print(num>>1);
        print(num1>>1);
        print(num>>>1);
        print(num1>>>1);
    }

    public static void print(int num){
        for (int i = 31; i >= 0 ; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0":"1");
        }
        System.out.println();
    }
}
