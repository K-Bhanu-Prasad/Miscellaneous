package CodeWarsPrograms;
/**
 * Sherlock considers a string to be valid if all characters of the string appear the same number of times.
 * It is also valid if he can remove just  character at  index in the string,
 * and the remaining characters will occur the same number of times. Given a string ,
 * determine if it is valid. If so, return YES, otherwise return NO.
 *
 * example:
 * input- aabbcd
 * output - NO
 *
 * input- aabbccddeefghi
 * output - NO
 *
 * input - abcdefghhgfedecba
 * output - YES
 *
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SherlockAndValidString {
    public static void main(String[] args) {

        System.out.println(isValid("ababccc"));
    }

    public static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1 );
            else map.put(ch, 1);
        }

        Map<Integer, Integer> finalMap = new HashMap<>();


        map.forEach((key, value) -> {
        	if(finalMap.containsKey(value)) finalMap.put(value,finalMap.get(value)+1 );
            else finalMap.put(value, 1);

        });

        if(finalMap.size() ==1) return "YES";
        else if(finalMap.size() ==2) {
        	Iterator<Map.Entry<Integer, Integer>> iterator = finalMap.entrySet().iterator();

        	Entry<Integer, Integer> it = iterator.next();

        	int first = it.getKey();
        	int firstValue = it.getValue();
        	it = iterator.next();

        	int second = it.getKey();
        	int secondValue = it.getValue();


        	if(firstValue ==1 || secondValue ==1) {

        		if((firstValue ==1) && (first ==1 || first-second ==1)) return "YES";
        		if((secondValue ==1) && (second ==1 || second-first==1)) return "YES";
        	}

        }
        return "NO";
    }

}
