package java0524;

public class Study03 {
	
	public static void main(String[]agrs) {
		
		a();       // 똑같은 a라도 ()안에 아무것도 없으니 static void a()를 불러내고
		a(1);	   // 이 줄은 ()안에 숫자가 있으니 static void a(int a)를 불러냄 그래서 그 {}에 있는 것들을 실행
		a("");	   // 이 줄은 static void a(String a)
	}
	
	static void a() { 
		
	}
	
	static void a(int a) {
		
	}
	
	static void a(String a) {
	
	}
	

}

/* 앞에 public은 공유 범위를 나타내고 static은 당장은 프로그램을 실행하기 위한 코드라고 알아놓기
	void는 그 창을 반복하기 위해 쓰는 것임 만약 void가 없다면 return으로 반복을 시켜준다. */

//같은 이름이지만 다른 형태를 가지고 있고 가지고 오는 기술을 오버로딩이라는 기술이다.