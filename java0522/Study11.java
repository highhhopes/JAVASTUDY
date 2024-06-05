package java0522;

import java.util.Scanner;

public class Study11 {
	public static void main(String[]agrs) {
		
		
		Scanner a = new Scanner(System.in);
		boolean key = false;
		
		 String 별 = "★";
		 String b = " ";
		    
		String[][] 배열1 = new String[5][5];
			for(int i = 0; i < 배열1.length; i++) {		   
				for(int j = 0; j < 배열1[1].length; j++) {
					배열1[i][j] = 별;			   
					}	  
			}
			
			
			for(int i = 0; i < 배열1.length; i++) {
				
				for(int j = 0; j < 배열1[1].length; j++) {
					
					if(i == 1 && j == 4) { 
						배열1[i][j] = b;
					} else if(i == 2  && (j == 4 || j == 3)) {
						배열1[i][j] = b;
					} else if(i == 3  && (j == 4 || j == 3 || j == 2)) {
						배열1[i][j] = b;
					} else if(i == 4  && (j == 4 || j == 3 || j == 2 || j == 1)) {
						배열1[i][j] = b;
					} else {
						배열1[i][j] = 별;
					}
					
					
				}
				
			}
		String[][] 배열2 = new String[5][5];
			for(int i = 0; i < 배열2.length; i++) {	    	
						for(int j = 0; j < 배열2[1].length; j++) {	    		
							배열2[i][j]=별;	    		
						}
				}
		    for(int i = 0; i < 배열2.length; i++) {
		    	
		    	for(int j = 0; j < 배열2[1].length; j++) {

		    		if(i == 0 && j > 0) {
		    			배열2[i][j] = b;
		    		} else if(i == 1 && j > 1) {
		    			배열2[i][j] = b;
		    		} else if(i == 2 && j > 2) {
		    			배열2[i][j] = b;
		    		} else if(i == 3 && j > 3) {
		    			배열2[i][j] = b;
		    		} else {
		    			배열2[i][j] = 별;
		    		}
		    			
		    	
		    	}
		    	
		    }
		String[][] 배열3 = new String[5][9];
			for(int i = 0; i < 배열3.length; i++) {
				for(int j = 0; j < 배열3[1].length; j++){
				
					if(i == 0 && (j < 4 || j >=5)) {
						배열3[i][j] = b; 
					} else if(i == 1 && (j < 3 || j >=6)){
						배열3[i][j] = b;
					} else if(i == 2 && (j < 2 || j >=7)){
						배열3[i][j] = b;
					} else if(i == 3 && (j < 1 || j >=8)){
						배열3[i][j] = b;
					} else {
						배열3[i][j] = 별;
					}
				
					}
				}
			
			
		
		String[][] 배열4 = new String[5][9];
			for(int i = 0; i < 배열4.length; i++) {
	    	
				for(int j = 0; j < 배열4[1].length; j++) {
					if(i == 1 && (j == 0 || j >= 8)) {
						배열4[i][j] = b;
					} else if(i == 2 && (j <= 1 || j >= 7)) {
						배열4[i][j] = b;
					} else if(i == 3 && (j <= 2 || j >= 6)) {
						배열4[i][j] = b;
					} else if(i == 4 && (j <= 3 || j >= 5)) {
						배열4[i][j] = b;
					} else if(i == 5 && (j <= 4 || j >= 4)) {
						배열4[i][j] = b;
					} else {
						배열4[i][j] = 별;
					}
				}
			}
		
		
		
		
		while(true) {
			
			System.out.println("1 ~ 4 정수의 값을 입력하세요.");
			int 입력값 = a.nextInt();
			
			String[][] 배열 = new String[1][1];
			
			if(입력값 == 1) {
				배열 = 배열1;
			}else if(입력값 == 2) {
				배열 = 배열2;
			}else if(입력값 == 3) {
				배열 = 배열3;
			}else if(입력값 == 4) {
				배열 = 배열4;
			}
			
			
			switch(입력값) {
				case 1:
				case 2:
				case 3:	    
				case 4:	    
					
					for(int i = 0; i < 배열.length; i++) {
				    	for(int j = 0; j < 배열[i].length; j++) {
				    		System.out.print(배열[i][j]);
				    	}
				    	System.out.println();
					}
				break;
			
			default:
				System.out.println("잘못된 값입니다.");
				key = true;
			
			}
			
			if(key) break;
		}
		a.close();			
	}
	

}
