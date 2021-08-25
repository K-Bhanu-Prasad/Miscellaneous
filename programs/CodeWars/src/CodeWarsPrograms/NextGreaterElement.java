package CodeWarsPrograms;

/**
 * Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.
 *
 * Examples:
 *
 * For any array, rightmost element always has next greater element as -1.
 * For an array which is sorted in decreasing order, all elements have next greater element as -1.
 * For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.
 * Element       NGE
 *    4      -->   5
 *    5      -->   25
 *    2      -->   25
 *    25     -->   -1
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {11, 12, 21, 3};
        printNGE(arr);
    }

    private static void printNGE(int[] arr) {
        int i =0, j=0;
        for(i =0 ; i< arr.length; i++){
            int result = -1;
            for(j = i+1; j< arr.length; j++){

                if(arr[j] > arr[i]){
                    result = arr[j];
                    break;
                }
            }

            System.out.println(arr[i]+ "---- "+ result);

        }
    }
}
