package id.web.Darren;
import java.util.Scanner;
public class Prak5_1 {
	public static int Penjumlahan(int bil_pertama, int bil_kedua) {
		int hasil = bil_pertama + bil_kedua;
		return hasil;
	}
	
	public static void main(String[] args) {  //main method
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Bilangan 1 :  ");
		int bil1 = scan.nextInt();
		System.out.print("Bilangan 2 :  ");
		int bil2 = scan.nextInt();   //void tidak mempunyai nilai balik
		
		int jumlah, kali;
		
		jumlah = Penjumlahan(bil1, bil2);
		System.out.println("Hasil penjumlahan adalah =  " + jumlah);
		Pengurangan(bil1 , bil2);
		kali = Prak5_1b.Perkalian(bil1, bil2);
		System.out.print("\nMenghasilkan angka: " + kali + "  Jika dikalikan\n");
		scan.close();
	}
		public static void Pengurangan(int bil_pertama, int bil_kedua) {
			int hasil = bil_pertama - bil_kedua;		
			System.out.print("Sedangnkan pengurangannya adalah: " + hasil);
	}

}
