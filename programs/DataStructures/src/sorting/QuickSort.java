package algorithemsAndDS;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, -9, 0 ,29, -44};
        quickSort(arr, 0, arr.length);

        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void quickSort(int[] arr, int start, int end) {
        if(end - start < 2) return;
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex+1, end);


    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start, j= end;
        while(i<j){

            while(i<j && arr[--j] >= pivot);
            if(i<j) arr[i]= arr[j];

            while(i<j && arr[++i] <= pivot);
            if(i<j) arr[j] = arr[i];
        }
        arr[j] = pivot;
        return j;
    }
}
