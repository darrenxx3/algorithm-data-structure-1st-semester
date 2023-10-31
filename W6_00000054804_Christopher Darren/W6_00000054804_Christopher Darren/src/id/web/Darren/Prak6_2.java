package id.web.Darren;
import java.util.Scanner;
public class Prak6_2 {
	public static void hitungRata(NewMahasiswa mhs1, NewMahasiswa mhs2, NewMahasiswa mhs3) {
		
		System.out.printf("nilai ratarata IPK : %f",(((mhs1.getIpk())+(mhs2.getIpk())+(mhs3.getIpk())))/ 3);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NewMahasiswa mhs1 = new NewMahasiswa();
		NewMahasiswa mhs2 = new NewMahasiswa();
		NewMahasiswa mhs3 = new NewMahasiswa();
		
		System.out.println("Masukana nama mahasiswa: ");
		mhs1.setNama(scan.next());
		mhs2.setNama(scan.next());
		mhs3.setNama(scan.next());	
		
		System.out.println("Masukana NIM mahasiswa: ");
		mhs1.setNim(scan.next());
		mhs2.setNim(scan.next());
		mhs3.setNim(scan.next());
		
		System.out.println("Masukana IPK mahasiswa:  ");
		mhs1.setIpk(3.00);
		mhs2.setIpk(3.50);
		mhs3.setIpk(3.40);
		
		System.out.println(mhs1.getIpk());
		System.out.println(mhs2.getIpk());
		System.out.println(mhs3.getIpk());
		
		hitungRata(mhs1,mhs2,mhs3);
		scan.close();
		
		}

}
