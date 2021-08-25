package CodeWarsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * The goal of this exercise is to convert a string to a new string where each character
 *  in the new string is "(" if that character appears only once in the original string,
 *   or ")" if that character appears more than once in the original string.
 *   Ignore capitalization when determining if a character is a duplicate.
 *
 *  "din"      =>  "((("
	"recede"   =>  "()()()"
	"Success"  =>  ")())())"
	"(( @"     =>  "))(("


 * @author bkuraman
 *
 */
public class DuplicateEncoder {

	public static void main(String[] args) {
		System.out.println(encode("Success"));
	}

	static String encode( final String word){
		StringBuilder newString = new StringBuilder();
		word.chars().forEach(ch -> {
			char chr = (char) Character.toLowerCase(ch);
			String word2= word.toLowerCase();
			if(Character.toLowerCase(word2.indexOf((char)chr+""))== Character.toLowerCase(word2.lastIndexOf((char)chr+"")))
				newString.append("(");
			else
				newString.append(")");
		});
		return newString.toString();
	}
}
