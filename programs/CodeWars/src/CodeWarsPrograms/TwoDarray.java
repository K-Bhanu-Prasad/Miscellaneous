package CodeWarsPrograms;

import java.util.ArrayList;
import java.util.List;

public class TwoDarray {

	public static void main(String[] args) {
		 List<_2DArray> _2darray = new ArrayList<>();
		 int arrayLength = 6;
		 int mat[][] = {
						 { 1, 2, 3, 4, 5, 6 },
		                 { 5, 6, 7, 8, 9, 0 },
		                 { 1, 4, 5, 7, 2, 4 },
		                 { 9, 3, 9, 5, 1, 0 },
		                 { 0, 1, 0, 4, 2, 4 },
		                 { 6, 3, 4, 1, 0, 0 }
                 		};



			 for(int j=0; j<4; j++) {
				 for(int k=0; k<4; k++) {
					 System.out.println(mat[j][k]);
				 }



		 }
	}

	public class _2DArray {
	    int[][] array;
	    public _2DArray(int[][] initialArray){
	        array = initialArray;
	    }
	}

}

