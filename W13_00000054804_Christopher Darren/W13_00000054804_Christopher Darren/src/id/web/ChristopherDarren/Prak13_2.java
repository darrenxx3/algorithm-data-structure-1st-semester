package id.web.ChristopherDarren;
// Queue

 class Prak13_2 {
	static final int MAX = 1000;
	int front, rear, size;
	int array[] = new int[MAX];
	
	public Prak13_2(){
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	boolean isFull(Prak13_2 queue) { //shortcut dari else if
		return(queue.size == MAX - 1);
	}
	
	boolean isEmpty(Prak13_2 queue) {
		return (queue.size == 0);
	}
	
	void enqueue(int item) {
		if(isFull(this))
			return;
		this.rear = this.rear + 1;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}
	
	int dequeue() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = this.front + 1;
		this.size = this.size - 1;
		return item;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prak13_2 queue = new Prak13_2();
		queue.enqueue(10); //supaya muncul nanti pas di run
		queue.enqueue(20);//yg muncul front adalah ini
		queue.enqueue(30);
		queue.enqueue(40);// yang muncul rear adalah ini
		
		System.out.println(queue.dequeue() + " dequeued from queue\n");// supaya dikeluarkan dari queue
		System.out.println("Front item is " + queue.array[queue.front]);
		System.out.println("Rear item is " + queue.array[queue.rear]);
	}

}
