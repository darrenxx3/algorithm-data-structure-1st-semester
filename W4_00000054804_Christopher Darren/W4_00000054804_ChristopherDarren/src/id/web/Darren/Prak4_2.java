package id.web.Darren;
import java.util.Scanner;
public class Prak4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Menghitung Rata Rata\n");
		System.out.print("Masukkan bilangan bulat :  ");
		Scanner angka = new Scanner(System.in);
		int a,n;   //a adalah batas untuk looping , n adalah untuk pertambahan ++
		int total = 0;
		a = angka.nextInt();
		
		for(n = 1 ; n <= a ; n++) {
			System.out.printf("\nNilai ke- %d = %d ", n,n);
			total = total + n;
			
			
			
		}
		System.out.printf("\nJumlah datanya adalah =  %d", total);
		float ratarata = (float) total / a;
		System.out.printf("\nNilai rata rata nya adalah = %f ", ratarata);		
		
		angka.close();
	}

}
