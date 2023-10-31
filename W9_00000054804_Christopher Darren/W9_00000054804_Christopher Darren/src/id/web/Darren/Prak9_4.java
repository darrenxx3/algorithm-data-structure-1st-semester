package id.web.Darren;

import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prak9_4 {
	 private Formatter output;
	 
	 public void outputfile() {
		 try {
			 output = new Formatter ("keluaran.txt");
		 }catch (SecurityException excpt1) {
			 System.err.println("Anda tidak boleh menulis ke file ini");
			 System.exit(1);
		 }catch (FileNotFoundException excpt2) {
			  System.err.println("File tidak ditemukan");
			  System.exit(1);
		 }
	 }
	 
	 public void isiDataOutput () {
		 try {
			 File file = new File ("dataku10lari.txt");
			 Scanner scan = new Scanner (file);
			 Runner [] rnr = new Runner [10];
			 
			 for(int x = 0 ; x < rnr.length; x++) {
				 rnr[x] = new Runner();
				 
			 }
			 for(int x = 0; x < rnr.length; x++) {
				 rnr[x].nama = scan.nextLine();
				 rnr[x].kecepatan = scan.nextLine();
			 }
			 scan.close();
		 
		 
		 output.format("10 Pelari Tercepat di Serpong\n");
		 output.format("==================================================\n");
		 
		 for(int x = 0; x < 2; x++) {
			 int order = x + 1;
			 output.format("%d. %s: %s m/s ",order, rnr[x].nama,rnr[x].kecepatan);
		 }
		 for(int x = 2; x < 6; x++) {
			 int order = x + 1;
			 output.format("\n%d. %s: %s m/s ",order, rnr[x].nama,rnr[x].kecepatan);
		 }
		 for(int x = 6; x < 8 ; x++) {
			 int order = x + 1;
			 output.format("%d. %s: %s m/s ", order, rnr[x].nama, rnr[x].kecepatan);
		 }
		 for(int x = 8; x <10 ; x++) {
			 int order = x + 1;
			 output.format("\n%d. %s: %s m/s ", order, rnr[x].nama, rnr[x].kecepatan);
		 }
	 }catch(Exception e) {
		 System.err.println("Ada error nih");
		 System.exit(1);
	 }
		 
}
	 public void tampilanOutputFile() {
		 try {
			 File file = new File("keluaran.txt");
			 Scanner scan = new Scanner(file);
			 
			 while(scan.hasNext()) {
				 System.out.print(scan.nextLine());
			 }
			 scan.close();
		 }catch(Exception e) {
			 System.err.println("Ada error nih");
		 }
	 }
	 public void tutupOutputFile() {
		 if(output!=null) {
			 output.close();
		 }
	 }
	 
	 public static void main(String[] args) {
		 Prak9_4 runner = new Prak9_4();
		 
		 runner.outputfile();
		 runner.isiDataOutput();
		 runner.tutupOutputFile();
		 runner.tampilanOutputFile();
		 
	 }
}
