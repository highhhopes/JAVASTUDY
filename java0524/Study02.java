package java0524;

public class Study02 {
	
	static int b = 0;  // 전역 코드는 이 페이지 안에 메인 포함 다 쓸 수 있는 코드를 설정해 놓는 것이다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a();
		
	}

	
	static void a() {       // 밑에 a가 찾아와 if문 다시 시작 그리고 if문의 조건인 b >= 5의 조건을 충족할 때까지 반복
	
		if(b <= 5) {
			System.out.println("안녕!" + b);
			b++;
			a();   // 여기 a 값을 찾아 위로 다시 올라가 static void 'a'() 에 들어와 if 문에 다시 들어온다 그리고 그 것을 반복하여 반복문 같은 구조가 된다.
		}
	}
}