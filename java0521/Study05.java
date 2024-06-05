package java0521;

public class Study05 {
	
	/***********************************************
	 * 문제4) [4행 4열] 정수형 2차원 배열을 생성 후
	 *  인덱스 순서대로 1 ~ 16의 값을 넣고 출력 하시오.
	 * 출력 예시)
	 *  1,  2,  3,  4
	 *  5,  6,  7,  8
	 *  9, 10, 11, 12
	 * 13, 14, 15, 16
	 ************************************************/
	
	// 해결 코드 작성 시작

	public static void main(String[]agrs) {
		
		int[][] a = new int[4][4];
		
		int b = 1;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j <a[1].length; j++) {
				a[i][j] = b;
				b++;
			}
		}
		
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[1].length; j++) {
				System.out.print(a[i][j] + ",	");
			}
		System.out.println();
		}
		
	}
	
	
}

