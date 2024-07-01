package udemyJavaCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class InterviewBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 		TREE FOR DEPTH FIRST VALUES WITH ITERATIVE METHOD
		 *  	  10
		 * 		5   15
		 * 	  2  7
		 *  R = 10,5,2,7,15
		 * */ 
		Node root = new Node(10);
		Node node5 = new Node(5);
		Node node2 = new Node(2);
		Node node7 = new Node(7);
		Node node15 = new Node(15);
		root.left = node5;
		root.right = node15;
		node5.left = node2;
		node5.right = node7;
		
		//Object[] pathDFVIterative = BinaryTreeDFVIterative(root);
		//for (Object o: pathDFVIterative) {
		//	System.out.println(o);
		//}
		BinaryTreeDFVRecursive(root);
		
		
	}
	
	public static Object[] BinaryTreeDFVIterative(Node root) { // DEPTH FIRST VALUES ITERATIVE
		if (root == null) {
			return null;
		}
		Stack<Node> stack = new Stack<>();
		ArrayList<Integer> values = new ArrayList<>();
		stack.add(root); // ADD THE ROOT TO THE STACK
		while (!stack.isEmpty()) { // WHILE WE HAVE ITEMS ON STACK
			Node current = stack.pop(); // REMOVE THE HEAD
			values.add(current.value); // ADD TO VALUES LIST
			if (current.right != null) { // IF IT HAS RIGHT CHILD WE ADD IT TO STACK
				stack.add(current.right);
			}
			if (current.left != null) { // IF IT HAS LEFT CHILD WE ADD TO STACK
				stack.add(current.left);
			}	
		}
		return values.toArray();
	}
	
	public static void BinaryTreeDFVRecursive(Node root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.value);
			BinaryTreeDFVRecursive(root.left);
			BinaryTreeDFVRecursive(root.right);
		}
	
	}
}
class Node {
	
	public Node left;
	public Node right;
	public Node parent;
	public int value;

	public Node(int value) {
		this.left = null;
		this.right = null;
		this.parent = null;
		this.value = value;
	}
	
	public boolean isLeaf() { 
		if (this.left == null && this.right == null) {
			return true;
		} else {
			return false;
		}
	}
	
}	

