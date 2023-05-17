package test;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 어떤 정수 n을 입력받고
		// 1부터 홀수를 차례대로 더하면서 합이 n보다 크면 
		// 그 때까지 더한 홀수의 개수와 합계의 총합을 출력하시오
		// 입력 : 1000 / 출력 : 32, 1024
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0;
		int sum = 0;
		
		for (int i=1; ; i+=2) {
			sum += i;
			n++;
			if (sum>num) break;
		} 
		System.out.printf("%d, %d", n, sum);
	}
}
