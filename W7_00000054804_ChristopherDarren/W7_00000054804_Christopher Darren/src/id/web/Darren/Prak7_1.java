package id.web.Darren;
import java.util.Scanner;
public class Prak7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Jumlah angka dalam array :");
		int angka = scan.nextInt();
		
		int aaa[] = new int [angka];
		for(int i = 0 ; i < aaa.length ; i++) {
			int urut = i;
			
			System.out.printf("Angka %d : ", urut + 1);
			aaa[i] = scan.nextInt();
			urut = urut + 1;
			
		}
		for(int i = 0 ; 1 < aaa.length; i++) {
			System.out.print(aaa[i]+ " ");
		}
		int x = angka - 1;
		if(aaa[0] == 8 || aaa[x] ==8) {
			System.out.println("-> TRUE");
		}else {
			System.out.println("-> FALSE");
		}
		scan.close();
	}	
	
}
