package id.web.Darren;
import java.util.Scanner;
public class Prak5_5 {
	public static int perhitungan(int angka, int berdampingan) {
		if(angka == 0) {
			return 0;
		}else if (angka % 10 == 1) {
			return 1 + berdampingan + perhitungan(angka / 10, 1);			
		}else {
			return perhitungan(angka / 10, 0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Angka1:   ");
		int angka1 = scan.nextInt();
		System.out.print("Angka2:   ");
		int angka2 = scan.nextInt();
		System.out.print("Angka3:   ");
		int angka3 = scan.nextInt();
		
		System.out.print("Hasil = " + perhitungan(angka1,angka2));
	}

}
