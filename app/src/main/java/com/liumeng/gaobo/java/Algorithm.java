package com.liumeng.gaobo.java;

/**
 * Created by liumeng on 2020/11/23 0023.
 * Describe:
 */
public class Algorithm {
    public static void main(String args[]) {
        int arr[] = {108, 99, 32, 54, 199};
        int[] bubbleSort = bubbleSort(arr, 5);
        int[] selectSort = selectSort(arr, 5);
        for (int i : bubbleSort) {
            System.out.println(i);
        }
        System.out.println();
        for (int i : selectSort) {
            System.out.println(i);
        }

    }


    private static int[] bubbleSort(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    private static int[] selectSort(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < size; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
