package id.web.Darren;
import java.util.Scanner;
public class Prak7_2 {
	public static int angkaterbesar(int[]angka) {
		int maks = angka[0];
		for(int i = 0 ; i < angka.length; i++) {
			if(angka[i] > maks) {
				maks = angka[i];
			}
		}
		return maks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Jumlah data:");
		int data = kb.nextInt();
		
		int angka[] = new int [data];
		for(int i = 0 ; i < angka.length; i++) {
			System.out.printf("Angka %d: ", i + 1);
			angka[i] = kb.nextInt();
		}
		int yahoo = angkaterbesar(angka);
		System.out.printf("Angka Terbesar : ", yahoo);		
		kb.close();
	}

}
