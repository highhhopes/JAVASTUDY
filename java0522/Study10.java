package java0522;

import java.util.Scanner;

public class Study10 {
	
	public static void main(String[]agrs) {
		
		Scanner a = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1 ~ 4 정수의 값을 입력하세요.");
			int 입력값 = a.nextInt();
			
			switch(입력값) {
				case 1:
					System.out.println("값이 1입니다.");
					break;
				case 2:
					System.out.println("값이 2입니다.");
					break;
				case 3:
					System.out.println("값이 3입니다.");	
					break;
				case 4:
					System.out.println("값이 4입니다.");
					break;
		
				}
			
		
		System.out.println();
		
		
		
		a.close();
		
		
		
		
//			if(입력값 == 0) {
//			System.out.println("0을 입력하셨습니다.");
//			}
//			if(입력값 == 1) {
//				System.out.println("1을 입력하셨습니다.");
//			}
//			if(입력값 == 2) {
//				System.out.println("2을 입력하셨습니다.");
//			}
//			if(입력값 == 3) {
//				System.out.println("3을 입력하셨습니다.");
//			}
//			if(입력값 == 4) {
//				System.out.println("4을 입력하셨습니다.");
//			}
		}
	}

}
