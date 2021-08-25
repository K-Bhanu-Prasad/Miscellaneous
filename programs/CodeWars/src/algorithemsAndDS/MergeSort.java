package algorithemsAndDS;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{19, -0, 78, 0, 28, -33};
        mergeSort(array, 0, array.length);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void mergeSort(int[] array, int start, int end) {
        if(end - start < 2){
            return;
        }

        int mid = (start+end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] input, int start,int mid, int end) {

        if(input[mid-1]<=input[mid]){
            return;
        }
        int i =start, j= mid, tempIndex=0;
        int[] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempIndex++] = input[i]<input[j]? input[i++]: input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
