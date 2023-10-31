package id.web.Darren;
import java.util.Scanner;
public class Prak4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int baris, pilihpola;
	        boolean inProgram = true;
	        
	        Scanner scan = new Scanner(System.in);
	        
	        while(inProgram){
	            System.out.println("Selamat Datang di Program Tebar Bintang UMN");
	            System.out.println();
	            System.out.print("Banyak Baris? : ");
	            baris = scan.nextInt();
	            boolean IsiBaris = true;
	            while(IsiBaris){
	                System.out.println("================================================");
	                System.out.println("1. Tebar Silang");
	                System.out.println("2. Tebar Kotak Bolong");
	                System.out.println("3. Tebar Piramida Berkesan");
	                System.out.println("4. Kembali");
	                System.out.println("5. Keluar");
	                System.out.print("Pilih: ");
	                pilihpola = scan.nextInt();
	                switch(pilihpola){
	                    case 1:
	                        for(int i = 1; i <= baris; i++){
	                            for(int j = 1; j <= baris; j++){
	                                if(j == i || j == baris - i + 1) System.out.print("*");
	                                else System.out.print(" ");
	                            }
	                            System.out.println();
	                        }
	                        break;
	                    case 2:
	                        for(int i = 1; i <= baris; i++){
	                            for(int j = 1; j <= baris; j++){
	                                if(i == 1 || i == baris) System.out.print("*");
	                                else{
	                                    if(j == 1 || j == baris) System.out.print("*");
	                                    else System.out.print(" ");
	                                }
	                            }
	                            System.out.println();
	                        }
	                        break;
	                    case 3:
	                        for(int i = 1; i <= baris; i++){
	                            for(int j = baris - 1; j >= i; j--){
	                                System.out.print(" ");
	                            }
	                            for(int k = 1; k <= i; k++){
	                                System.out.print("*");
	                            }
	                            for(int l = 1; l <= i-1; l++){
	                                System.out.print("*");
	                            }
	                            System.out.println();
	                        }
	                        break;
	                    case 4: 
	                        System.out.println();
	                        IsiBaris = false;
	                        break;
	                    case 5:
	                        System.out.println("Terima kasih dan ");
	                        System.out.println("Tebarkan Selalu Pesona Bintang UMN!!");
	                        inProgram = false;
	                        IsiBaris = false;
	                        break;
	                    default:
	                        System.out.println();
	                        System.out.println("Pilihan salah!");
	                        System.out.println();
	                        break;
	                }
	            }
	        }
	}
}

