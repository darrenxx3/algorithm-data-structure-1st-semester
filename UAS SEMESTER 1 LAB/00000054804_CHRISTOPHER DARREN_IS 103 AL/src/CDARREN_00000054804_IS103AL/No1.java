package CDARREN_00000054804_IS103AL;

import java.util.Scanner;
public class No1 {
	
	public static void addStudent(mahamurid [] data, int index) {
		mahamurid arrPertama = data[index];
		mahamurid arrKedua = data[index -1];
		//tukar
		data[index] = arrKedua;
		data[index - 1] = arrPertama;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PROGRAM MAHASISWA");
		System.out.println("Pilihan menu :");
		System.out.println("1. Input Mahasiswa");
		System.out.println("2. Order Mahasiswa ASC");
		System.out.println("3. Order Mahasiswa DESC");
		System.out.println("4. Cari Mahasiswa");
		System.out.println("5. Keluar");
		System.out.println("-----------------------------------");
		System.out.print("Pilihan : ");
				
		int jumlahdata = scan.nextInt();
		mahamurid data[] = new mahamurid[jumlahdata];
		System.out.println();
		
		for(int i = 0; i < jumlahdata; i++) {
			int j = i + 1;
			data[i] = new mahamurid();
			scan.nextLine();
			System.out.printf("-----------------------Input Mahasiswa----------\n", j);
			System.out.printf("Jumlah Mahasiswa  : ", j);
			data[i].angka= scan.nextInt();
			System.out.printf("NIM Mahasiswa ke- %d : ", j);
			data[i].nim_ = scan.nextInt();
			System.out.printf("Nama Mahasiswa ke- %d :  ",j);
			data[i].nama = scan.nextLine();
			System.out.printf("IPK Mahasiswa ke- %d : ",j );
			data[i].ipk = scan.nextFloat();
			System.out.println();
		}
	}

}
