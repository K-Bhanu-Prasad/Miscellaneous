package CodeWarsPrograms;

/**
 * input n = 5
 * output (Right aligned triangle)
 *
 *          #
 *         ##
 *        ###
 *       ####
 *      #####
 */
public class StairCasePattern {
    public static void main(String[] args) {
        staircase(5);
    }
    static void staircase(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n; j++) {
                if(j<i)  System.out.print(" ");
                else System.out.print("#");
            }
            System.out.println();
        }
    }
}
