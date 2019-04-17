package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		// for (int i = 0; i < 101; i++) {
		// System.out.println(i);
		// }

		// for (int j = 100; j > -1; j--) {
		// System.out.println(j);
		// }

		// for (int a = 2; a < 101; a = a + 2) {
		// System.out.println(a);
		// }

		// for (int b = 1; b < 100; b = b + 2) {
		// System.out.println(b);
		// }

		// for (int c = 0; c < 501; c++) {
		// if (c % 2 == 0) {
		// System.out.println(c + " is even");
		// } else if (c % 2 == 1) {
		// System.out.println(c + " is odd");
		// }
		// }

		// for (int d = 0; d < 701; d++) {
		// if (d % 7 == 0) {
		// System.out.println(d);
		// }
		// }

		// for (int e = 2006; e < 2020; e++) {
		// System.out.println(e + " I was ");
		// }

		// for (int i = 0; i < 3; i++) {
		//
		// for (int ii = 0; ii < 3; ii++) {
		// System.out.print(i);
		// System.out.println(ii);
		//
		// }
		//
		// }

		//for(int a = 0; a < 9; a = a + 3) {
		//	for(int i = 1; i < 4; i++) {
		//		int b = a + i;
		//		System.out.println(b + " ");
		//	}
		//	System.out.println(" ");
		//}

		 //for (int a = 0; a < 100; a = a + 10) {
		 //for (int i = 1; i < 11; i++) {
		 //int b = a + i;
		 //System.out.print(b + " ");
		 //}
		
		 //System.out.println("");
		
		 //}

		for(int i = 0; i < 6; i++) {
			System.out.println("*");
			for(int a = 0; a < 5; a++) {
				System.out.println("*");
			}
		}
	}
}
