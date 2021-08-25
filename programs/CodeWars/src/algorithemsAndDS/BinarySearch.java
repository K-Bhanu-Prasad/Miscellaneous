package algorithemsAndDS;

public class BinarySearch {

	public static void main(String[] args) {


		int[] arr = {10,11,12,13,14,15,16,70,80};
		System.out.println(binarySearch2(arr, 0, 7,90));
		//System.out.println(binarySearch1(arr,16));



	}

	private static int binarySearch1(int[] arr, int x) {

		System.out.println("binary search 1");
		int l=0, h=arr.length-1;
		int mid=(l+(h-l))/2;

		while(l<=h) {

			if(x==arr[mid])return mid;
			else if(x<arr[mid]) h= mid-1;
			else l=mid+1;
			mid=(l+h)/2;
		}
		return -1;
	}

	private static int binarySearch2(int[] arr, int l, int h, int x) {

		System.out.println("Binary search 2");

		if(l<=h) {

			int mid= (l+h)/2;
			if(x==arr[mid]) return mid;
			if(x< arr[mid]) return binarySearch2(arr, l, mid-1, x);
			return binarySearch2(arr, mid+1, h, x);
		}
		return -1;
	}



}
