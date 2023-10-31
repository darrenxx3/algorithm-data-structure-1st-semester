package id.web.Darren;
import java.util.Scanner;
public class Prak7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int jumlah = 0;
		int angka[] = new int[1000];
		for (int i = 0; i < angka.length; i++) {
			System.out.printf("Angka %d : ", i + 1);
			angka[i] = scan.nextInt();
			jumlah = jumlah + angka[i];
			if (angka[i] == 0) {
				break;
			}
		}
		if(jumlah %2 == 0 && jumlah != 2) {
			System.out.print("Hasil Genap");
		}else if(jumlah %2 == 1 || jumlah %2 == 2) {
			int temp;
			boolean prima = true;
			for(int i = 2; i < jumlah ; i++) {
				temp = jumlah %i ;
				if(temp == 0) {
					prima = false;
					break;
				}
			}
			if(prima == true && (jumlah > 0 && jumlah != 1)) {
				System.out.println("Prima");
			}else {
				System.out.println("Ganjil");
			}
		}
		scan.close();
	}

}
