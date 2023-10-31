package id.web.Darren;
import java.util.Scanner;

public class Prak2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nama       :");
		String name = scan.nextLine();
		System.out.print("Semester   :");
		int semester = scan.nextInt();
		
		System.out.printf("==== MASUKKAN DETAIL BIAYA ====\n");
		System.out.printf("Biaya Konsumsi/hari          :");
		int konsumsi = scan.nextInt() * (365 / 2 - 2);
		System.out.printf("Biaya Transportasi/minggu    :");
		int transportasi = scan.nextInt() * 26;
		System.out.printf("Biaya Komunikasi/bulan       :");
		int komunikasi = scan.nextInt() * 6;
		System.out.printf("Biaya Akomodasi/bulan        :");
		int akomodasi = scan.nextInt() * 6;
		System.out.printf("Biaya Kuliah/semester        :");
		int kuliah = scan.nextInt();
		System.out.printf("Biaya Buku Pelajaran/semester:");
		int biayabuku = scan.nextInt();
		int totalbiaya = (konsumsi + transportasi + komunikasi + akomodasi + kuliah + biayabuku) * semester;
		
		System.out.printf("Halo, Harith. Kamu sudah kuliah selama %d semester\n", semester);
		System.out.printf("Biaya yang sudah kamu keluarkan %d", totalbiaya);
		
		scan.close();
		
		
		

		
	}

}
