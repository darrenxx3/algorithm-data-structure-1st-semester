package id.web.Darren;
import java.util.Scanner;

public class Prak2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Berat Badan Ideal\n");
		System.out.print("Tinggi Badan = \n");
		double tinggi = scan.nextFloat();
		double persen = 0.1;
		double tinggicm = tinggi*100;
		double rumus = tinggicm - 100;
		
		double hasilberat = rumus - (persen * rumus);
		
		System.out.printf("Berat Badan = %.0f \n", hasilberat);
		System.out.print("kg");
		scan.close();
	}

}
