package test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 2~9 중 번호를 입력하여 그 번호에 해당하는 구구단을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
