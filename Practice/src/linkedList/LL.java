package linkedList;

public class LL {

	Node head;
	private int size;
	
	class Node {
		String data;
		Node next;

		// constructor
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	// add first node in linkedList
	public void addFirst(String data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = newNode;
		}else {
			newNode.next=head;
			head = newNode;
		}
	}
	
	// add last node in LinkedList
	public void addLast(String data) {
		Node newNode = new Node(data);
		size++;
		if(head==null)
			head = newNode;
		else {
			Node curNode=head;
			while(curNode.next!=null) {
				curNode=curNode.next;
			}
			curNode.next=newNode;
		}
			
	}


	// print the Linked List
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + "--> ");
			currentNode = currentNode.next;
		}

	}
	
	// delete first Node
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
			size--;
			head=head.next;
		}
	
	// delete Last Node
	public void deleteLast() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		
		if(head.next==null) {
			head=null;
			return;
		}
			Node secondLastNode=head;
			Node lastNode = head.next;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
				secondLastNode=secondLastNode.next;
			}
			secondLastNode.next=null;
		
	}
	
	// print size of list
	public int sizeList() {
		return size;
	}
	
	
	// reverse the LinkedList
	public void reverseList() {
	       if(head == null || head.next == null) {
	           return;
	       }
	       Node prevNode = head;
	       Node currNode = head.next;
	       while(currNode != null) {
	           Node nextNode = currNode.next;
	           currNode.next = prevNode;
	           prevNode = currNode;
	           currNode = nextNode;
	       }
	       head.next = null;
	       head = prevNode;
	   }
	
//	public void next(Node current) {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL ll = new LL();
		ll.addFirst("List");
		ll.addFirst("Linked");
		ll.deleteFirst();
		ll.addLast("LastNode");
		ll.deleteLast();
		ll.addFirst("Linked");
		ll.printList();
		System.out.println(ll.sizeList());
		ll.reverseList();
		ll.printList();

System.out.println("Recursive Reverse implementation is pending");
	}

}
