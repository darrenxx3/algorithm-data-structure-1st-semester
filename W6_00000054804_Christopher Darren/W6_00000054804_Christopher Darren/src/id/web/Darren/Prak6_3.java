package id.web.Darren;
import java.util.Scanner;
public class Prak6_3 {
	public static int umur(Penduduk orang) {
	
		String umur = "";
		if(orang.tgl.length() > 4) {
			umur = orang.tgl.substring(orang.tgl.length() - 4);
		}else {
			umur = orang.tgl;
		}
		int tahunsekarang = 2021;
		int tahunlahir = Integer.parseInt(umur);
		int umurorang = tahunsekarang - tahunlahir;
		return umurorang;
	}
	
	public static void lulusvaksin(Penduduk orang) {
		int umurorang = umur(orang);
		switch(orang.JKelamin) {
		case "p":
			if(umurorang >= 18 && umurorang <= 70) {
				if(orang.Goldarah.equalsIgnoreCase("A")||orang.Goldarah.equalsIgnoreCase("B")){
					System.out.println("\nSINOVAC");
				}
			}
			if(umurorang >= 12 && umurorang <= 60) {
				if(orang.Goldarah.equalsIgnoreCase("AB")||orang.Goldarah.equalsIgnoreCase("O")){
					System.out.println("\nSINOPHARM");
					
					if(umurorang >= 18 && umurorang <= 65) {
						if(orang.Goldarah.equalsIgnoreCase("A")||orang.Goldarah.equalsIgnoreCase("B") || orang.Goldarah.equalsIgnoreCase("A")) {
							System.out.println("\nMODERNA");
						}else
							System.out.println("tidak bisa divaksin");
					}
				}
			}
			
				break;
		case "l":
			if (umurorang >= 18 && umurorang <= 70) {
			    if (orang.Goldarah.equalsIgnoreCase("A") || orang.Goldarah.equalsIgnoreCase("B")) {
			     System.out.println("\nSinovac");
			    }
			    
			}
			     
			     if (umurorang >= 12 && umurorang <= 60) {
					    if (orang.Goldarah.equalsIgnoreCase("AB") || orang.Goldarah.equalsIgnoreCase("B")) {
					     System.out.println("\nSinopharm");
					     
		}
	}			if (umurorang >= 30 && umurorang <= 65) {
	    				if (orang.Goldarah.equalsIgnoreCase("AB") || orang.Goldarah.equalsIgnoreCase("B")) {
	    					System.out.println("\nAstrazeneca");
	    				}
	}
	
	    
	break;
		}
	}

		     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Penduduk orang = new Penduduk();
		System.out.print("Nama  :");
		orang.Nama = scan.nextLine();
		System.out.println("Jenis Kelamin (L/P)  :");
		orang.JKelamin = scan.nextLine().toLowerCase();
		System.out.println("Tanggal Lahir  :");
		orang.tgl = scan.nextLine();
		
		System.out.println("Golongan Darah  :");
		orang.Goldarah = scan.nextLine();
		System.out.println("Pekerjaan  :");
		orang.Pekerjaan = scan.nextLine();
		
		lulusvaksin(orang);
		scan.close();
	}

}
