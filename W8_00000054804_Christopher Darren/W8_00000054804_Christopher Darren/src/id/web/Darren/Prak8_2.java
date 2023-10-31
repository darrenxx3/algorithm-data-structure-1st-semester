package id.web.Darren;
import java.util.Scanner;
public class Prak8_2 {
	
	enum Status{
		
		kosong(0), jomblo(1), pacaran(2), menikah(3);
		
		public int KodeStatus;
		
		Status (int x){
			KodeStatus = x;
		}
	}

	public static void main(String[] args) {
		Status x = Status.kosong;
		
		// TODO Auto-generated method stub
		//mengganti Status.kosong menjadi status lainnya sesuai dengan enum yang dibuat, lihat perbedaannya!!!!
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Selamat datang di program penebak status UMN!");
		System.out.println("Apa yang sedang anda rasakan saat ini?");
		System.out.println("1. Bosan");
		System.out.println("2. Sedih");
		System.out.println("3. Lelah");
		System.out.print("Pilihan Anda: ");
		int pilihan_anda = scan.nextInt();
		
		
		switch(pilihan_anda) {
		case 1:
			System.out.printf("Status Anda Adalah %s",Status.jomblo);
			break;
		case 2:
			System.out.printf("Status Anda Adalah %s",Status.pacaran);
			break;
		case 3:
			System.out.printf("Status Anda Adalah %s",Status.menikah);
			break;		
		default:
			System.out.printf("Status Anda... nampaknya tidak jelass");
			
		}
		scan.close();
	}

}
