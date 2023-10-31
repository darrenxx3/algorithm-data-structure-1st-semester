package id.web.Darren;

public class Prak8_1 {
	
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
		
		switch(x.KodeStatus) {
		case 1:
			System.out.printf("Status Anda Adalah %s",x);
		case 2:
			System.out.printf("Status Anda Adalah %s",x);
			break;
		case 3:
			System.out.printf("Status Anda Adalah %s",x);
			break;		
		default:
			System.out.printf("Status Anda... nampaknya tidak jelass");
		}
	}

}
