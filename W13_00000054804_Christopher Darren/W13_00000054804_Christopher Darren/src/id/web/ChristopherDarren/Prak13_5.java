package id.web.ChristopherDarren;
import java.util.Scanner;

public class Prak13_5 {
	int size;
	
	static Benda head; //tanpa harus membuat class.
	static Benda tail;
	
	Prak13_5(){
		this.size = 0;
	}
	
	static class Benda{ // di call dulu supaya vbosa dijalankan
		String data;
		Benda next;
		
		Benda(String data){
			this.data = data;
		}
	}
	
	void enqueue(String newData) {
		Benda newBenda = new Benda(newData);
		if(head == null) {
			head = newBenda;
			return;
		}
		Benda end = head;
		while(end.next != null)
			end = end.next;
		end.next = newBenda;
		return;
	}
	String dequeue() {
		String dequeueBenda = head.data;
		head = head.next;
		return dequeueBenda;
	}
	
	static void printLIST() { //membuat void 
		Benda benda = head;
		System.out.println("-------DATA GUDANG-------");
		System.out.println("Nama Barang");
		if(benda == null)
			System.out.println("#Barang Gudang Kosong#");
		while(benda != null) {
			System.out.println("- " + benda.data);
			benda = benda.next;
		}
	}
	
	public static void main(String[] args) {
		Prak13_5 gudang = new Prak13_5();
		Scanner scanning = new Scanner(System.in);
		System.out.println("PROGRAM GUDANG Singly Linked List Queue oleh Christopher Darren");
		printLIST();
		
		boolean REPEAT;
		
		while(REPEAT = true) {
			System.out.println("Menu :  ");
			System.out.println("1. Tambahkan barang\n2. Keluarkan barang\n3. List Barang\n4. Keluar");
			System.out.println("Pilihan :  ");
			int pilihan = scanning.nextInt();
			if(pilihan == 1) {
				System.out.print("Masukkan nama barang masuk :   ");
				String Namabenda = scanning.next();
				gudang.enqueue(Namabenda);
			}else if (pilihan == 2) {
			System.out.println("Barang keluar :  " + gudang.dequeue());
			
			}else if (pilihan == 3) {
				printLIST();
				System.out.println("Barang terawal masuk  "  + head.data);
				System.out.println("Barang terakhir masuk  "  + tail.data);
			}else if (pilihan == 4) {
				REPEAT = false;
				break;
			}
}
		System.out.println("Terima kasih telah menggunakan Program Gudang oleh Christopher Darren");
}
}
// hasilnay tidak keluar karena kita tidak mengambil data dari yang akan dimasukkan speerti .txt