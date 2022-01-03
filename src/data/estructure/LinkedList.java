package data.estructure;

public class LinkedList {
	Node head; // head of the list 
	static class Node {
		int data; 
		Node next; 
		
		// constructor to create a new node
		// next is by default initialized
		// as null
		Node (int d){
			data =d;
			next = null; 
		}// constructor 
	}
	
	public void printList() {
		Node n = head; 
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// start with the empty list 
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second; 
		second.next = third;
		llist.printList();
		

	}

}
