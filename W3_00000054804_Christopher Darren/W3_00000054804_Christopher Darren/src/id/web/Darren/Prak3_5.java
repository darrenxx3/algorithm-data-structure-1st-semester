package id.web.Darren;
import java.util.Scanner;
public class Prak3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nilai;
         Scanner scan = new Scanner(System.in);
         
         System.out.print("Masukkan Tahun : ");
         nilai =scan.nextInt();

         
       String Tahun = "Tahun ini tahun kabisat";
         
          if ((nilai % 15 == 0 && nilai % 55 == 0) && (nilai % 4 == 0 || nilai % 400 == 0 )) {
           System.out.println(Tahun);
           System.out.println("Rayakan festival Huluculu!");
           System.out.println("Rayakan festival Buluculu!");
          
          }
          
          else if ((nilai % 15 != 0 && nilai % 55 != 0) && (nilai % 4 == 0 || nilai % 400 == 0 )) { 
           System.out.println(Tahun); 
          }
          
          else if (nilai % 55 != 0 && (nilai % 4 == 0 || nilai % 400 == 0 && nilai % 15 == 0)) {
           System.out.println(Tahun); 
           System.out.println("Rayakan festival Huluculu!");
           
          }
          
          else if (nilai % 4 == 0 || nilai % 400 == 0 && nilai % 55 == 0) {
           System.out.println(Tahun);
           System.out.println("Rayakan festival Buluculu!");
           
          }
          
          else
              System.out.println("----------------- \nHanya Tahun Biasa");
   
          scan.close();

	}

}
