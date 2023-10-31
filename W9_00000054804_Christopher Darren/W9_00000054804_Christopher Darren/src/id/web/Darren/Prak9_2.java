package id.web.Darren;
import java.io.FileNotFoundException;

import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Prak9_2 {
	
	private Formatter output;
	//objek untuk menulis text ke file yang dituju

	public void bukaFile(String[]args) {
		
		// TODO Auto-generated method stub
		try {
			output = new Formatter("cobadatahuhahuha.txt");
		}catch(SecurityException except1) {
			System.err.println("Anda tidak boleh" + "menulis ke file ini");
			System.exit(1);
			
		}catch(FileNotFoundException except2) {
			System.err.println("File tidak ditemukan");
			System.exit(1);
		}
	}
	
	public void menambahData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan no, nama, dan sisa dana :  ");
		while(scan.hasNext()) {
			try {
				int no = scan.nextInt();
				String nama = scan.next();
				double sisaDana = scan.nextDouble();
				//membuat baris pemisah
				String separator = System.getProperty("line.separator");
				//menulis data ke file
				output.format("%d %s %.2f%s", no, nama, sisaDana, separator);
				
			}catch(FormatterClosedException EXX) {
				System.err.println("Error ketika menulis" + "ke file");
				return;
			}catch(NoSuchElementException EXX) {
				System.err.println("Terjadi kesalahan input");
				scan.nextLine();
			}
			System.out.print("Masukkan no, nama, dan " + "sisa dana: ");
		}//end while
		}// end menambah data
		
	public void menutupFile() {
		if(output!=null) {
			output.close();
		}

}
}
