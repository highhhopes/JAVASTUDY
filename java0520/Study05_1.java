package java0520;

public class Study05_1 {
	
	public static void main(String[]agrs) {
		
		String[][] 배열 = new String[10][10];
		
		for(int i = 0; i < 배열.length; i++) {
			for(int j = 0; j < 배열[i].length; j++) {
				if(j < (i+1)) {
					배열[i][j] = "2";
				}else {
					배열[i][j] = "X";
				}
				System.out.print(배열[i][j] + "	");
			}
			System.out.println();
		}

	}
}
