package test;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 삼각형의 빗변의 길이를 입력했을 때, 직각 삼각형이 될 수 있는지 여부를 확인
		// 세 변의 길이는 100을 넘지 않으며, 정수값만 가진다.
		// 피타고라스의 정리
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = num*num;
		boolean possible = false;
		
		loop:
		for (int i=1; i<100; i++) {
			for (int j=1; j<100; j++) {
				if (c == i*i+j*j) {
					System.out.println("가능");
					possible = true;
					break loop;
				}
			}
		}
		
		if (possible == false) {
			System.out.println("불가능");
		}
	}
}
