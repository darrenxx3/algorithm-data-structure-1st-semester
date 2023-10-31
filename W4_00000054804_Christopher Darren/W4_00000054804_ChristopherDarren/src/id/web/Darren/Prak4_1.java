package id.web.Darren;
import java.util.Scanner;
public class Prak4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A  = new Scanner(System.in);
		int n,i;
		
		System.out.print("Masukkan nilai = ");
		n = A.nextInt();
		
		for(i = 1 ; i <= n ; i++) {
			System.out.printf("\nNilai ke -%d = %d", i,i);
			
			A.close();
		}

	}

}
