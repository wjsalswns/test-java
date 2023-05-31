package test;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 피보나치 수열 만들기
		// 1 1 2 3 5 8 13
		// 예를 들어 5를 입력하면 
		// 1 1 2 3 5 출력
		
		// 1 + 1 = 2
		// 1 + 2 = 3
		// 2 + 3 = 5
		

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int jj = 1;
		int j = 1;
		int sum = jj + j;
		
		System.out.println(jj);
		System.out.println(j);
		
		for (int i=3; i<=num; i++) {
			int now = jj + j;
			sum += now;
			System.out.println(now);
			
			jj = j;
			j = now;
			
		}
		System.out.println();
		System.out.println(sum);
	}
}
