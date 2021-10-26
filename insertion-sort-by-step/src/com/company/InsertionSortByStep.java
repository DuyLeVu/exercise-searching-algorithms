package com.company;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Nhập số lượng phần tử của mảng: ");
        size = sc.nextInt();
        int[] numArr = new int[size];
        System.out.println("Nhập " + size + " phần tử");
        for (int i = 0; i < size; i++){
            numArr[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < size; i++){
            System.out.print(numArr[i] + "\t");
        }
        System.out.println("\nThực hiện sắp xếp mảng ...");
        InsertionSortByStep(numArr);
    }

    public static void InsertionSortByStep(int[] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int pos = i;
            while (pos > 0 && temp < array[pos-1]){
                System.out.println("Đổi chỗ " + temp + " và " + array[pos-1]);
                array[pos] = array[pos-1];
                pos --;
            }
            array[pos] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
