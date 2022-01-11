package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2;
        int[] mang1 = new int[5];
        int[] mang2 = new int[5];

        System.out.println("nhap mang 1:");
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("phan tu thu: " + (i + 1));
            mang1[i] = sc.nextInt();
        }
        System.out.println("-----------------");
        System.out.println("nhap mang 2:");
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("phan tu thu: " + (i + 1));
            mang2[i] = sc.nextInt();
        }
        System.out.println("mang1: " + Arrays.toString(mang1));
        System.out.println("mang2: " + Arrays.toString(mang2));

        System.out.println("----------------");
        System.out.println("Mang 3: ");
        int size3 = mang1.length + mang2.length;
        int mang3[] = new int[size3];
        for (int i = 0; i < mang1.length; i++) {
            mang3[i] = mang1[i];
        }
        for (int i = 0; i < mang2.length; i++) {
            mang3[mang1.length + i] = mang2[i];
        }
        System.out.println(Arrays.toString(mang3));
    }

}
