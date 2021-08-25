package CodeWarsPrograms;

public class ReverseOrRotate {

	public static void main(String arg[]) {
		System.out.println(revRot("123456987654", 6));
	}

	public static String revRot(String str, int sz) {
		if (str.equals("") || str.length() < sz || sz == 0)
			return "";
		int lastIndex = sz;
		StringBuilder finalResult = new StringBuilder("");
		for (int i = 0; i < str.length(); i += sz, lastIndex += sz) {
			if (str.length() >= lastIndex) {
				String chunk = str.substring(i, lastIndex);
				finalResult = finalResult.append(checkChunk(chunk));
			}
		}
		return finalResult.toString();
	}

	public static String checkChunk(String chunk) {
		int sum = 0;
		String result = "";

		for (int i = 0; i < chunk.length(); i++) {
			int rem = Integer.parseInt(chunk.substring(i, i + 1));
			sum += Math.pow(rem, 3);
		}
		if (sum % 2 == 0) {
			result = new StringBuilder(chunk + "").reverse().toString();
		} else {
			result = chunk + "";
			result = result.substring(1).concat(result.substring(0, 1));
		}
		return result;
	}
}
