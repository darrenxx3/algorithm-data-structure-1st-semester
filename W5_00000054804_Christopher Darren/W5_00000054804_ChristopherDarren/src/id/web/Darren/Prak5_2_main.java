package id.web.Darren;
import java.util.Scanner;
public class Prak5_2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Scanner scan = new Scanner(System.in);
		 String yes = null ;

		 do
		 {
		  System.out.println("Program hitung Luas : ");
		  System.out.println("1. Persegi");
		  System.out.println("2. Persegi panjang ");
		  System.out.println("3. Segitiga  ");
		  System.out.print("pilihan : ");
		  int pilihan = scan.nextInt();

		  switch (pilihan) {
		  case 1: {
		   System.out.print("masukan sisi : ");
		   int sisi = scan.nextInt();

		   int luas = Prak5_2_Method.persegi(sisi);
		   System.out.printf("luas : %d ", luas);
		   break;
		  }
		  case 2: {
		   System.out.print("masukan panjang : ");
		   int panjang = scan.nextInt();

		   System.out.print("masukan lebar : ");
		   int lebar = scan.nextInt();

		   int luas = Prak5_2_Method.persegiPanjang(panjang, lebar);
		   System.out.printf("luas : %d ", luas);
		   break;
		  }
		  case 3: {
		   System.out.print("masukan alas : ");
		   int alas = scan.nextInt();

		   System.out.print("masukan tinggi : ");
		   int tinggi = scan.nextInt();

		   double luas = Prak5_2_Method.segitiga (alas, tinggi);
		   System.out.printf("luas : %.2f ", luas);
		   break;

		  }
		  default: {
		   System.out.print("salah ");
		   break;
		  }

		  }
		  System.out.print("apakah anda ingin mengulang program (y/n): ");
		  yes = scan.next();
		 }while(yes.equalsIgnoreCase("Y"));
		 System.out.print("terimakasih telah mnggunakan program ini ");
	}

}
}
