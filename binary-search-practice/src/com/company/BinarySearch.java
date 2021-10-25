package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy số ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] numArray = new int[size];
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " = ");
            numArray[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Mảng bạn vừa nhập: ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + "  ");
        }

        Arrays.sort(numArray);

        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + "  ");
        }
        System.out.println("\nNhập phần tử cần tìm");
        int numNeedToFind = sc.nextInt();
        sc.nextLine();
        if (binarySearch(numArray, 0, numArray.length - 1, numNeedToFind) != -1) {
            System.out.println("Phần tử cần tìm ở vị trí " + binarySearch(numArray, 0, numArray.length - 1, numNeedToFind));
        } else System.out.println("Phần tử cần tìm không có trong mảng");
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        // điều kiện dừng
        if (right - left < 0) {
            return -1;
        }
        if (array[middle] == value)
            return middle;
        else if (value > array[middle]) {
            left = middle + 1;
            return binarySearch(array, left, right, value);
        } else {
            right = middle - 1;
            return binarySearch(array, left, right, value);
        }
    }
}
