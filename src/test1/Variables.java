package test1;

public class Variables {
	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		int c = 99;
<<<<<<< HEAD
	 System.out.println( a + b - c);
	}

=======
		System.out.println(a + b - c);
		int tong = a + b - c;
		for (int i = 0; i < 10; i++) {
			int giamdan = tong - 1;
			System.out.println(giamdan);
			tong = giamdan;
		}
	}
>>>>>>> 82ebe30 (1)
}
