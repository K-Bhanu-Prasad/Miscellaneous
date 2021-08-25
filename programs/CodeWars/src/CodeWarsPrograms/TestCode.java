package CodeWarsPrograms;

public class TestCode {
    public static void main(String[] args) {
        int a =1, b=0;
        //b = a++ + a++;            // a = 3, b=3
        //b = ++a + ++a;            //  a= 3, b=5
        //b = ++a + a++ + ++a;      //  a= 4 , b =8
        //b = ++a + a++ + a++;      //  a= 4, b= 7
        //b = a++ + ++a + ++a;      //  a= 4, b= 8
        b = a++ + ++a + --a + a--;  // a=1, b=8

        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
}
