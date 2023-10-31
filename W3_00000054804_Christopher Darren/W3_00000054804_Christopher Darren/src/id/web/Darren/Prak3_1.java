package id.web.Darren;

import java.util.Scanner;

public class Prak3_1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Tahun Masuk : ");
		int tahunmasuk = scan.nextInt();
		System.out.print("Jumlah SKS : ");
		int jumlahsks = scan.nextInt();
		
		int BiayaSemester = 0, biayaSKS = 0;
		
		if(tahunmasuk >= 2011 && tahunmasuk <= 2015) {
			if(tahunmasuk == 2011) {
				int BiayaSemester1 = 3300000;
				int biayaSKS1 = 250000;
				int biayaKRS1 = BiayaSemester1 + (biayaSKS * jumlahsks);
				System.out.printf("biaya KRS1 = %d", biayaKRS1);
			} else if (tahunmasuk == 2012) {
				int BiayaSemester2 = 3450000;
				int biayaSKS2 = 300000;	
				int biayaKRS2 = BiayaSemester2 + (biayaSKS * jumlahsks);
				System.out.printf("biaya KRS2 = %d", biayaKRS2);
			} else if (tahunmasuk == 2013) {
				int BiayaSemester3 = 3600000;
				int biayaSKS3 =  350000;
				int biayaKRS3 = BiayaSemester3 + (biayaSKS * jumlahsks);
				System.out.printf("biaya KRS3 = %d", biayaKRS3);
			} else if (tahunmasuk == 2014) {
				int BiayaSemester4 = 3750000;
				int biayaSKS4 = 400000;
				int biayaKRS4 = BiayaSemester4 + (biayaSKS * jumlahsks);
				System.out.printf("biaya KRS4 = %d", biayaKRS4);
			} else if (tahunmasuk == 2015) {
				int BiayaSemester5 = 3900000;
				int biayaSKS5 = 450000;
				int biayaKRS5 = BiayaSemester5 + (biayaSKS * jumlahsks);
				System.out.printf("biaya KRS5 = %d", biayaKRS5);
			} else {
				System.out.print("error");
				
			}
			scan.close();
		}
	}
}
			




