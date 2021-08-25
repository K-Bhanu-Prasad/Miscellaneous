package Stack;

public class Main {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(18);
		stack.push(1);
		stack.push(8);
		stack.show();

		System.out.println("-----------------------");
		stack.pop();
		stack.show();

		System.out.println("-----------------------");
		stack.push(89);
		System.out.println("-----------------------");
		stack.show();

	}

}
