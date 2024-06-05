package P0529;

public class Study01 {

	public static void main(String[] args) {

		String 드라이버 = "org.mariadb.jdbc.Driver";
		String 주소 = "jdbc:mariadb://localhost:3306/Study";
		String 사용자 = "root";
		String 비밀번호 = "2658";
		// 데이터 베이스 주소
		new DbControllerStudy(드라이버, 주소, 사용자, 비밀번호);
		// 주소를 DbController로 보내기 위함(연결)
		
		
		
	}

}
