package java0520;

public class Study05_0 {
	
	public static void main(String[]agrs) {
		
		int[][] 배열 = new int[4][4];
		
		배열[1][1] = 10;
		배열[2][2] = 20;
		배열[3][3] = 30;
		
		for(int i = 0; i < 배열.length; i++) {
			
			for(int j = 0; j < 배열[i].length; j++) {
			System.out.print(배열[i][j] + "	");
			}
			System.out.println("");
		}
		
	}

}
