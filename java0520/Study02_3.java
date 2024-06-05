package java0520;

public class Study02_3 {
	
	public static void main(String[]arge) {
		
		int step = 3;
		
		for(int 단 = 1 ; 단 <= 9 ; 단 += step ) {

			for(int 증가값 = 1 ; 증가값 <= 9 ; 증가값++){
				
				for(int s = 단 ; s < (단+step) ; s++) {
					System.out.print(s + " X " + 증가값 + " = " + (s * 증가값) + "	");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}