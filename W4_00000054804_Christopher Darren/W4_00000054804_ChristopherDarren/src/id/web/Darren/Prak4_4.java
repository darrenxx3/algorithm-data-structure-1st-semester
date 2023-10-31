package id.web.Darren;
import java.util.Scanner; //import java
public class Prak4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner segitiga = new Scanner(System.in);
         System.out.println("=== SEGITIGA ===");
         System.out.print("Masukkan Tinggi Setengah Segitiga Segitiga = ");
         int x = segitiga.nextInt();
         
         for(int i = 1; i <= x*2; i++){
             if(i % 2 != 0){
                 for(int j = x*2; j >= i; j--){
                     System.out.print(" ");
                 }
                 for(int k = 1; k <= i; k++){
                     System.out.print("*");
                 }
                 System.out.println();
                 
                 
                 segitiga.close();
             }
         }

	}

}
