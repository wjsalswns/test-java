package test;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		double a = 4;	// 분자 값
		double b = 1;	// 분모 값
		double pi = 0;
		
		for (int i=0; i<num; i++) {
			pi += a/b;
			a *= -1;
			b += 2;
		}
		
		System.out.println(pi);
		
	}
}
