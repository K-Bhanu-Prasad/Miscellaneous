package CodeWarsPrograms;

import java.util.Arrays;

/**
 * Given five positive integers, find the minimum and maximum values
 * that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * For example arr =[ 1,3,4,5,7,8], minimumSum = 1+3+4+5+7 = 20, maximumSum = 3+4+5+7+8 = 27
 * output
 * ==========
 * 20 27
 */
public class MinMaxSum {
    public static void main(String[] args) {
        miniMaxSum(new int[] {256741038, 623958417 ,467905213, 714532089 ,  938071625});
    }
    static void miniMaxSum(int[] arr) {

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        long sum = Arrays.stream(arr).mapToLong(val ->(long) val).sum();
        System.out.println((sum-max)+" "+ (sum-min));

    }
}
