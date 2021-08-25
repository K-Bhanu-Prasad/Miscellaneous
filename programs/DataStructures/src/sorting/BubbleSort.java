package algorithemsAndDS;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		bubbleSort(new int[] {1,48,-3,0,8,-44});

	}

	private static void bubbleSort(int[] arr) {
		int length = arr.length;
		for(int i= length-1; i>0; i--) {

			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) swap(arr, j, j+1);
			}
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}


}
