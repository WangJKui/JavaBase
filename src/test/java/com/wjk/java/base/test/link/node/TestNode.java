package com.wjk.java.base.test.link.node;

class Node {

	private String data;
	private Node next;
	
	
	public Node(String data) {
		super();
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

public class TestNode{
	public static void main(String[] args) {
		
		Node n1 = new Node("A");
		Node n2 = new Node("B");
		Node n3 = new Node("C");
		Node n4 = new Node("D");

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		print(n1);
	}
	
	public static void print(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.getData());
		
		print(node.getNext());
	}
}
