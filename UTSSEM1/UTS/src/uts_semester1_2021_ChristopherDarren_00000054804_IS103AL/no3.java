package uts_semester1_2021_ChristopherDarren_00000054804_IS103AL;
import java.util.Scanner;
public class no3 {
	public static int Fungsi_rekursif(int a, int b) {
        if (b == 0) {
               return 1;
            }
            else {
               return a * Fungsi_rekursif(a, b - 1);
            }
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("isi x : ");
        int a = scan.nextInt();

        System.out.print("isi y : ");
        int b = scan.nextInt();

           System.out.println("Jumlah x ^ y adalah " + Fungsi_rekursif (a,b));
           
           scan.close();
	
	}

}
