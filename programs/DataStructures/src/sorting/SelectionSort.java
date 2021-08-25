package algorithemsAndDS;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		 selectionSort2(new int[] {10,7,95,-3,0,7});

	}

	// Moving small element to first
	public static void selectionSort(int[] arr) {

		for(int i=0;i<arr.length-1; i++) {
			int minIndex=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) minIndex=j;
			}
			swap(arr, i, minIndex);
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

	// Moving large element to last
		public static void selectionSort2(int[] arr) {
			int lastUnsortedIndex = arr.length;
			for(int i= lastUnsortedIndex-1; i>0; i--) {
				int largest=0;
				for(int j=0; j<=i; j++) {
					if(arr[j]>arr[largest]) largest = j;
				}
				swap(arr, i, largest);
			}

			Arrays.stream(arr).forEach(System.out::print);
		}
	private static void swap(int[] arr, int i, int minIndex) {
		int temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;

	}

}
