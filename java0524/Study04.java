package java0524;

public class Study04 {
	
	static int a = 0;
	static int c = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(a);				//1
		int c = b();						//2   c를 찾기 위해서는 b()로 가라는 뜻
		System.out.println(c);				//6
	}
	
	
	static int b() {
		int c = 5;							//3
//		this.c = c;										//이 문장은 전역코드를 불러오라는 뜻임
		System.out.println(a);				//4
		return c;							//5
	}
}


