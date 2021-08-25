package CodeWarsPrograms;

/**
Find all Special strings in a string

A string is said to be a special string if either of two conditions is met:
All of the characters are the same, e.g. aaa.
All characters except the middle one are the same, e.g. aadaa.

eg:
asasd - {a,asa, s, sas, a, s, d}

 */
import java.util.ArrayList;
import java.util.List;

public class SpecialString {

	public static void main(String[] args) {
		System.out.println(substrCount(5,"asasd"));

	}

	// Complete the substrCount function below.
    static long substrCount(int n, String s) {

    	List<String> list = new ArrayList<>();
    	for(int i=0; i<n; i++) {
    		for(int j=i+1; j<=n; j++) {
    			String str = s.substring(i,j);
    			if(checkStr(str,str.length())) list.add(str);

    		}
    	}
    	return list.size();

    }

	private static boolean checkStr(String ss, int length) {
		if(length == 1) return true;

		char ch = ss.charAt(0);
		int midIndex = length/2;
		if(length%2!=0 && (ss.charAt(midIndex)!=ch))  ss = ss.substring(0, midIndex).concat(ss.substring(midIndex+1, length));
		for(int i =0; i< ss.length(); i++) {
			if(ch!=ss.charAt(i)) return false;
		}
		return true;
	}


}
