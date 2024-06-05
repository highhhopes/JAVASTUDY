package java0521;

public class Study07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***********************************************
		 * 문제6) [3행 5열] 2차원 배열을 이용하여 출력하시오.
		 * 단, 주어진 데이터를 이용 하기
		 * 단, 아래의 참조 코드를 이용하여 "값 사이는 3칸 공백", "값은 2칸으로 오른쪽 맞춤" 출력
		 *  >> 참조 코드 : System.out.printf("%2d   ", 배열[행][열]);
		 * 출력 예시)
		 *  5    8   10    6    4
		 * 11   20    1    3    2
		 *  7    9   14   22    3 
		 ************************************************/
		
		int[][] a = new int[][] {
			{ 5,  8, 10,  6, 4},
			{11, 20,  1,  3, 2},
			{ 7,  9, 14, 22, 3}
		};
		
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[1].length; j++) {
				
				System.out.printf("%2d   ", a[i][j]);
			}
			System.out.println();
		}

	}

}
