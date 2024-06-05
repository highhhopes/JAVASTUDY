package java0524;

public class Study05_0 {
	
	
	public static void main(String[]agrs) {
		
//		new Study05_1(); 			// 실행 또 호출
		
		
		
		Study05_1 s51 = new Study05_1(1); 	//만약 괄호안에 1이 없다면 그냥 Study05_1()를 불러옴	그런데 숫자인 1이 있기 떄문에 	Study05_1(1)	// 실행 또 호출		
		System.out.println(s51);      // >>study05_1의 위치를 출력

		
		
		s51.b(); 			// >> Study05_1에 있는 void b()에 있는 것을 실행
		
		
	
		
		
	}

}
