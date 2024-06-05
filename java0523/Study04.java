package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 설문조사 하기
 *********************************/

public class Study04 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		
		String[][] a = new String[10][2];
		
		
		a[0][0] =  "당신의 나이는 어떻게 되십니까?";
		a[1][0] =  "당신의 이름은 어떻게 되십니까?";
		a[2][0] =  "당신이 사는 지역은 어떻게 되십니까?";
		a[3][0] =  "당신의 성별은 어떻게 되십니까?";
		a[4][0] =  "당신의 취미는 어떻게 되십니까?";
		a[5][0] =  "당신의 출신지는 어떻게 되십니까?";
		a[6][0] =  "당신의 특기는 어떻게 되십니까?";
		a[7][0] =  "당신의 오늘 계획은 어떻게 되십니까?";
		a[8][0] =  "당신의 내일 계획은 어떻게 되십니까?";
		a[9][0] =  "당신이 제일 좋아하는 음식은 어떻게 되십니까?";
		
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i][0]);
			String b = sc.nextLine();
			a[i][1] = b;
		}
		
		System.out.println("설문조사가 끝났습니다.");
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[1].length; j++) {
				System.out.print(a[i][0] + "\t");
				System.out.println("->" + a[i][1]);
			}
		}
		
		
		/** 객체 제거 **/
		sc.close();
		
	}

}
