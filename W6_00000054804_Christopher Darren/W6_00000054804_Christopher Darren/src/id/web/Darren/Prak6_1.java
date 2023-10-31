package id.web.Darren;
import java.util.Scanner;

public class Prak6_1 {
	public static void hitungRata(Mahasiswa mhs1, Mahasiswa mhs2, Mahasiswa mhs3) {
		float ratarata =((mhs1.ipk + mhs2.ipk + mhs3.ipk)) /3;
		System.out.printf("Rata- rata keseluruhan mahasiswa : %f",ratarata);
		// hitung rata-rata ipk dari data 3 orang mahasiswa
		// cetak data 3 orang mahasiswa
		// cetak rata rata ipk
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Mahasiswa mhs1 = new Mahasiswa();
		Mahasiswa mhs2 = new Mahasiswa();
		Mahasiswa mhs3 = new Mahasiswa();
		System.out.print("Nama : ");
		mhs1.nama = scan.nextLine();
		
		System.out.print("NIM : ");
		mhs1.nim = scan.nextLine();
		
		System.out.print("IPK:   ");
		mhs1.ipk = scan.nextFloat();
		scan.nextLine();
		
		System.out.print("Nama : ");
		mhs2.nama = scan.nextLine();
		
		System.out.print("NIM : ");
		mhs2.nim = scan.nextLine();
		
		System.out.print("IPK:   ");
		mhs2.ipk = scan.nextFloat();
		scan.nextLine();
		
		System.out.print("Nama : ");
		mhs3.nama = scan.nextLine();
		
		System.out.print("NIM : ");
		mhs3.nim = scan.nextLine();
		
		System.out.print("IPK:   ");
		mhs3.ipk = scan.nextFloat();
		scan.nextLine();
		
		hitungRata(mhs1,mhs2,mhs3);
		scan.close();
		
		// buat 3 objek mahasiswa
		// assign masing masing atribut dari objek mahasiwa dengan fungsi scanner
		// panggil kelas hitungRata
	}
}
