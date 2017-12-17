package scrap;

import java.util.Arrays;

/**
 * Created by kjangade on 8/7/2017.
 */

public class TrappingRainWater {
    static int arr[] = new int[]{0, 1, 0, 2, 1, 0, 1, 1, 2, 1, 1, 1};

    public static int findMajorityElement(int[] arr) {
        int count = 0, i, majorityElement = 0;
        for (i = 0; i < arr.length - 1; i++) {
            if (count == 0)
                majorityElement = arr[i];
            if (arr[i] == majorityElement)
                count++;
            else
                count--;
        }
        count = 0;
        for (i = 0; i < arr.length - 1; i++)
            if (arr[i] == majorityElement)
                count++;
        if (count > (arr.length - 1) / 2)
            return majorityElement;
        return -1;
    }

    public static int majorityElement(int[] num) {
        if (num.length == 1) {
            return num[0];
        }

        Arrays.sort(num);
        return num[num.length / 2];
    }

    public static void main(String[] args) {
        //System.out.println("Trapped water is: " + findWater(arr.length));

        int val = findMajorityElement(arr);
        System.out.println(val);
    }

    static int findWater(int n) {
        int left[] = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int right[] = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        // Fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;
    }
}
