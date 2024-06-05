package java0523;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] 배열 = new String[7][7];
		
		for (int i = 0; i < 배열.length  ;i++) {

			for (int j = 0; j < 배열[i].length; j++) {
				if (j < (i + 1)) {
					배열[i][j] = "o";
				} else {
					배열[i][j] = "x";
				}
				
				System.out.print(배열[i][j] + "\t");
				
			}
			System.out.println();
		}
	}

}
