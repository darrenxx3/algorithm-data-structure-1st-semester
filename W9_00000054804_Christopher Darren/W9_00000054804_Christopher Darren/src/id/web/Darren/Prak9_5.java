package id.web.Darren;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Prak9_5 {
	private Formatter output;
	
	public void outputFile() {
		try {
			output = new Formatter("struk.txt");
		}catch (SecurityException except1) {
			System.err.println("Anda tidak boleh menulis ke file ini");
			System.exit(1);
		}catch(FileNotFoundException except2) {
			System.err.println("File tidak ditemukan");
			System.exit(1);
		}

}

	public void isidataoutput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("                       Kantinku");
		System.out.println("======================================================");
		System.out.println("Jumlah makanan: ");
		int batas = scan.nextInt();
		System.out.println();
		
		int JenisMakanan[] = new int[batas];
		int KodeMakanan[] = new int[batas];
		int JumlahMakanan[] = new int[batas];
		
		for(int x = 0; x < JenisMakanan.length; x++) {
			int order = x + 1;
			System.out.printf("Makanan ke -%d\n", order);
			System.out.print("kode: ");
			KodeMakanan[x] = scan.nextInt();
			System.out.print("jumlah: ");
			JumlahMakanan[x] = scan.nextInt();
			System.out.println();
		}
		System.out.println("===========================================================");
		System.out.println("Terima kasih atas kunjungan Anda. Selamat menikmati!");
	
	
	 try{
		File FILES = new File("kantinku.txt");
		Scanner scan1 = new Scanner(System.in);
		String[] data = new String[1000];
		for(int y = 0 ; y < 6 ; y++ ) {
			data[y] = scan1.nextLine();
		}
		scan1.close();
		
		output.format("            KANTINKU\n");
		output.format("=========================================================\n");
		output.format("No  |    Makanan   | Jumlah   | Harga  | Subtotal\n");
		output.format("----------------------------------------\n");
		int total = 0;
		for(int i = 0 ; i < KodeMakanan.length; i++) {
			String arrData[] = data[KodeMakanan[i] -1].split("#");
			int harga[] = {8000,8500, 15000, 25000, 20000, 20500};
			int order = i + 1;
			output.format("%d.  %-15s %-9d %-10s %d\n", order, arrData[1],JumlahMakanan[i], harga[KodeMakanan[i] -1] * JumlahMakanan[i]);
			total = total + (harga[KodeMakanan[i] -1] * JumlahMakanan[i]);
		}
		output.format("-----------------------------\n");
		output.format("Total %42d\n", total);
		output.format("Kasir: Christopher Darren    | NIM : 00000054804\n");
		
	 }catch(Exception ex) {
		 System.err.println("Error");
		 System.exit(1);
	 }
	 scan.close();
	}
	
	public void tutupoutputfile() {
		if(output!=null) {
			output.close();
		}
	}
	
	public static void main(String[] args) {
		Prak9_5 Kantinku = new Prak9_5();
		Kantinku.outputFile();
		Kantinku.isidataoutput();
		Kantinku.tutupoutputfile();
	}
}
