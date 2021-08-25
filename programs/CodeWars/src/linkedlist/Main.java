package linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(2);
		list.insert(-1);
		list.insert(90);
		list.insert(67);
		list.insert(5);
		list.insert(89);
		list.insert(645);
		list.insert(89);
		list.insert(47);
		list.show();

		System.out.println("********************************************");
		list.insertAtStart(88);
		System.out.println("Inserted 88 at starting");
		list.show();

		System.out.println("********************************************");
		list.insetAt(0, 77);
		System.out.println("Inserted 77 at index 0");
		list.show();

		System.out.println("********************************************");
		list.delete(2);
		System.out.println("Deleted element at index 2");
		list.show();

		System.out.println("********************************************");
		System.out.print("Middle element is: ");
		list.printMiddleElement();

		System.out.println("********************************************");
		System.out.print("3rd element from last is: ");
		list.printNthNodeFromLast(3);

		System.out.println("********************************************");
		System.out.print("Element at index 3 is: ");
		list.printNthNodeFromFirst(3);
		list.show();

		System.out.println("********************************************");
		System.out.println("Deleted first occurrence of element 89 ");
		list.deleteElement(89);
		list.show();
	}

}
