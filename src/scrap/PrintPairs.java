package scrap;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kjangade on 8/11/2017.
 */
public class PrintPairs {

    private static final int MAX = 100000;

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 3, 1, 2, 1, 5};
        int sum = 6;
        int[] arr1 = new int[MAX];

        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]]++;
        }

        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            val = sum - arr[i];
            if (arr1[val] != 0) {
                //if (arr[i] + val == sum) {
                System.out.println("(" + arr[i] + "," + val + ")");
                //}
            }
            arr1[val]--;
        }


















        /**////////////////////////////////////////////////
        /*
        int[] arr = {4, 5, 9, 3, 1, 8, 2, 6, 2, 7, 8, 5, 9};

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nEnter number less then 20: ");
        int sum = scan.nextInt();
        int numberOfPairs = 0;

        printpairs(arr, sum);

        */
        /*****************************//////////////////////////////////

        /*
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == sum) {
                    numberOfPairs++;
                    System.out.println("Pairs are:");
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println("Number of pairs:" + numberOfPairs);
        */
    }

    static void printpairs(int arr[], int sum) {
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];

        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (temp >= 0 && binmap[temp]) {
                System.out.println("Pair with given sum " +
                        sum + " is (" + arr[i] +
                        ", " + temp + ")");
            }
            binmap[arr[i]] = true;
        }
    }

    public static void printPairsUsingSet(int[] numbers, int n) {
        if (numbers.length < 2) {
            return;
        }
        Set set = new HashSet(numbers.length);
        for (int value : numbers) {
            int target = n - value; // if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }


}