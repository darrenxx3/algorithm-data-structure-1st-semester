package id.web.Darren;

import java.util.Scanner;

public class Prak2_1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Angka Pertama: ");
		int angka1 = scan.nextInt();
		System.out.println("Angka Kedua: ");
		int angka2 = scan.nextInt();
		
		int hasil = angka1 + angka2 ;
		
		System.out.printf("Hasil %d + %d = %d", angka1, angka2, hasil);	
		
		scan.close();

	}

}
