package java0520;

public class Study02_1 {

	public static void main(String[]arge) {
			
	
	for(int 단 = 1 ; 단 <= 9 ; 단++ ) {
		
		if((단%2) == 1) 
			continue;
		
		for(int 증가값 = 1 ; 증가값<=9 ; 증가값++ ){
			
			System.out.println(단 + " X " + 증가값 + " = " + (단*증가값));
		
		}
		System.out.println("");
		}		
	}
}


