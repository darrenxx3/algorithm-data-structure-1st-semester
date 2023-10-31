package id.web.Darren;
import java.util.Scanner;
public class Prak3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  Scanner input = new Scanner(System.in);
		  System.out.printf("Nama Anda %22s", "= ");
		  String nama = input.next();
		  
		  System.out.printf("Jenis kelamin (Pria / Wanita) %1s", "= ");
		  String kelamin = input.next();
		  
		  System.out.printf("Berat Badan (kg) %15s", "= ");
		  Double BB = input.nextDouble();
		  
		  System.out.printf("Tinggi Badan (cm) %14s", "= ");
		  Double TB = input.nextDouble();
		  Double BMI = BB/(TB*TB);
		  System.out.println();
		  
		  if (kelamin.equalsIgnoreCase("Pria")) {
		   if (BMI < 17)
		   System.out.println("Tuan" + nama + ", Anda Tergolong Kurus.");
		  }else if ((BMI >= 17) && (BMI < 23)) {
		   System.out.println("Tuan" + nama + ", Anda Tergolong Normal");
		  }else if ((BMI >= 23) && (BMI < 27)) {
		   System.out.println("Tuan" + nama + ", Anda Tergolong Kegemukan");
		  }else {
		   System.out.println("Tuan" + nama + ", Anda Tergolong Obesitas");

		  if (kelamin.equalsIgnoreCase("Wanita")) {
		  }else if (BMI < 18) {
		   System.out.println("Nyona" + nama + ", Anda Tergolong Kurus.");
		  }else if ((BMI >= 18) && (BMI < 25)) {
		   System.out.println("Nyonya" + nama + ", Anda Tergolong Normal");
		  }else if ((BMI >= 25) && (BMI < 27)) {
		   System.out.println("Nyonya" + nama + ", Anda Tergolong Kegemukan");
		  }else {
		   System.out.println("Nyonya" + nama + ", Anda Tergolong Obesitas");
		  
		  }
		  input.close();

		scan.close();
		  }
	}
}
