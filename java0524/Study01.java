package java0524;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b1 = 합(1,2); // 3        여기서 b1을 읽기 위해 찾는데 그 b1은 밑에 private static int 합 에 가서 읽고 순서대로 int a, int b가 1, 2 가 되어 return 받고 돌아와 다음 문장을 실행한다.
		System.out.println(b1);
		
		int b2 = 빼기(1,2); // -1 
		System.out.println(b2);
		
		int b3 = 곱하기(1,2); //  2
		System.out.println(b3);
		
		int b4 = 나누기(1,2); //  0
		System.out.println(b4);

	}
	
	private static int 합(int a , int b) {
		return (a + b);                        // return 으로 메인메소드에 가서 코드를 읽어서 return을 써주는 것이다.
	}
	
	static int 빼기(int a, int b) {
		return(a - b);
	}
	
	static int 곱하기(int a, int b) {
		return (a * b);
	}
	
	static int 나누기(int a, int b) {
			return (a / b);
	}
	
	
	
	
	
	}
	
	

