package unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread t = new Thread(MethodReferenceExample1::process);
		// similar to ()->process()
		t.start();

	}

	public static void process() {
		System.out.println("In process");
	}
}
