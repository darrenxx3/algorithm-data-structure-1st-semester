package CDARREN_00000054804_IS103AL;
import java.util.Scanner;

public class No3 {
	int ukuran;
	 static Node head;
	 static Node tail;

	 No3() {
	  this.ukuran = 0;

	 }

	 static class Node {
	  int top;
	  Node next;

	  Node(int top) {
	   this.top = top;
	  }

	  public void READDATA() {
	   System.out.print("Gula  " + top);
	   System.out.println();
	  }
	 }

	 public boolean isEmpty() {
	  if (head == null) {
	   return true;
	  } else {
	   return false;
	  }
	 }

	 public void enqueueing(int top) {
	  Node new_Node = new Node(top);

	  if (head == null) {
	   head = new_Node;
	  } else {
	   Node last = head;
	   while (last.next != null)
	    last = last.next;
	   last.next = new_Node;
	   tail = new_Node;
	  }
	 }

	 int dequeue() {
	  int dequeueValue = head.top;
	  head = head.next;

	  return dequeueValue;
	 }

	 public void HASIL() {
	  if (head == null)
	   System.out.println("Tidak ada stock gula");
	  else {
	   System.out.println("List gula saat ini");
	   System.out.println("==================");
	   for (Node a = head; a != null; a = a.next)
	    a.READDATA();

	  }
	 }

	 public static void main(String[] args) {
	  No3 dequeue1 = new No3();
	  Scanner scan = new Scanner(System.in);
	  int pilihandata;
	  boolean abort = false;

	  do {
	   do {
	    System.out.println("Selamat Datang di Program Tracking Gula");
	    System.out.println("========================================");
	    System.out.println("Program ini menggunakan tanggal gula");
	    System.out.println(" masuk ke warehouse sebagai penanda");
	    System.out.println();
	    System.out.println("Menu");
	    System.out.println("1. Tambah Gula Masuk ke warehouse");
	    System.out.println("2. Hapus Gula Keluar dari warehouse");
	    System.out.println("3. Keluar");
	    System.out.print("Pilihan: ");
	    pilihandata = scan.nextInt();
	   } while (pilihandata < 1 && pilihandata > 3);
	   if (pilihandata == 1) {
	    System.out.println();
	    System.out.println("Masukan Tanggal Gula masuk ke warehouse (DDMMYY)");
	    int gula = scan.nextInt();
	    dequeue1.enqueueing(gula);
	    dequeue1.HASIL();

	   } else if (pilihandata == 2) {
	    int datayangada = dequeue1.dequeue();
	    System.out.printf("Gula yang masuk tanggal %d sudah terjual\n", datayangada);
	   } else if (pilihandata == 3) {
	    abort = true;
	   }
	  } while (abort == false);
	  System.out.println("Terima Kasih!!!");
	  scan.close();
	 }
	
}
