package CodeWarsPrograms;

public class GetReminder {

	public static void main(String arg[]) {
		System.out.println(getTime(86399));
	}

	private static String  getTime(int time) {

		String hrs = "00";
		String min = "00";
		String sec = "00";

		if(time<60) {
			sec = ternary(Integer.toString(time));
			return hrs+":"+min+":"+sec;
		}
		else if(time<3600){
			min = Integer.toString(divide(time,60));
			sec = Integer.toString(time%60);

			min = ternary(min);
			sec = ternary(sec);
			return hrs+":"+min+":"+sec;
		}else {
			hrs = Integer.toString(divide(time,3600));
			min = Integer.toString(divide(time%3600,60));
			sec = Integer.toString(time%3600%60);

			hrs = ternary(hrs);
			min = ternary(min);
			sec = ternary(sec);
			return hrs+":"+min+":"+sec;
		}

	}

	private static int divide (int time, int divide) {
		return time/divide;
	}
	private static String ternary(String time) {

		return time.length()==1? "0"+time: time+"";
	}
}
