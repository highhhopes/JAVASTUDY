package java0522;

public class Study04 {

  public static void main(String[] args) {

		/***********************************************
		 * 문제4) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     *     ★
	     *    ★★
	     *   ★★★
	     *  ★★★★
	     * ★★★★★
		 ************************************************/

		// 해결 코드 작성 시작

    String 별 = "★";

    /*** 코드 시작 ***/
    
   String[][] a= new String[5][5];
    
    
    for(int i = 0; i < a.length; i++) {
    	
    	for(int j = 0; j < a[1].length; j++) {
    		String b = " ";
    		if(i == 0 && j >= 4) {
    			a[i][j] = 별; 
    		} else if(i == 1 && j >= 3) {
    			a[i][j] = 별; 
    		} else if(i == 2 && j >= 2) {
    			a[i][j] = 별; 
    		} else if(i == 3 && j >= 1) {
    			a[i][j] = 별; 
    		} else if(i == 4 && j >= 0) {
    			a[i][j] = 별; 
    		} else {
    			a[i][j] = b; 
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
