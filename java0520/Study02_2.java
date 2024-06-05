package java0520;

public class Study02_2 {

	public static void main(String[]arge) {
	
	
		for(int 단 = 1 ; 단 <= 9 ; 단 += 3 ) {

			for(int 증가값 = 1 ; 증가값<=9 ; 증가값++ ){
	
				System.out.print(단 + " X " + 증가값 + " = " + (단 * 증가값) + "	"); 
				int a = 단 + 1;
				int b = a + 1;
				System.out.print(a + " X " + 증가값 + " = " + (a*증가값) + "	");
				System.out.print(b + " X " + 증가값 + " = " + (b*증가값) + "	");
				System.out.println();
			}
			System.out.println();
		}		
	}
}
