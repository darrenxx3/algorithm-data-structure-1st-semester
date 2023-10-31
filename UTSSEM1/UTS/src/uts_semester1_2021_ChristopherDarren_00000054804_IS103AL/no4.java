package uts_semester1_2021_ChristopherDarren_00000054804_IS103AL;
import java.util.Scanner;
public class no4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Berapa banyak baris angka yang anda ingin tampilkan: ");
		
		System.out.printf("====Menampilkan 5 baris angka====");
		int x = scan.nextInt();
		 do{
	        for (int i = x ; i>= 0; i--) {

	            x =5;
	            for (int j = i; j> 0; j--) {
	                System.out.print(x +" ");
	                x--;
	            }
	            System.out.println();
	        }
	    }while (false);
	        System.out.println();
	    scan.close();
	  }
	}


