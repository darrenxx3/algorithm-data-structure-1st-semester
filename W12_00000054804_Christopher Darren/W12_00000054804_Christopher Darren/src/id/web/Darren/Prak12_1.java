package id.web.Darren;

public class Prak12_1 {
	Node head;
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prak12_1 llist = new Prak12_1();
		
		//insert 3 data yang diperlukan
		llist.insertNode(3);
		llist.insertNode(7);
		llist.insertNode(1);
		System.out.print("linked List: ");
		llist.printNode(); //hasil program diatas menghasilkan angka urut 1 7 3 walaupun dalam penulisannya tidak berurutan.
	}
	
	void deleteNode(int key) { //untuk mendelete data yang diinput 
		Node temp = head, prev = null;
		if(temp != null && temp.angka == key) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.angka != key) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) return;
		prev.next = temp.next;
	}

}
