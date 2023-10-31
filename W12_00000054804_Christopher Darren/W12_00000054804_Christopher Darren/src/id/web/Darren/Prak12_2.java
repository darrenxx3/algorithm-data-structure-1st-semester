package id.web.Darren;
import java.util.Scanner;

import id.web.Darren.Prak12_1.Node;

public class Prak12_2 {
	static Mahasiswa headMahasiswa;
	
	static class Mahasiswa{
		String nim;
		String nama;
		float ipk;
		
		Mahasiswa nextMahasiswa;
		
		public Mahasiswa(String nim, String nama, float ipk) {
			this.nim = nim;
			this.nama = nama; //deklarasi variable dulu
			this.ipk = ipk;
		}
	}
		public static void INSERTMAHASISWA(String nim, String nama, float ipk) {
			Mahasiswa newNode = new Mahasiswa(nim, nama,ipk);// data lebih dari 1 harus dideklar dlu)
			if(headMahasiswa == null) {
				headMahasiswa = newNode;
		}else {
			Mahasiswa temporary = headMahasiswa;
			while(temporary.nextMahasiswa != null) {
				temporary = temporary.nextMahasiswa; //kalau misal tidak kosong maka akan di temp mahasiswa, dan aakn looping
			}
			temporary.nextMahasiswa = newNode;  //akan lanjut ke step berikutnya
		}
	}
	
	public static void CARINODE(String nim, Mahasiswa headMahasiswa) {
		Mahasiswa newNode = headMahasiswa;  // this. untuk buat varibale yang aktif supaya bisa dicek
		if(newNode == null) {
			if(newNode.nim.equalsIgnoreCase(nim)) {
				System.out.println("Terdapat mahasiswa dengan NIM" +newNode.nim + "dengan nama" + newNode.nama);
			}else {
				newNode = newNode.nextMahasiswa;
				System.out.println("Data tidak ditemukan");
			}
			
		}
	}
	
	void DELETEDATA(String KEY) {
		if(headMahasiswa != null) {
			boolean Changing;
		do {
			Mahasiswa newNode = headMahasiswa, prev = null;
			Mahasiswa nextTo = newNode.nextMahasiswa;
			Changing = false;
		
			while(nextTo != null) {
				if(newNode.nama.compareTo(nextTo.nama) > 0) {
					Changing = true;
					
					if(prev != null) {
						Mahasiswa sigma = nextTo.nextMahasiswa;
						prev.nextMahasiswa = nextTo;
						nextTo.nextMahasiswa = newNode;
						newNode.nextMahasiswa = sigma;
					}else {
						Mahasiswa sigma = nextTo.nextMahasiswa;
						headMahasiswa = nextTo;
						nextTo.nextMahasiswa = newNode;
						newNode.nextMahasiswa = sigma;
					}
					
					prev = nextTo;
					nextTo = newNode.nextMahasiswa;
				}else {
					prev = newNode;
					newNode = nextTo;
					nextTo = nextTo.nextMahasiswa;
				}
			}
		}while(Changing);
		
		}
	}
	
	public static void ORDERING() {
		if(headMahasiswa != null) {
			boolean change;
			
			do {
				Mahasiswa newNode = headMahasiswa, prev = null;
				Mahasiswa nextTo = newNode.nextMahasiswa;
				change =false;
				
				while(nextTo != null) {
					if(newNode.nama.compareToIgnoreCase(nextTo.nama) > 0) {
						change = true;
						
						if(prev != null) {
							Mahasiswa sigma = nextTo.nextMahasiswa;
							prev.nextMahasiswa = nextTo;
							newNode.nextMahasiswa = sigma;
						}else {
							Mahasiswa sigma = nextTo.nextMahasiswa;
							headMahasiswa = nextTo;
							nextTo.nextMahasiswa = newNode;
							newNode.nextMahasiswa = sigma;
						}
						prev = nextTo;
						nextTo = newNode.nextMahasiswa;
					}else {
						prev = newNode;
						newNode = nextTo;
						nextTo = nextTo.nextMahasiswa;
					}
				}
			}while(change);
		}
	}
	static void PRINTLIST() {
		Mahasiswa MAHASISWA = headMahasiswa;
		System.out.println("-------------------------Data Mahassiswa----------------");
		System.out.println("NIM                    Nama Mahasiswa     IPK");
		while(MAHASISWA != null) {
			System.out.printf("%-23s %-18s %-3.2f\n",MAHASISWA.nim, MAHASISWA.nama, MAHASISWA.ipk);
			MAHASISWA = MAHASISWA.nextMahasiswa;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanning = new Scanner(System.in);
		headMahasiswa = new Mahasiswa("00000054804", "ChristopherDarren", 4);
		PRINTLIST();
		System.out.println();
		
		boolean condition = false;
		int pilihlah;
		
		do {
			do {
				System.out.println("1. Tambah Mahasiswa");
				System.out.println("2. Cari Mahasiswa");
				System.out.println("3. Hapus Mahasiswa");
				System.out.println("4. Urutkan Mahasiswa");
				System.out.println("5. Keluar Aplikasi");
				System.out.print("Pilihan:  ");
				pilihlah = scanning.nextInt();
				
			}while(pilihlah <1 && pilihlah <5);
			Prak12_2 Mahasiswa = new Prak12_2();
			if(pilihlah == 1) {
				System.out.println("----------------------");
				System.out.print("Tuliskan NIM:  ");
				String NIM = scanning.next();
				System.out.print("Tuliskan Nama: ");
				String NAMA = scanning.next();
				System.out.print("Tuliskan IPK:  ");
				float IPK = scanning.nextFloat();
				
				Prak12_2.INSERTMAHASISWA(NIM, NAMA, IPK); //harus diubah ke static type 
				PRINTLIST();
				
			}else if(pilihlah == 2) {
				System.out.println("-----------------------");
				System.out.println("Cari nim mahasiswa:  ");
				String FINDmahasiswa = scanning.next();
				Mahasiswa.CARINODE(FINDmahasiswa, headMahasiswa); //sama seperti dia tas bisa diubah ke static
				
			}else if(pilihlah == 3) {
				System.out.println("Tuliskan NIM yang ingin dihapus:  ");
				String KEY = scanning.next();
				Mahasiswa.DELETEDATA(KEY);
				PRINTLIST();
				
			}else if(pilihlah == 4) {
				System.out.println("Hasil dari pengurutannya yaitu:  ");
				Mahasiswa.
				PRINTLIST();
				
			}else if(pilihlah == 5) {
				condition = true;
			}
			
		}while(condition = false);
		System.out.println("Terimakasih sudah menggunakan aplikasi kami ya :)))) ");
	}

}
