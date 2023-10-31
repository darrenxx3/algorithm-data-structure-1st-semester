package id.web.Darren;
import java.util.Scanner;
public class Prak5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
				 System.out.print("Jumlah anak : ");
				 int jumlah_anak1 = scan.nextInt();
				 System.out.print("Jumlah anak : ");
				 int jumlah_anak2 = scan.nextInt();
				 System.out.print("Jumlah anak : ");
				 int jumlah_anak3 = scan.nextInt();
				 
				 rekursif1(jumlah_anak1);
				 rekursif1(jumlah_anak2);
				 rekursif1(jumlah_anak3);
			    }

		    public static void rekursif1(int a) {
		    	int total = 0;
		    	while (a != 0) {
		    		int x = rekursif(a);
		    		total = total + x;
		    		a--;
		    	}
		    	
		        System.out.print("Hasil 1 = "+total+"\n");
		    }

		    	

		    public static Integer rekursif(int x){
		        if(x % 2 == 0 ){
		            return 3;
		        }else{
		            return 2;  
		        }
		    }
		
	}


