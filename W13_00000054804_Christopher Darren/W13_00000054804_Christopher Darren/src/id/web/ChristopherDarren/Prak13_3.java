package id.web.ChristopherDarren;
//Stack Singly Linked list

public class Prak13_3 {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	boolean isEmpty() { //kalau empty maka tidak akan diisi
		return(head == null);
	}
	
	void push(int data) { // memasukkan data
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " pushed to stack");
	}
	
	public int pop() {
		if(head == null) {
			System.out.println(" Stack is Empty");
			return -1;
		}else {
			int popped = head.data;
			head = head.next;
			return popped;
		}
	}
	
	public int peek() {
		if(head == null) {
			System.out.println(" Stack is Empty");
			return -1;
		}else {
			return head.data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prak13_3 stackedll = new Prak13_3();
		
		stackedll.push(10);
		stackedll.push(20);
		stackedll.push(30);
		
		System.out.println(stackedll.pop() + " Popped from stack");
	}

}
