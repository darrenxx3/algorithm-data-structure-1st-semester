package id.web.Darren;

import java.util.Scanner;

public class Prak2_2 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("angka masuk: ");
		int num1 = scan.nextInt();
		
		String hexadecimal = Integer.toHexString(num1);
		System.out.printf("Hexadecimal dari %d: %S", num1, hexadecimal);
		
		scan.close();
		
		
	}

}
