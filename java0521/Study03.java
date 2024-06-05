package java0521;

public class Study03 {

	public static void main(String[] args) {
		
		// 1차원 배열 (행) [행, 세로값]
		//0 	<- 배열[0] = ?
		//1
		//2
		//3
		
		int[] 배열 = new int[10];
		//int 배열2[];
		
		
		int 크기 = 배열.length; 
		System.out.println(크기);
		
		배열[0] = 100; // 0 ~ 9
		System.out.println(배열[0]);
		
		
		// 2차원 배열 [행, 세로][열, 가로]
		// [행0, 열0], [행0, 열1]
		// [행1, 열0], [행1, 열1]
		// [행2, 열0], [행2, 열1]
		// [행3, 열0], [행3, 열1]
		
		
		int[][] 배열2 = new int[5][3];
		
		//{0,0}{0,1}{0,2}
		//{1,0}{1,1}{1,2}
		//{2,0}{2,1}{2,2}
		//{3,0}{3,1}{3,2}
		//{4,0}{4,1}{4,2}
		
		int 세로크기 = 배열2.length;
		int 가로크기 = 배열2[1].length;
		
		System.out.println(세로크기);
		System.out.println(가로크기);
		
		배열2[1][1] = 5;
		
		System.out.println(배열2[1][1]);
		
	}

}
