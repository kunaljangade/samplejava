package sorting;

/**
 * Created by kjangade on 8/3/2017.
 */
public class BubbleSort {
    public void bubbleSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                if(arr[j]>=arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
