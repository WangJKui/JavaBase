package com.wjk.java.base.test.link;

class Node{
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
	
	//======

	public void addNode(Node node) {

		if(this.next == null) {
			this.next = node;
		}else {
			this.next.addNode(node);
		}
	}

	public void printNode() {
		
		System.out.println(this.getData());
		
		if(this.next != null) {
			this.next.printNode();
		}		
	}
	
	
}


class Link {

	private Node root;
	
	public void add(String data) {
		
		Node node = new Node(data);
		
		if(this.root == null) {
			this.root = node;
		}else {
			this.root.addNode(node);
		}
	}
	
	public void print() {
		if(this.root != null) {
			this.root.printNode();
		}
		
	}
}

public class TestLink {

	public static void main(String[] args) {
		Link link = new Link(); 
		
		link.add("A");
		link.add("B");
		link.add("C");
		link.add("D");
		link.add("E");

		link.print();
	}
}
