package CodeWarsPrograms;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Given an array of integers, calculate the fractions of its elements that are
 * positive, negative, and are zeros.
 * Print the decimal value of each fraction on a new line.
 *
 * Given the array [1, 1, 0, -9, -2] there are 5 elements, two positive, two negative and one zero
 * Ratios would be 2/5 = 0.400000, 2/5 = 0.400000,  1/5 =0.200000
 *
 * output
 * =========
 * 0.400000
 * 0.400000
 * 0.200000
 */
public class PlusMinusFraction {
    public static void main(String[] args) {

        plusMinus(new int[]{2, 8,-4,-5,0,});
    }
    public static void plusMinus(int[] arr) {
        int[] result = new int[3];
        Arrays.stream(arr).forEach(num -> {
            if(num>0) result[0]++;
            else if(num<0) result[1]++;
            else result[2]++;
        });

        DecimalFormat df = new DecimalFormat("0.000000");
        Arrays.stream(result).forEach(data -> System.out.println(df.format((float)data/arr.length)));

    }
}
