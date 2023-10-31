package id.web.ChristopherDarren;
//Queue Singly LInked list

class Prak13_4 {
	int size;
	 Node head;
	 Node tail;
	
	Prak13_4(){
		this.size =0;
	}
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	// bedanya disini tidak menggunakan boolean
	void enqueue(int item) {
		Node newNode = new Node(item);
		if(head == null) {
			head = newNode;
			tail = head;
			return;		
		}
		System.out.println(item + " enqueued to queue");
		tail.next = newNode;
		tail = newNode;
		return;
		
	}
	
	
	int dequeue() {
		int dequeueValue = head.data;
		head = head.next;
		return dequeueValue;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prak13_4 queuelinked = new  Prak13_4();
		queuelinked.enqueue(10); // masih menggunakan ini
		queuelinked.enqueue(20);
		queuelinked.enqueue(30);
		queuelinked.enqueue(40);
		
		System.out.println(queuelinked.dequeue() + " dequeued from queue\n");
		System.out.println("Front item is " + queuelinked.head.data);
		System.out.println("Rear item is " + queuelinked.tail.data);
	}

}
