package com.company;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int temp = list[i];
            int pos = i;
            while (pos > 0 && temp < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = temp;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Mảng sau khi sắp xếp");
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t");
        }
    }
}
