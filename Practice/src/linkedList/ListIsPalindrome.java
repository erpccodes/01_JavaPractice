package linkedList;

import linkedList.LL.Node;

public class ListIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL ll=new LL();
		ll.addLast("1");
		ll.addLast("2");
		ll.addLast("3");
		ll.addLast("2");
		ll.addLast("1");

		System.out.println(isPalindrome(ll.head,ll));
	}
	
	
	 public static boolean isPalindrome(Node head, LL ll) {
	        
	       int size=ll.sizeList();
	    // reversing the second half
	    Node lastNode = reverseList(nextToMiddleNode(head,size));

	    // comparing the first and second half
	    while(lastNode!=null){
	        if(head.data!=lastNode.data)
	            return false;
	        head=head.next;
	        lastNode=lastNode.next;
	    }
	        return true;
	    }
	 
	 // function to reverse LinkedList
	    public static Node reverseList(Node head){
	        Node previous=null;
	        Node current= head;
	        while(current != null){
	          Node  next= current.next;
	            current.next = previous;
	        // updating the current and previous to iterate forward
	            previous = current;
	            current = next;
	        }
	        return previous;
	    }
	    
	    // function to find next node of the middle element
	    public static Node nextToMiddleNode(Node head,int size) {
	    	
	        int mid=0;
	        Node middle=head;
	        Node current=head;

	    // finding middle element
	        if(size%2==0){
	            mid=size/2;
	        }else
	            mid=size/2+1;

	    // iterating till middle node
	    for(int i=0;i<mid;i++){
	        middle=middle.next;
	    }
	    // returning next of the middle node
	    return middle;
	    }

}
