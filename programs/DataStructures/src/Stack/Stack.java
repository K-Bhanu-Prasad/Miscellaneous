package Stack;

public class Stack {

	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {

		stack[top++] = data;
	}

	public int pop() {

		stack[--top] = 0;
		return 0;
	}
	public void show() {
		for(int n : stack) {
			System.out.println(n+" ");
		}
	}
}
