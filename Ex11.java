package test;

public class Ex11 {
	public static void main(String[] args) {
		// 1부터 10까지의 수 중에서 랜덤으로 뽑기
		int range = 10;
		int start = 1;
		int a, b, c;
		
		// Math.random()은 0.0 ~ 0.9999999...
		// Math.random()*range는 0.0 ~ 9.99999999...
		// Math.random()*range+start는 0.0 ~ 10.99999999...
		// int로 정수로 변환 1~10
		
			
		a = (int)(Math.random()*range+start);
		b = (int)(Math.random()*range+start);
		c = (int)(Math.random()*range+start);
		
	
		
		// 1부터 10까지의 정수를 랜덤으로 뽑아오는데 세 개의 수가 서로 겹치지 않도록 출력
		System.out.println("내 풀이");
		while (true) {
			
			if (a==b || b==c || a==c) {
				continue;
			}
			
			if (a!=b && b!=c && a!=c)
				System.out.printf("%d, %d, %d", a, b, c);
				break;
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("선생님 풀이");
		
		
		while (a==b || b==c || a==c) {
			a = (int)(Math.random()*range+start);
			b = (int)(Math.random()*range+start);
			c = (int)(Math.random()*range+start);
			
			
		}
		System.out.printf("%d, %d, %d", a, b, c);
		
	}
}
