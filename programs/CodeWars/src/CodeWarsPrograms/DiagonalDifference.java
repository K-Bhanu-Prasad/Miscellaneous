package CodeWarsPrograms;

import java.util.Arrays;
import java.util.List;

/**
 * Given a square matrix of size n, calculate the absolute difference between the sums of its diagonals.
 * Sample Input
 *
 * 3
 * 11 2  4
 * 4  5  6
 * 10 8 -12
 * Sample Output
 *
 * 15
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        int diff = diagonalDifference(Arrays.asList(Arrays.asList(11,2,4),Arrays.asList(4,5,6),Arrays.asList(10,8,-12)));
        System.out.println(diff);
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonal1= 0;
        int diagonal2=0;
        for(int i=0,j=arr.size()-1; i<arr.size(); i++,j--){
            diagonal1+=arr.get(i).get(i);
            diagonal2+=arr.get(i).get(j);
        }
        return Math.abs(diagonal1-diagonal2);
    }

}
