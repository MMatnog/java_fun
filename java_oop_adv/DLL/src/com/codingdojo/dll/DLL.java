package com.codingdojo.dll;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		}
		
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	
	public void printValuesForward() {
		Node current = this.head;
		
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void printValuesReverse() {
		Node current = this.tail;
		
		while (current != this.head) {
			System.out.println(current.value);
			current = current.previous;
		}
		
		System.out.println(this.head.value);
	}
	
	public Node pop() {
		Node current = this.tail;
		Node previous = this.tail.previous;
		previous.next = null;
		current.previous = null;
		return current;
	}
	
	public boolean contains(Integer value) {
		Node current = this.head;
		
		while (current != null) {
			if (current.value == value) {
				return true;
			} else {
				current = current.next;
			}
		}
		
		return false;
	}
	
	public int size() {
		Node current = this.head;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertAt(Node newNode, int index) {
		if (index < this.size()-1) {
			Node current = this.head;
			
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			
			Node nextNode = current.next;
			current.next = newNode;
			newNode.next = nextNode;
			nextNode.previous = newNode;
		} else if (index == this.size() -1) {
			this.push(newNode);
		}
		
	}
	
	public void removeAt(Integer index) {
		if (index < this.size()-1) {
			Node current = this.head;
			
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			
			Node previousNode = current.previous;
			Node nextNode =  current.next;
			previousNode.next = nextNode;
			nextNode.previous = previousNode;
			current.next = null;
			current.previous = null;
			
		} else if (index == this.size()-1) {
			this.pop();
		}
	}
}
