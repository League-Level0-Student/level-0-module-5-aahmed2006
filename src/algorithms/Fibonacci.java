package algorithms;

public class Fibonacci {
public static void main(String[] args) {
	
	int f1 = 0;
	int f2 = 1;
	int f3 = f1 + f2;
	
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	
	for(int i = 0; i < 9; i++) {
		f1 = f2;
		f2 = f3;
		f3 = f1 + f2;
		System.out.println(f3);
	}
}
}
