package java0521;

public class Study01 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제2) 배열 크기가 10이고 초기의값의 아래와 같다.
		 *      연산할 값은 9로 고정으로 사용하여 배열에 빼기 연산으로
		 *      다시 넣으시오.
		 * 출력 예시)
		 * 인덱스		초기값	연산할값		배열에들어갈 값
		 * 0		9		9			(9 - 9)
		 * 1		8		9			(8 - 9)
		 * 2		7		9			(7 - 9)
		 * 3		6		9			(6 - 9)
		 * 4		5		9			(5 - 9)
		 * 5		4		9			(4 - 9)
		 * 6		3		9			(3 - 9)
		 * 7		2		9			(2 - 9)
		 * 8		1		9			(1 - 9)
		 * 9		0		9			(0 - 9)
		 ************************************************/
		
		int[] 인덱스 = new int[10];
		int 초기값 = 9;
		
		for(int i = 0; i < 인덱스.length; i++) {
					인덱스[i] = 초기값;
					초기값--;
					//System.out.println(인덱스[i]);
				}
				
		int 연산값 = 9;
		for(int i = 0; i < 인덱스.length; i++) {
			int 값 = (인덱스[i] - 연산값);
			//System.out.println(i);
			//System.out.println(연산값);
			인덱스[i] = 값;
		}
		
		for(int i = 0; i < 인덱스.length; i++) {
			System.out.println(인덱스[i]);
		}
			
	}

}
