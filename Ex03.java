package test;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 값을 하나 입력받고 1부터 1씩 증가하면서 누합을 구하다가 입력한 값보다 커지는 순간 반복을 중단하고
		// 그때 마지막으로 더해진 값과 총합을 출력하시오
		// ex) 10 입력
		// 1 + 2 + 3 + 4 + 5 이 때, 15가 되면서 10보다 커지므로 반복을 멈추고 
		// 출력은 5, 15가 되면 된다
		// 입력 1000 / 출력 45, 1035
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		
		while (true) {
			i++;
			sum += i;
			
			if (sum>num) break;
				
		}
		System.out.printf("%d, %d", i, sum);
	}
}
