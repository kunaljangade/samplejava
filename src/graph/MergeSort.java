package graph;

/**
 * Created by kjangade on 8/2/2017.
 */
public class MergeSort {
    public static void sort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            tmp[i] = arr[i];

        int leftHelper = left;
        int rightHelper = middle + 1;
        int current = left;

        while (leftHelper <= middle && rightHelper <= right) {
            /*if (tmp[leftHelper] <= tmp[rightHelper]) {
                arr[current] = tmp[leftHelper];
                leftHelper++;
            } else {
                arr[current] = tmp[rightHelper];
                rightHelper++;
            }*/

            arr[current] = (tmp[leftHelper] <= tmp[rightHelper]) ? tmp[leftHelper++] : tmp[rightHelper++];
            current++;
        }
        int remaining = middle - leftHelper;
        for (int i = 0; i <= remaining; i++)
            arr[current + i] = tmp[leftHelper + i];
    }
}
