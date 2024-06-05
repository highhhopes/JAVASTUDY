package java0524;

public class Study05_1 {
	
	private int a;

	Study05_1(){
		System.out.println(11111111);
		
	}
	
	Study05_1(int a){
		System.out.println(a);
		this.a = a;    //여기있는 this는 맨 위에 있는 int a 를 나타냄
		
	}
	
	void b() {
		System.out.println(this.a);
	}
	
}
//static을 쓰는 순간 그 문장은 메모리에 할당이 된다. 그래서 static 안에 this를 같이 쓰지 못한다.
//this는 전역변수 값을 불러오는 거니까