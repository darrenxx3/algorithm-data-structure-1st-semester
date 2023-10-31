package id.web.ChristopherDarren;
import java.util.Scanner;

public class Prak14 {
	int size;
	Node head, tail;
	
	Prak14(){
		this.size = 0;
	}
	
	static class Node{
		int top;
		Node next;
		Node(int top){
			this.top = top;
		}
		
		public void read() {
			System.out.print(top + " ");
		}
	}
	
	public boolean ISEMPTY() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void PUSH(int top) {
		Node newNODE = new Node(top);
		
		if(head == null) {
			head = newNODE;
		}else {
			Node temp = head;
			head = newNODE;
			newNODE.next = temp;
		}
	}
	
	public int POP() {
		if(head == null) {
			System.out.println("Stok kosong");
			return -1;
		}else {
			int popped = head.top;
			head = head.next;
			return popped;
		}
	}
	
	public void ENQUEUE(int top) {
		Node newNODE = new Node(top);
		
		if(head == null) {
			head = newNODE;
		}else {
			Node last = head;
			while(last.next!= null)
				last = last.next;
			tail = newNODE;
		}
	}
	
	int DEQUEUE() {
		int DEQUEUEValue = head.top;
		head = head.next;
		return DEQUEUEValue;
	}
	
	public void VIEW() {
		if(head == null) {
			System.out.println("Stok Kosong");
		}else {
			for(Node A = head; A!= null; A = A.next) A.read();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Prak14 QUERY = new Prak14();
		System.out.print("Silahkan pilih menu dibawah ini :\n"
				+ "1. Stack\n"
				+ "2. Queues\n"
				+ "3. Exit\n"
				+ "Pilihan Anda :");
		int choice = scan.nextInt();
		int menu = 0;
		
		switch(choice) {
		case 1:
			while(menu!= 3) {
				System.out.print("\n"
								+ "Silahkan pilih menu dibawah ini : \n"
								+ "1. Insert data \n"
								+ "2. Remove data \n"
								+ "3. Kembali ke menu awal \n"
								+ "Pilihan :  ");
				
				menu = scan.nextInt();
				if(menu == 1) {
					System.out.print("\n");
					System.out.print("Masukkan angka : ");
					int number = scan.nextInt();
					QUERY.PUSH(number);
					QUERY.VIEW();
				}else if(menu == 2) {
					QUERY.POP();
					QUERY.VIEW();
				}else if(menu == 3) {
					main(args);
				}else {
					System.out.println("Pilihan yang Anda pilih salah\n");
				}
				System.out.println();
			}
			break;
		case 2:
			while(menu!= 3) {
				System.out.print("\n"
								 + " Silahkan pilih menu dibawah ini : \n"
								 + "1. Insert data\n"
								 + "2. Remove data\n"
								 + "3. Kembali ke menu awal\n"
								 + "Pilihan :  ");
				menu = scan.nextInt();
				if(menu == 1) {
					System.out.print("\n");
					System.out.print("Masukkan angka : ");
					int number = scan.nextInt();
					QUERY.ENQUEUE(number);
					QUERY.VIEW();
					
				}else if(menu == 2) {
					QUERY.DEQUEUE();
					QUERY.VIEW();
				}else if(menu == 3) {
					main(args);
				}else {
					System.out.println("Pilihan yang Anda pilih salah\n");
				}
				System.out.println("");
			}
			break;
		case 3:
			System.exit(1);
			break;
		default:
			System.out.println("Pilihan tidak terdaftar\n");
			break;
		}
	}

}
