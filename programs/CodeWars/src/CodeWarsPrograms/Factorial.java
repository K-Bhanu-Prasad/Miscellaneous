package CodeWarsPrograms;

import java.math.BigInteger;
public class Factorial {

	public static void main(String arg[]) {
		//System.err.println(String.valueOf(Factorial(131)));
		String str = "123456";

		BigInteger bigInteger= new BigInteger(str);

		System.out.println(Factorial(bigInteger));


	}

	 public static BigInteger Factorial(BigInteger n) {
	    //return (n==1 || n==0)? new BigInteger("1"): Factorial(n-1).multiply(new BigInteger(String.valueOf(n)));

		if( n.equals(new BigInteger("0")) ||  n.equals(new BigInteger("1")))
			return new BigInteger("1");
		else{
			return Factorial(n.subtract(new BigInteger("1"))).multiply(new BigInteger(String.valueOf(n)));
		}
	  }
}
