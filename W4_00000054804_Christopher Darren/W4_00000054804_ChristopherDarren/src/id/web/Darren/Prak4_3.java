package id.web.Darren;
import java.util.Scanner;
public class Prak4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Masukan banyak batasnya bilangan prima = ");
		Scanner scan = new Scanner(System.in);
		int batas = scan.nextInt();
		int total = 0;
		boolean prima; //True or false
		
		for(int angka = 2 ; angka <= batas ; angka++) {
			prima = true; //angka 2 betul dan dieksekusi
			for(int angka1 = 2 ; angka1 <= batas ; angka1++) {
				if(angka % angka1 == 0) {
					prima = false;
					break;
										
				}
						
		
	}
	if(prima == true) {	
		System.out.printf(angka + "   ");
		total = total + angka;
	}
		}
	System.out.printf("Hasil dari penjumlahan seluruhnya adalah = %d ", total);

	}
}

	 
