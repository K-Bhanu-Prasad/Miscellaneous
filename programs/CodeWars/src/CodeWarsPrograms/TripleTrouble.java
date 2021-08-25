package CodeWarsPrograms;

public class TripleTrouble {

	public static void main(String[] args) {
		System.out.println(TripleDouble(451999277,41177228L));

	}

	public static int TripleDouble(long num1, long num2)
	  {
		String string1= num1+"";
		String string2= num2+"";
		String tripleNo = "";
		for(int i=0; i<string1.length()-2; i++) {
			if(string1.charAt(i)== string1.charAt(i+1) && string1.charAt(i)== string1.charAt(i+2) ) {
				tripleNo = string1.charAt(i)+"";
				break;
			}
		}

		if(!tripleNo.isEmpty() && string2.contains(tripleNo+tripleNo)) {
			return 1;
		}
		else return 0;

		/* if ((num1 + "").matches(".*(\\d)\\1{2,}.*") && (num2 + "").matches(".*(\\d)\\1{1,}.*")) {
		      return 1;
		    } else {
		      return 0;
		    }
*/
	  }
}
