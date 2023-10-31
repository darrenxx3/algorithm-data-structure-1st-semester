package id.web.Darren;
import java.util.Scanner;
public class Prak3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input angka :  ");
		int angka = scan.nextInt();
		System.out.print("input angka2:  ");
		int angka2 = scan.nextInt();
		
		int hasil = 0;
		if(angka < 25) {
			hasil = 25 - angka;
			System.out.printf("Hasil  = %d\n", hasil);
			
		}
	}

}
