package CodeWarsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseNotation {

	public static void main(String arg[]) {
		List<String> list = new ArrayList<>();
		List<String> newList = list;

		list.add("abc");
		list.add("dkd");
		list.add("dlkf");
		list.add("lkgf");
		for(int i =0; i< list.size(); i++) {
			if(list.get(i).equals("dkd")) {
				newList.remove(i);

			}
		}
		if("$".matches("[-+*\\/]")) System.err.println("hai");
		System.out.println(newList);
	}
}
