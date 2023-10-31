package id.web.Darren;

public class Prak8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa[] mhs = new Mahasiswa[3];
		
		mhs[0] = new Mahasiswa();
		mhs[1] = new Mahasiswa();
		mhs[2] = new Mahasiswa();
		
		mhs[0].nama ="Rino Yaohari"; mhs [0].jurusan ="SI";
		mhs[1].nama ="Kevin Anggara"; mhs [1].jurusan ="DKV";
		mhs[2].nama ="Olivia Leanartha"; mhs [2].jurusan ="ILKOM";
		
		System.out.println("Data 3 orang Mahasiswa UMN \n");
		System.out.println("Nama                 Jurusan");
		for(int i =0; i <3 ; i++) {
			System.out.printf("%-20s %-10s\n", mhs[i].nama,mhs[i].jurusan);
		}
	}

}
