package CodeWarsPrograms;

public class CamelCaseString {

	public static void main(String[] args) {
		camelCase("dfklAdklffndf");

	}

	public static String camelCase(String str) {
		if(str.trim().isEmpty()) return "";
		String result = "";
		for (String ar : str.trim().split("\\s+")) {
			ar.trim().substring(0, 1).toUpperCase();
			result += ar.substring(0, 1).toUpperCase() + ar.substring(1);
		}
		return result;
	}
}
