package teori;

public class NO3_BINARY {
	
	public static int findbinary(int[] arr_data, int keycari) {
		int mid, low, high;//declare mid low high
		low = 0;
		high = (arr_data.length) - 1;
		while(low <= high) {
			mid = (low+high) /2;
			if(arr_data[mid] ==  keycari) {//true dan ditemukan
				return mid;
			}else if(arr_data[mid] > keycari) {//apabila kondisi 1 tidak memenuhi
				high =  mid - 1;
			}else {
				low = mid + 1;//apabil 2 kondisi diatas tidak memenuhi
			}
		}
		return -1;
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mydata = {21, 6, 90, 51, 15, 67};// data yang ingin dicari
		int findingindexdata = findbinary(mydata, 67);//mencari data yang ingin diputar
		System.out.printf("67 ada di index : %d", findingindexdata);//diexecute ke console hasilnya
	}

}
