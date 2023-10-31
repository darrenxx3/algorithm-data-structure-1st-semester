package id.web.Darren;
import java.util.Scanner;
public class Prak11_2 {
	
	public static String[] Insertionsort(String[]arrDiurutkan) {
		int putaran, index;
		String temp;
		int panjangARR = arrDiurutkan.length;
		for(putaran = 1; putaran < panjangARR; putaran++) {
			temp = arrDiurutkan[putaran];
			index = putaran - 1;
			while(index >= 0 && temp.compareToIgnoreCase(arrDiurutkan[index]) < 0) {
				arrDiurutkan[index +1] = arrDiurutkan[index];
				index = index - 1;
			}
			arrDiurutkan[index + 1] = temp;
		}
		return arrDiurutkan;
		
	}
	
	public static int CARIsequential(String[] ARRdata, String KATADICARI) {
		for(int x = 0; x < ARRdata.length; x++) {
			if(KATADICARI.equalsIgnoreCase(ARRdata[x])) {
				return x;
			}
		}
		return -1;
	}
	
	public static int CARIbinary(String[] ARRdata, String KATADICARI) {
		String[] ARRdataurut = Insertionsort(ARRdata);
		int mid, low, high, putaran;
		low = 0;
		putaran = 0;
		high = (ARRdataurut.length) -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if(ARRdataurut[mid].equalsIgnoreCase(KATADICARI)) {
				return putaran;
			}else if(ARRdataurut[mid].compareToIgnoreCase(KATADICARI) > 0 ) {
				high = mid - 1;
				putaran++;
			}else {
				low = mid + 1;
				putaran++;
			}
		}
		return -1;
	}
	
	public static int INTERPOLATION(String[] ARRdata, String KEYDATA) {
		String[] ARRdataurut = Insertionsort(ARRdata);
		int low = 0, high = 0, mid = 0;
		do {
			double tempmid = low + (((double)high - (double)low) / (double)ARRdataurut[high].compareToIgnoreCase(ARRdataurut[low])) * (double)(KEYDATA.compareToIgnoreCase(ARRdataurut[low]));
			mid = (int)tempmid;
			
			if(ARRdata[mid].equalsIgnoreCase(KEYDATA)) {
				return mid;
			}else if (ARRdataurut[mid].compareToIgnoreCase(KEYDATA) >= 0) {
				high = mid <= 0 ? 0 : mid -1;
			}else {
				low = mid >= ARRdataurut.length -1 ? ARRdataurut.length -1 : mid + 1;
			}
			
		}while(ARRdataurut[low].compareToIgnoreCase(KEYDATA) <= 0 && ARRdataurut[high].compareToIgnoreCase(KEYDATA) >= 0);
		
		return mid;

	}
	
	public static void OUTPUT(int pencarian) {
		if(pencarian != -1) {
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println("Data ditemukan");
			System.out.printf("Dengan %d putaran \n", pencarian);
		}else if (pencarian == -1) {
			System.out.println("\nData tidak ditemukan");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan sebuah kalimat:  ");
		String KALIMAT = scan.nextLine();
		String[] KALIMATSPLIT = KALIMAT.split("\\s+"); // memisahkan kalimat menjadi kata dan dimasukkan ke dalam array String
		System.out.print("Kata yang dicari:  ");
		String kata = scan.next();
		
		boolean loop;
		while(loop = true) {
			System.out.println("------------------");
			System.out.println("1. Sequential");
			System.out.println("2. Binary");
			System.out.println("3. Interpolation");
			System.out.println("4. Abort System!!!");
			System.out.print("Pilih jenis pencari: ");
			int PENCARI = scan.nextInt();
			
			if(PENCARI == 1) {
				int Pencarian = CARIsequential(KALIMATSPLIT, kata);
				OUTPUT(Pencarian + 1);
			}else if (PENCARI == 2) {
				int Pencarian = CARIbinary(KALIMATSPLIT, kata);
				OUTPUT(Pencarian);
			}else if (PENCARI == 3) {
				int Pencarian = INTERPOLATION(KALIMATSPLIT, kata);
				OUTPUT(Pencarian);
			}else {
				loop = false;
				break;
			}
		}
		System.out.println("Sampai bertemu lagi");
	}

}
