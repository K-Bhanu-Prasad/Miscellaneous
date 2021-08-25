package CodeWarsPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DirectionReduction {

	public static void main(String arg[]) {
		dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" });
	}

	public static String[] dirReduc(String[] arr) {

		List<String> list = new LinkedList<>(Arrays.asList(arr));
		Map<String, String> dirMap = new HashMap<>();
		dirMap.put("EAST", "WEST");
		dirMap.put("WEST", "EAST");
		dirMap.put("NORTH", "SOUTH");
		dirMap.put("SOUTH", "NORTH");

		for(int i = 0;  i<list.size()-1 ;) {
			if (check(dirMap, list, i)) {i = 0;}
			else {i++;}
		}

		System.out.println(list);
		return list.toArray(new String[0]);
	}


	public static boolean check(Map<String, String> dirMap, List<String> list, int i) {
		if (dirMap.get(list.get(i)).equals(list.get(i + 1))) {
			list.remove(i);
			list.remove(i);
			return true;
		} else {
			return false;
		}
	}
}
