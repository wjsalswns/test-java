package test;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 1부터 100중의 랜덤한 수를 맞추는 게임
		// 예를 들어 cpu가 랜덤한 수를 뽑았는데 69로 가정하면
		// 플레이어가 50을 말하면, cpu UP 이라고 응답
		// 플레이어가 70을 말하면, cpu DOWN 이라고 응답
		// 정답을 맞추면 몇 번 시도헸는데 출력하면 됨
		
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random() * 100) + 1;
		int i = 0;
		while (true) {
			i++;
			int num = sc.nextInt();
			if (num<ran) {
				System.out.println("cpu UP");
			} else if (num>ran) {
				System.out.println("cpu DOWN");
			
			} else if (num == ran) {
				System.out.println("정답!");
				System.out.println(i + "번 시도!");
				break;
			}
			
		}
	}
}
