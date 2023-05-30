package test;

public class Ex08 {
	public static void main(String[] args) {
		// 주사위 2개를 던져서 합이 6이 되는 경우를 모두 출력하시요
		// 총 갯수 출력 - 5
		
		int count1 = 0;
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				if (i+j==6) {
					System.out.println("(" + i + " " + j + ")");
					count1++;
				}
			}
		}
		System.out.println("가능한 경우는 " + count1 + "번");
		
		System.out.println("-----------------");
		
		// 주사위 3개를 던져서 합이 10이 되는 경우를 모두 출력하시오
		// 총 갯수 출력 - 27
		
		int count2 = 0;
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				for (int k=1; k<=6; k++) {
					if (i+j+k==10) {
						System.out.println("(" + i + " " + j + " "+ k + ")");
						count2++;
					}
				}
			}
		}
		System.out.println("가능한 경우는 " + count2 + "번");
	}
}
