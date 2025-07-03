package com.smallestAndSecondSmallest;

import java.util.Scanner;

public class SmallestAndSecondSmallest {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        inputHelper(size);
    }

    public static void inputHelper(int size) {
        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int arr[] = new int[size];
        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int[] minAnd2ndMin = minAnd2ndMin(arr);
        System.out.println("{" + minAnd2ndMin[0] + ", " + minAnd2ndMin[1] + "}");
    }

    public static int[] minAnd2ndMin(int arr[]) {
        int result[] = new int[2];

        if (arr.length < 2) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secMin = min;
                min = num;
            } else if (num != min && num < secMin) {
                secMin = num;
            }
        }

        if (secMin == Integer.MAX_VALUE) {
            result[0] = -1;
            result[1] = -1;
        } else {
            result[0] = min;
            result[1] = secMin;
        }

        return result;
    }

}
