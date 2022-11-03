package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static int sum(int[] array) {
        if (array == null) {
            return 0;
        } else if (array.length == 0) {
            return 0;
        } else {
            int sum = 0;
            for (int value : array) {
                if (value % 2 == 0) {
                    sum +=value;
                }
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};
        System.out.println(sum(array));
    }
}
