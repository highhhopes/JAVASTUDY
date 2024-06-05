package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스와 반복문를 이용하여 계산기 만들기
 *********************************/

public class Study05_0 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		
		String 더하기 = "+";
		String 빼기=  "-";
		String 곱하기 = "*";
		String 나누기 = "/";
		
		while(true) {
		
			System.out.println("숫자 1 : ");
			int a = sc.nextInt();
			
			String b = sc.next();
			
			System.out.println("숫자 2 : ");
			int c = sc.nextInt();
		
			String d = "";
		
			switch(b) {
				case "+":
					d = a + " " + 더하기 + " " + c + " = "  + (a + c);
				
					break;
				case "-":
						d = a + " " + 빼기 + " " + c + " = "  + (a - c);
				
						break;
				case "*":
					d = a + " " + 곱하기 + " " + c + " = "  + (a * c);
					
					break;
				case "/":
					d = a + " " + 나누기 + " " + c + " = "  + (a / c);
					
					break;
			
				default:
			}
		
			System.out.println(d);
		/** 객체 제거 **/
//		sc.close();
		}
	}

}
