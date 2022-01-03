package data.estructure;

public class LinkedList2 {
	Node head; // head of list
	
	//Linked list node
	class Node{
		int data; 
		Node next;
		Node(int d){
			data =d; 
			next = null; 
		}
	}
	void deleNode(int key) {
		//store head node 
		Node temp = head, prev = null; 
		
		//If head node itself holds the key
		// to be deleted
		if (temp !=  null && temp.data == key) {
			head = temp.next;
			// changed head
			return;
		}
		// search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while(temp != null && temp.data !=key) {
			prev = temp ; 
			temp = temp.next;
		}
		
		// if key was not present in linked list
		if(temp==null) {
			return;
		}
		
		//unlink the node form linked list 
		prev.next = temp.next;
		
		
		
	}
	
	public void push (int new_data) {
		// 1 & 2 allocate the node and put in the data
		Node new_node = new Node(new_data);
		// 3 make next of new Node as head
		new_node.next = head; 
		// 4move the head to point to new Node
		head = new_node;
	}
	/* Inserte a new node afteer the given prev_node*/
	public void insertAfter(Node prev_node, int new_data) {
		//check if the given node is null
		if(prev_node == null) {
			System.out.println("the given previus node cannot be  null");
			return;
		}
		// 2 y 3 allocate the node & put in the data 
		Node new_node = new Node(new_data);
		
		//4. make next of the new Node as next of prev_node
		new_node.next = prev_node.next;
		//5. make next of prev_node as new node
		prev_node.next = new_node;
		
	}
	//appends a new node at the end  This method is
	//defined inside linkedlist class showm above
	public void append(int new_data) {
		// 1. allocate the node
		// 2. put in the data
		// 3. set next as null
		Node new_node = new Node(new_data);
		// 4. if yhe linked list is empty then 
		//make the new node
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		//4 . This new node is going to be 
		// the last node so make of it as null
		
		// 5 else traverse until the last node 
		
		Node last = head; 
		while (last.next != null)
			last = last.next;
		// 6. Change the next of last node
		last.next = new_node;
		return;
	}
	
	/*This function print contents of linked list starting
	 * from the given node */
	public void printList() {
		Node tnode = head; 
		while(tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	/*Driver program to test above functions.
	 * Ideally this function should be in
	 * a separate user class It is kept here
	 * to keep code compact */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//starts with the empty list
		LinkedList2 llist = new LinkedList2();
		
		//insert 6. so linked list becomes 
		// 6-> NULLlist
		llist.append(6);
		
		//insert 7 at the beginning. So linked
		// list becomes 7 -> 6 ->NULLlist
		llist.push(7);
		
		//Insert 1 at the beginning. So linked
		//list becomes 1->7->6->NULL
		llist.push(1);
		
		//Insert 4 at the end. So linked list becomes
		// 1->7->6->4->NULLlist
		llist.append(4);
		
		//insert 8, after 7. so linked list
		//becomes 1->7->8->6->4->NULLlist
		
		//llist.insertAfter(llist.head.next, 8);
		
		System.out.println("\n created linked list is:");
		llist.printList();
		
		
		System.out.println("\n Delete node 1 :");
		llist.deleNode(4);
		llist.printList();
		
		
		
	}

}
