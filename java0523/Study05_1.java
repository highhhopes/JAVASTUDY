package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스와 반복문를 이용하여 계산기 만들기
 *********************************/

public class Study05_1 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		String a = "";
		while(true) {
		System.out.println("수 : ");
		num1 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("연산 : ");	
		a = sc.nextLine();
		
		System.out.println("수 : ");
		num2 = sc.nextInt();
		
		if("+".equals(a)) {
			result = num1 + num2;
		}else if("-".equals(a)){
			result = num1 - num2;
		}else if("*".equals(a)){
			result = num1 * num2;
		}else if("/".equals(a)){
			result = num1 % num2;
		}
		
		System.out.println("결과는 : " + result);
		System.out.println();
		
		
		/** 객체 제거 **/
		
		
	}
	}
}
