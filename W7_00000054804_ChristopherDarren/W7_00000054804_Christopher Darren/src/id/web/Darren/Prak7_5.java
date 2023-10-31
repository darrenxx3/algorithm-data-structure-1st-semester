package id.web.Darren;
import java.util.Scanner;
public class Prak7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan deret Bilangan: ");
		int array [][] = new int [5] [5];
		int [] Samping = new int [5];
		int [] Bawah = new int [5];
		int Diagonal = 0;
		int x, y;
		
		for(x = 0; x < 5; x++) {
			Samping[x] = 0;
			for(y= 0; y < 5; y++) {
				array[x] [y] =scan.nextInt();
				Samping [x] = Samping[x] + array [x] [y];
				
			}
		}
		for(y = 0; y < 5; y++) {
			Bawah[y] = 0;
			for(x= 0; x < 5; x++) {
				Bawah [y] = Bawah[y] + array [x] [y];
			}
		}
		for(x= 0; x < 5; x++) {
			for(y = 0; y < 5; y++) {
				if(x == y) {
					Diagonal = Diagonal + array [x][y];
				}
			}
		}
		System.out.print("Nilainya adalah  ");
		for(x = 0; x < 5; x++)
			System.out.print(Samping [x] + " ");
			System.out.print(Diagonal);
			for(y = 0; y < 5; y++) {
				System.out.print(Bawah[y] + " ");
			}
			scan.close();
		}
		

	}

