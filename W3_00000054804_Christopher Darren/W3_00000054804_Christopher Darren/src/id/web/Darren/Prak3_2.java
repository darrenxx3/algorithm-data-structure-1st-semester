package id.web.Darren;
import java.util.Scanner;

public class Prak3_2 {
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  System.out.print("Panjang : ");
			int panjang = scan.nextInt();
	        System.out.print("Lebar : ");
	        int lebar = scan.nextInt();
	        System.out.print("Tinggi : ");
	        int tinggi = scan.nextInt();
	        
	        int rumusPanjang = panjang * 100;
	        int rumusLebar = lebar * 100;
	        int rumusTinggi = tinggi * 100;
	        
	        int luasbangunan = rumusPanjang * rumusLebar * rumusTinggi;
	        
	        if (luasbangunan <= 100) {
	            System.out.printf("Volume balok : %d cm3\n", luasbangunan);
	            System.out.print("Balok ini termasuk kategori kecil");
	            
	        }else if (luasbangunan>100 && luasbangunan <=250) {
	            System.out.printf("Volume balok : %d cm3\n", luasbangunan);
	            System.out.print("Balok ini termasuk kategori sedang");
	        }else {
	            System.out.printf("Volume balok : %d cm3\n", luasbangunan);
	            System.out.print("Balok ini termasuk kategori besar");
		
		}
		
	}
}

			

