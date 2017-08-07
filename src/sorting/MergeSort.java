package sorting;

/**
 * Created by kjangade on 8/2/2017.
 */
public class MergeSort {
    /*public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void sort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    public static void merge(int[] arr, int l, int m, int r) {

        int[] tmp = new int[arr.length];

        for (int i = 0; i < r; i++)
            tmp[i] = arr[i];

        int left = l;
        int right = m + 1;
        int middle = l;

        while (left <= m && right <= r) {
            if (tmp[left] <= tmp[right]) {
                arr[middle] = tmp[left];
                left++;

            } else {
                arr[middle] = tmp[right];
                right++;
            }
            middle++;
        }

        int remaining = middle - left;
        for (int i = 0; i <= remaining; i++) {
            arr[middle + i] = tmp[left + i];
        }
    }*/

    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    public static void sort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    public static void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            //array[current] = (helper[helperLeft] <= helper[helperRight]) ? helper[helperLeft++] : helper[helperRight++];

            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;

            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}
