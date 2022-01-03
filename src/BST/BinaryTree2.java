package BST;

//Java program to insert element in binary tree
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree2 {

	/* A binary tree node has key, pointer to
	left child and a pointer to right child */
	static class Node {
		int key;
		Node left, right;

		// constructor
		Node(int key)
		{
			this.key = key;
			left = null;
			right = null;
		}
	}
	static Node root;
	static Node temp = root;
	/*
	 * In order traversal
	 */
	static void inorder(Node temp) {
		if(temp == null) 
			return;
		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}
	
	static void deleteDeepest(Node root,Node delNode) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null;
		
		//Do level order traversal until last node
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if(temp== delNode) {
				temp = null;
				return;
			}
			if(temp.right!=null) {
				if(temp.right==delNode) {
					temp.right= null;
					return;
				}else {
					q.add(temp.right);
				}
			}
			if(temp.left !=null){
				if(temp.left==delNode) {
					temp.left = null;
					return;
				}else {
					q.add(temp.left);
				}
			}
		}
	}
	
	static void delete (Node root, int key) {
		if (root==null) {
			return;
		}
		if(root.left == null && 
				root.right==null) {
			if(root.key == key) {
				root = null; 
				return;
			}else {
				return;
			}
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null , keyNode =null;
		//do level order traversal until
		//we find key and last node
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if(temp.key == key)
				keyNode = temp;
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
		}
		if(keyNode != null)
			extracted(root, temp, keyNode);
		
	}

	private static void extracted(Node root, Node temp, Node keyNode) {
		{
			int x = temp.key;
			deleteDeepest(root, temp);
			keyNode.key = x;
		}
	}
	
	/*
	 * function to insert element
	 */
	static void insert (Node temp, int key) {
		if(temp == null) {
			root = new Node(key);
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		// Do level order traversal until we find
		// an empty place 
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp.left== null) {
				temp.left = new Node(key);
				break;
			}else {
				q.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = new Node (key);
				break;
			}else {
				q.add(temp.right);
			}
			
		}
	}

	
	// Driver code
	public static void main(String args[])
	{
		/*root = new Node(10);
		root.left  = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right= new Node(8);*/
		root = new Node(10);
		root.left  = new Node(11);
		root.left.left = new Node(7);
		root.left.right = new Node(12);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right= new Node(8);
		
		System.out.print("inorder traversal before insertion");
		inorder(root);
		int key = 11; 
		//insert(root,key);
		delete(root, key);
		System.out.print("\nInorder after insertion :" );
		inorder(root);
	}
}
//This code is contributed by Sumit Ghosh
