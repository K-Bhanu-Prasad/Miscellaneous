package CodeWarsPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;

public class OddInArray {

	public static void main(String[] args) {

		int[] n= {4,4,4,7,4,4};
		System.out.println(stray(n));

	}

	static int stray(int[] numbers) {

		HashSet<Integer> set = new HashSet<>();

		int duplicate = -1;
		 for(int i=0; i<numbers.length; i++) {
			 if(!set.add(numbers[i])) {
				duplicate = numbers[i];
			 }

		 }
		 set.remove(duplicate);

		return  (int) set.iterator().next();
	  }
}
