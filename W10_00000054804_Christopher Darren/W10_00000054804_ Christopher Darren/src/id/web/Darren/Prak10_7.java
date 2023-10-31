package id.web.Darren;
import java.util.Scanner;

public class Prak10_7 {
	
	public static void tukar(Barang[] data, int index) {
		Barang arrPertama = data[index];
		Barang arrKedua = data[index -1];
		//tukar
		data[index] = arrKedua;
		data[index - 1] = arrPertama;
		
	}
	
	public static void printArr(Barang[] data) {
		System.out.printf("%8s %-8s %-12s %-8s %s\n", "No","Nama", "Harga","Diskon", "Total");
		for(int index = 0; index < data.length; index++) {
			data[index].total = data[index].harga - (data[index].harga * (data[index].diskon / 100));
			System.out.printf("%-8d%-8sRp.%-12.0f%-8.0f%.2f\n", index + 1, data[index].nama, data[index].harga,
					data[index].diskon, data[index].total);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Jumlah Data yang ingin di input: ");
		int jumlahdata = scan.nextInt();
		Barang data[] = new Barang[jumlahdata];
		System.out.println();
		
		for(int i = 0; i < jumlahdata; i++) {
			int j = i + 1;
			data[i] = new Barang();
			scan.nextLine();
			System.out.printf("-----------------------Input Barang-%d---------\n", j);
			System.out.printf("Masukkan Nama Barang %d :  ", j);
			data[i].nama = scan.nextLine();
			System.out.printf("Masukkan Harga Barang %d :  ", j);
			data[i].harga = scan.nextFloat();
			System.out.printf("Masukkan Diskon Barang %d:  ", j);
			data[i].diskon = scan.nextFloat();
			System.out.println();
		}
		System.out.println("Menu :  ");
		System.out.println("1. Sort Berdasarkan Nama (A-Z)");
		System.out.println("2. Sort Berdasarkan Nama (Z-A)");
		System.out.println("3. Sort Berdasarkan Harga (ASC)");
		System.out.println("4. Sort Berdasarkan Harga (DESC)");
		System.out.println("5. Update Date");
		System.out.println("Pilihan: ");
		int sort = scan.nextInt();
		
		switch(sort) {
		case 1:
			for(int putaran = 1; putaran < data.length; putaran++) {
				for(int index = data.length -1; index >= putaran; index--) {
					if(data[index].nama.compareTo(data[index -1].nama) < 0) {
						tukar(data, index);
					}
				}
			}
			printArr(data);
			break;
		case 2:
			for(int putaran = 1; putaran < data.length; putaran++) {
				for(int index = data.length -1; index >= putaran; index--) {
					if(data[index].nama.compareTo(data[index -1].nama) > 0) {
						tukar(data, index);
					}
				}
			}
			printArr(data);
			break;
		case 3:
			for(int putaran = 1; putaran < data.length; putaran++) {
				for(int index = data.length -1; index >= putaran; index--) {
					if(data[index - 1].harga > data[index].harga) {
						tukar(data, index);
					}
				}
			}
			printArr(data);
			break;
		case 4:
			for(int putaran = 1; putaran < data.length; putaran++) {
				for(int index = data.length -1; index >= putaran; index--){
					if(data[index - 1].harga < data[index].harga) {
						tukar(data, index);
					}
				}
			}
			printArr(data);
			break;
		case 5:
			int ubah;
			do {
				System.out.print("Update Data ke: ");
				ubah = scan.nextInt();
				scan.nextLine();
			}while( ubah > data.length);
			System.out.printf("Masukkan Nama Barang %d:  ", ubah);
			data[ubah - 1].nama = scan.nextLine();
			System.out.printf("Masukkan Harga Barang %d:  ", ubah);
			data[ubah -1].harga = scan.nextFloat();
			System.out.printf("Masukkan Diskon Barang %d:  ", ubah);
			data[ubah -1].diskon = scan.nextFloat();
			scan.nextLine();
			System.out.println(" HASIL UPDATE DATA");
			System.out.println("----------------------------------------");
			printArr(data);
			break;
		}
		scan.close();
	}

}
