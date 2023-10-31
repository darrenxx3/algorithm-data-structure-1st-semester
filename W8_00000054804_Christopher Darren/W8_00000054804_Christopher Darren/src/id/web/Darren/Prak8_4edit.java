package id.web.Darren;
import java.util.Scanner;
public class Prak8_4edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		  System.out.print("Input banyak data : ");
		  int inputdata =scan.nextInt();
		  Mahasiswa[] mhs = new Mahasiswa[inputdata];
		  
		  
		   for(int y =0;y<inputdata;y++) {
		    mhs[y] = new Mahasiswa();
		   System.out.printf("Data ke-%d\n",y+1);
		   
		   System.out.print("Nama:");
		   scan.nextLine();
		   mhs[y].nama = scan.nextLine();
		   System.out.print("Jurusan : ");
		   mhs[y].jurusan =scan.nextLine();
		   System.out.print("Nilai : ");
		   mhs[y].nilai_praktikum = scan.nextInt();
	}
	
		   System.out.println("Data Mahasiswa UMN"); 
		   System.out.println("=============================================================");
		   System.out.println("No      Nama             Jurusan            Nilai Praktikum");
		   for(int x=0;x<inputdata;x++) {
		    if(mhs[x].nilai_praktikum > 100) {
		     mhs[x].nilai_praktikum = 0;
		     
		    }
		    System.out.printf("%d%8s%20s%25d\n",x+1,mhs[x].nama,mhs[x].jurusan,mhs[x].nilai_praktikum);
		    
		    scan.close();
		   }
	}
}

