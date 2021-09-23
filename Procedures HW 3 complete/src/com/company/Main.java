package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {32, 4, 242, 4, 24, 2, 42, 4, 24, 2, 42, 42, 4};
        int[] array2 = {6, 63, 5, 35, 35, 3, 87, 7, 87};
        System.out.println(any(array1, array2));
    }
    static boolean contains (int[] array, int value) {
        for (int i = 0; i< array.length; i++)
            if (array[i] == value) return true;
        return false;
    }

    static boolean any(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (contains(b, a[i])) return true;
        return false;
    }

}