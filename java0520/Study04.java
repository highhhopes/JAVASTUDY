package java0520;

public class Study04 {

	public static void main(String[]agrs) {
		
		int[] 정수형배열 = new int[5];
		
		정수형배열[2] = 5;
		
/*		for(int i = 0; i < 정수형배열.length ; i++ ) {
			System.out.println(정수형배열[i]);
			
		}	*/
		
		//문제1) 인덱스 마지막에 10의 값을 넣고 마지막 인덱스만 출력하시오.

		
		정수형배열[정수형배열.length-1] = 10;
		System.out.println(정수형배열[정수형배열.length-1]);
		
		for(int i = 0; i< 정수형배열.length; i++) {
			System.out.println(정수형배열[i]);
		}
	
	}
	
}
