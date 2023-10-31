package id.web.Darren;
import java.util.Scanner;
public class Prak7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Jumlah data yang diinput:  ");
		int data = scan.nextInt();
		
		String namaBarang[] = new String[data];
		int HargaBarang[] = new int[data];
		int diskonBarang[] = new int[data];
		float total[] = new float[data];
		
		for(int i =  0; i < data; i++) {
			int daata = i +1;
			System.out.printf("-----------------------------input barang %d-------------------------", daata);
			System.out.printf("\nMasukkan nama barang %d :  ", daata);
			namaBarang[i] = scan.next();
			System.out.printf("\nMasukkan nama barang %d :  ", daata);
			HargaBarang[i] = scan.nextInt();
			System.out.printf("\nMasukkan diskon barang %d :  ", daata);
			diskonBarang[i] = scan.nextInt();
			total[i] = HargaBarang[i] - (diskonBarang[i] * HargaBarang[i]/100);
			System.out.println();
			
		}
		System.out.print("No      Nama      Harga     Diskon   Total");
		System.out.print("\n----------------------------------------------");
		for(int i = 0; i < data; i++) {
			int order = i + 1;
			System.out.printf("\n%d      %s      %d        %d     %.2f",order,namaBarang[i], HargaBarang[i],diskonBarang[i], total[i]);
		}
		scan.close();
	}
	
}
