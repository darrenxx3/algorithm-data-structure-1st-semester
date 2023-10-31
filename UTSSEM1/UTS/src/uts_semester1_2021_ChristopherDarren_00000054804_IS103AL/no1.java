package uts_semester1_2021_ChristopherDarren_00000054804_IS103AL;
import java.util.Scanner;
public class no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("========Program Menghitung Luas===============");
		System.out.println("Masukkan Angka untuk memilih jenis Perhitungan:");
		System.out.println("1.Persegi | 2. Segitiga  | 3. Trapesium");
		System.out.print("Pilihan Anda : ");
		
		int bentukbangunan = scan.nextInt();
		if(bentukbangunan==1) {
			System.out.print("\nAnda memilih : Hitung Luas Persegi");	
		}else if(bentukbangunan==2) {
			System.out.print("\nAnda memilih : Hitung Luas Segitiga");		
		}else if(bentukbangunan==3) {
			System.out.print("\nAnda memilih : Hitung Luas Trapesium");
		}
		else {
			System.out.print("Pilihan Anda Salah!");
		}
		if(bentukbangunan ==1) {
			  System.out.print("\nMasukan Sisi Pertama Persegi (cm) : ");
			  int sisi1 = scan.nextInt();
			  System.out.print("\nMasukan Sisi Kedua Persegi (cm)  : ");
			  int sisi2 = scan.nextInt();
			  int luas = sisi1*sisi2;
			  System.out.printf("\nLuas Persegi  Adalah : %d^cm",luas);
			  System.out.print("\n======================================");
			 
			 }else if (bentukbangunan==2) {
			  System.out.print("\nMasukan Alas Segitiga (cm)  : ");
			  int alas = scan.nextInt();
			  System.out.print("\nMasukan Tinggi (cm) : ");
			  int tinggi = scan.nextInt();
			  int luas = (alas*tinggi)/2;
			  System.out.printf("Luas Segitiga : %dcm^2",luas);
			  System.out.print("\n============================================");
			  
			 } else if (bentukbangunan==3) {
			  System.out.print("\nMasukan Sisi Bawah Trapesium (cm) :  ");
			  int SisiBawah = scan.nextInt();
			  System.out.print("\nMasukan Sisi Atas Trapesium (cm): ");
			  int SisiAtas = scan.nextInt();
			  System.out.print("\nMasukan tinggi (cm): ");
			  int tinggi = scan.nextInt();
			  int luas = ((SisiAtas + SisiBawah)*tinggi) / 2;
			  System.out.printf("luas Trapesium adalah : %dcm^2",luas);
			  System.out.print("\n=========================");
			 }
	scan.close();	
	}
	
}
