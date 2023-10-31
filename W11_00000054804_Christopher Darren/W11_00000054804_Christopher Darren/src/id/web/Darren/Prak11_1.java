package id.web.Darren;
import java.util.Scanner;
public class Prak11_1 {
	public static int sequentialSearch(int[] angka, int key) {
		for(int x = 0 ; x < angka.length; x++) {
			if(key == angka[x]) {
				return x;
			}
		}
		return -1;
	}
	
	public static void tukar(int[]angka, int index) {
		int array1 = angka[index];
		int array2 = angka[index - 1];
		angka[index] = array2;
		angka[index - 1] = array1;
	}
	
	public static void BUBBLESORT(int [] urutAngka) {
		for(int putaran = 1; putaran <urutAngka.length; putaran++) {
			for(int index = urutAngka.length - 1; index >= putaran; index--) {
				if(urutAngka[index -1] > (urutAngka[index])) {
					tukar(urutAngka, index);
				}
			}
		}
	}
	
	public static int BINARYSEARCH(int[] angka, int key, int x , int y) {
		int mid = 0;
		int putaran = 0;
		while(x <= y) {
			mid = (x + y) / 2;
			if(key == angka[mid]) {
				return putaran;
			}else if(key < angka[mid]) {
				y = mid -1;
				putaran++;
			}else {
				x = mid +1;
				putaran++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jumlah data");
		int jumlahdata = scan.nextInt();
		int[] angka = new int[jumlahdata];
		System.out.print("Masukkan isi data: ");
		for (int i = 0; i< angka.length; i++) {
			angka[i] = scan.nextInt();
		}
		System.out.print("data yang dicari : ");
		int datayangdicari = scan.nextInt();
		
		boolean loop = true;
		do {
			System.out.println("------------");
			System.out.println("1. Sequential");
			System.out.println("2. Binary");
			System.out.println("3. Interpolation");
			System.out.println("4. Abort System!!!");
			System.out.println("Pilih jenis pencari: ");
			int jenis = scan.nextInt();
			if (jenis == 1) {
				int hasil = sequentialSearch(angka, datayangdicari);
				if(hasil == -1) {
					System.out.print("Data tidak ditemukan");
				}else {
					System.out.println("Data ditemukan");
					System.out.printf("Data berada di index ke: %d", hasil);
					System.out.printf("Dengan %d putaran", (hasil +1));
				}
			}else if(jenis == 2) {
			
		}while(loop = true);

	}

}
}