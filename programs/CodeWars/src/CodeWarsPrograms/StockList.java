package CodeWarsPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z.
 * Each book has a code c of 3, 4, 5 or more capitals letters.
 * The 1st letter of a code is the capital letter of the book category.
 * In the bookseller's stocklist each code c is followed by a space and
 * by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.
 *
 *	L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"]
 *  M = ["A", "B", "C", "W"]
 *
 *  return (A : 20) - (B : 114) - (C : 50) - (W : 0)
 */
public class StockList {

	public static void main(String[] args) {

		String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
		String cd[] = new String[] {"A", "B", "R", "C"};
		stockSummary(art, cd);
	}

	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

		if(lstOfArt.length ==0 || lstOf1stLetter.length ==0) return "";
		Map<String,Integer> resultMap = new HashMap<>();
		Arrays.stream(lstOf1stLetter).forEach(lst -> {
			resultMap.put(lst, 0);
		});
		Arrays.stream(lstOfArt).forEach(lst -> {
			String key = lst.substring(0,1);
			if(Arrays.asList(lstOf1stLetter).contains(key)) {
				int sum = Integer.parseInt(lst.split(" ")[1]);
				sum +=resultMap.containsKey(key)?resultMap.get(key):0;
				resultMap.put(key, sum);
			}
		});

		StringBuilder finalResult = new StringBuilder("");
		for(Map.Entry<String, Integer> entry: resultMap.entrySet()) {
			finalResult=finalResult.append("("+entry.getKey()+" : "+entry.getValue()+") - ");
		}
		System.out.println(finalResult.substring(0, finalResult.lastIndexOf(")")+1));
		return finalResult.substring(0, finalResult.lastIndexOf(")")+1);
	}

}
