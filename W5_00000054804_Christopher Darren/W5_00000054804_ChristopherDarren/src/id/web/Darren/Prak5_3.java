package id.web.Darren;
import java.util.Scanner;
public class Prak5_3 {
	public static int faktorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return(n * faktorial(n-1));
		}
	}
	public static void kombinasi(int n, int m) {
		int kombinasi = faktorial(n) / (faktorial(n - m) * faktorial(m));
		System.out.printf("\nJumlah kombinasi warna yang mungkin adalah =  %d", kombinasi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int m = 2;
		System.out.println("input angka:  ");
		System.out.println("Jumlah Warna: ");
		n = scan.nextInt();
		
		int x = faktorial(n);
		System.out.printf("Hasil faktorial dari %d  adalah %d", n,x);
		
		kombinasi(n,m);
	}

}
