package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so mang array:");
		int size = sc.nextInt();
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Phan tu la :" + A[i]);
			A[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(A));
		int Max = A[0];
		int Min = A[0];
		for (int j = 0; j < size; j++) {
			Max = Math.max(Max, A[j]);
			Min = Math.min(Min, A[j]);
		}
		System.out.println("Max :" + Max);
		System.out.println("Min :" + Min);
	}
}