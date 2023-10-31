package id.web.Darren;

import id.web.Darren.Prak12_3.Node; //untuk menandakan kita mengimport Node ,,bisa dihapus 

public class Prak12_3 {
	static Node head;
	
	static class Node{
		int angka;
		Node next;
		
		Node(int angka){
			this.angka = angka;
		}
	}
	
	public void printNode() {
		Node node = head;
		while(node != null) {
			System.out.print(node.angka + " ");
			node = node.next;
		}
	}
	
	public void insertNode(int newAngka) {
		// ini insert front....
		Node newNode = new Node(newAngka);
		newNode.next = head;
		
		head = newNode;
	}
	public static Node REVERSE(Node head) { //untuk reverse linked nanti
		Node Prev = null;
		Node head2 = head;
		Node Lanjut;
		
		while(head2 != null) {
			Lanjut = head2.next;
			head2.next = Prev;
			Prev = head2;
			head2 = Lanjut;
		}
		head = Prev;
		return Prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prak12_3 llist = new Prak12_3();
		
		//insert 3 data yang diperlukan
		llist.insertNode(21);
		llist.insertNode(31);
		llist.insertNode(12);
		llist.insertNode(7);
		llist.insertNode(25);
		System.out.print("Linked list:  ");
		llist.printNode(); //hasil program diatas menghasilkan angka urut 1 7 3 walaupun dalam penulisannya tidak berurutan.
		
		System.out.print("\nLinked list setelah di balik:  ");
		head = Prak12_3.REVERSE(head); //diubah ke static type
		llist.printNode();
	}
	
	
	}


