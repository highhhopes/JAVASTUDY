package java0522;

public class Study06 {
	
	  public static void main(String[] args) {

			/***********************************************
			 * 문제6) 2차원 배열를 이용하여 별(★)를 출력하시오
			 * 출력 예시)
		     *     ★
		     *    ★★★
		     *   ★★★★★
		     *  ★★★★★★★
		     * ★★★★★★★★★
			 ************************************************/

			// 해결 코드 작성 시작

		    String 별 = "★";
		
		    /*** 코드 시작 ***/
		    String[][] a = new String[5][9];
		    
		    String b = " ";
		    
		    for(int i = 0; i < a.length; i++) {
				
				for(int j = 0; j < a[1].length; j++){
					
					if(i == 0 && (j < 4 || j >=5)) {
						a[i][j] = b; 
					} else if(i == 1 && (j < 3 || j >=6)){
						a[i][j] = b;
					} else if(i == 2 && (j < 2 || j >=7)){
						a[i][j] = b;
					} else if(i == 3 && (j < 1 || j >=8)){
						a[i][j] = b;
					} else {
						a[i][j] = 별;
					}
					
					}
			}
		    
		    
		    for(int i = 0; i < a.length; i++) {
				
				for(int j = 0; j < a[1].length; j++) {
					System.out.print(a[i][j]);
					}
				System.out.println();
			}
		
		
		
		    /*** 코드 종료 ***/

	  }

}
