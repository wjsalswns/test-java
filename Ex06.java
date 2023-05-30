package test;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 팩토리얼 계산기
		// 5! = 5*4*3*2*1
		// 어떤 수를 입력받으면 그 수의 팩토리얼을 출력!
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;	// 누적 곱을 구할 땐 항상 1로 초기화
		int chak = num;
//		for (int i=num; i>=1; i--) {
//			fact *= i;
//		}
		
		while (num > 0) {
			fact *= num;
			num--;
		}
		
		System.out.printf("%d! = %d", chak, fact);
	}
}
