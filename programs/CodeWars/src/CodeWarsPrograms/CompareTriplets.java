package CodeWarsPrograms;

import java.util.Arrays;
import java.util.List;

/**
 * Complete the function compareTriplets in the editor below.
 * It must return an array of two integers, the first being Alice's score and the second being Bob's.
 *
 *
 * Output Format
 *
 * Return an array of two integers denoting the respective comparison points earned by Alice and Bob.
 *
 * Sample Input
 *
 * 5 6 7
 * 3 6 10
 * Sample Output
 *
 * 1 1
 */
public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> result = compareTriplets(Arrays.asList(5,6,7),Arrays.asList(8,9,6));
        result.stream().forEach(System.out::println);
    }

   public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aWin=0, bWin=0;
        for(int i=0;i<a.size(); i++){
            if(a.get(i)>b.get(i)) aWin++;
            if(a.get(i)<b.get(i)) bWin++;
        }
        return Arrays.asList(aWin,bWin);
    }
}
