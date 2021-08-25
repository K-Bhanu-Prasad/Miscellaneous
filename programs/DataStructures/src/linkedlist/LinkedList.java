package linkedlist;

public class LinkedList {

    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void show() {
        Node n = head;
		System.out.print("LIST: ");
        while (n != null) {
            System.out.print(n.data+",");
            n = n.next;
        }
		System.out.println();

    }

    public void insertAtStart(int data) {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }

    public void insetAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }

    // delete element at given index
    public void delete(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }

    // Delete element at first occurance
    public boolean deleteElement(int data) {
        boolean found = false;
        if (head == null) {
            return found;
        }
        if (head.data == data) {
            head = head.next;
            found = true;
        } else {

            Node parent = head;
            Node child = head.next;
            while (child != null) {
                if (child.data == data) {
                    parent.next = child.next;
                    found = true;
                    break;
                }

                parent = child;
                child = child.next;
            }
        }
        return found;
    }

    public void printMiddleElement(){
		Node slowPtr = head;
		Node fastPtr = head;
		if(head !=null){
			while(fastPtr != null && fastPtr.next != null){
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next.next;
			}
			System.out.println(slowPtr.data);
		}


	}

	public void printNthNodeFromFirst(int index){
    	Node temp = head;
    	int count =0;
    	while(temp!=null){
    		if(count == index) {
				System.out.println(temp.data);
				return;
			}
    		count++;
    		temp = temp.next;
		}
	}
	public void printNthNodeFromLast(int nodeFromLast){
		if(head != null){
			Node mainPtr = head;
			Node refPtr = head;
			int count = 0;
			while(count <nodeFromLast && refPtr!=null){
				refPtr = refPtr.next;
				count++;
			}

			while(refPtr!=null){
				refPtr= refPtr.next;
				mainPtr = mainPtr.next;
			}
			System.out.println(mainPtr.data);
		}
	}
}