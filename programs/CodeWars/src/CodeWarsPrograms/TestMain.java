package CodeWarsPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;


public class TestMain {

	public static void main(String[] args) {
		int[] arr= {3,3,3,3,3};
		System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));

		System.out.println("**********");
		int[] ar = new int[]{4, 444,9};
		int[] arrr = (IntStream.rangeClosed(0, ar.length-1).map(i -> ar[ar.length-1-i]).toArray());
		Arrays.stream(arrr).forEach(System.out::println);
		System.out.println("==============");

	}

	static void miniMaxSum(int[] arr) {
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		int sum = Arrays.stream(arr).sum();
		System.out.println((sum-max)+" "+(sum-min));

	}
	 public static int findEvenIndex(int[] arr) {
	    int sum =0;

	    int size = arr.length;
	    for(int index =0; index<arr.length;index++){
	      int leftSum = sumOfArray(Arrays.copyOfRange(arr, 0, index));
	      int rightSum = sumOfArray(Arrays.copyOfRange(arr, index+1, size));
	      if(leftSum==rightSum) return index;
	    }
	    return -1;
	  }
	  public static int sumOfArray(int[] arr){
	    return Arrays.stream(arr).sum();
	  }



}
