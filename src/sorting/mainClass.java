package sorting;

import graph.*;
import graph.MergeSort;
import scrap.ArrayRotate;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kjangade on 8/2/2017.
 */
public class mainClass {

    public static int sizeOfArray() {
        Scanner scan = new Scanner(System.in);

        int size = 0;

        System.out.println("Please enter the dimension of an array: ");
        try {
            size = scan.nextInt();
            return size;
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        return size;
    }

    public static void main(String[] args) {

        int size = sizeOfArray();
        int[] arr = new int[size];

        ArrayRotate.insertData(arr);
        ArrayRotate.print(arr);

        //MergeSort array = new MergeSort();

        //sorting.MergeSort array = new sorting.MergeSort();
        /*MergeSort array = new MergeSort();
        array.sort(arr);*/

        /*BubbleSort array = new BubbleSort();
        array.bubbleSort(arr);*/

        QuickSort array = new QuickSort();
        array.sort(arr);
        ArrayRotate.print(arr);


    }
}
