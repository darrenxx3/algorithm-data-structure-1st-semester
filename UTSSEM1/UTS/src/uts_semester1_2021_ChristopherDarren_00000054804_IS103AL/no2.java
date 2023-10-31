package uts_semester1_2021_ChristopherDarren_00000054804_IS103AL;
import java.util.Scanner;
public class no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in); 
         int ganjil = 0;
         int genap = 0;
         System.out.print("Masukan Jumlah data yang diinginkan : ");
         int scanning = scan.nextInt();
         System.out.println("=======================================");

         int[] array = new int[scanning];
         for (int i = 0; i<scanning; i++) {
          System.out.printf("Masukan nilai ke- %d : ", i+1);
          array[i] = scan.nextInt();
          if(array[i] % 2==0) {
           genap+= array[i];
         }else if(array[i] % 2 == 1) {
          ganjil+= array[i];
         }
         }
         scan.close();
         System.out.println("=====================================================");
         for (int i = 0; i<scanning; i++) {
          if(array[i] % 2==0) {
          System.out.printf("Bilangan (%d) Merupakan bilangan Genap ",array[i] );
          System.out.println();
         }else if(array[i] % 2 == 1) {
          System.out.printf("Bilangan (%d) Merupakan bilangan Ganjil",array[i] );
          System.out.println();
         }

         }
           System.out.println("Hasil Penjumlahan Bilangan Ganjil Pada Data Adalah " + ganjil);
           System.out.println("Hasil Penjumlahan Bilangan Genap Pada Data Adalah " + genap);
           System.out.println("=======================================");
           int total = ganjil + genap;
           String scanning1 ="ganjil";
           if (total%2 == 0) {
            System.out.println("Hasil Penjumlahan dari Seluruh Bilangan (Ganjil + Genap) Pada Data adalah " + total + " dan merupakan Bilangan Genap" );
           }else {
            System.out.println("Hasil Penjumlahan dari Seluruh Bilangan (Ganjil + Genap) Pada Data adalah " + total + " dan merupakan Bilangan Ganjil" );
            
            scan.close();
	}

}
}
