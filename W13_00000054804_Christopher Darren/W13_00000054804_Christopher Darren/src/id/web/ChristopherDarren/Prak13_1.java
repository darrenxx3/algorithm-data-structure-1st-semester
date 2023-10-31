package id.web.ChristopherDarren;
//stack
public class Prak13_1 {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; //adalah maximun stack yang bisa dipakai
	
	boolean isEmpty() {
		return (top < 0);
	}
	
	Prak13_1(){ //menggunakan public class nama yang digunakan
		top = -1;
	}
	
	boolean push(int x) {
		if(top >= (MAX - 1)) {
			return false;
		}else {
			a[++top] = x;
			System.out.println(x + "  pushed into stack");
			return true;
		}
	}
	
	int pop() { //ngeskip data /delete
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
	}
	
	public static void main(String args[]) {
		Prak13_1 s = new Prak13_1();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + "  Popped from stack");
	}
	
}
