package test;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 선택받은 정수만큼(랜덤하게 정함) 성적을 입력받아서 총점과 평균을 출력하시오
		// 총 0명의 학생의 총점은 00점이고, 평균은 00.0점이다
		// 몇 명의 성적을 입력받겠습니까?
		// 5명
		
		// 5명의 데이터를 입력받아서 처리
		
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextInt();
		
		System.out.println("총 몇 명의 성적을 입력받겠습니까?");
		System.out.printf("%d명", (int)num1);
		
		double sum = 0;
		double av = 0.0;

		
		for (int i=0; i<num1; i++) {
			int num2 = sc.nextInt();
			sum += num2;
			av = sum/num1;
		}
		System.out.printf("총 %d명의 학생의 총점은 %d이고, 평균은 %.1f이다.", (int)num1, (int)sum, av);
	}
}
