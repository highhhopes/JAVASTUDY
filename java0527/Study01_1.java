package java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Study01_1 {
	
	// jdbc > 데이터베이스타입 > 호스트(IP) > 포트 > 데이터베이스명
	//jdbc:oracle:thin:@//[HOST][:PORT]/SERVICE
	String driver = "org.mariadb.jdbc.Driver";	
	String 주소 = "jdbc:mariadb://localhost:3306/Study";
	String 사용자 = "root";
	String 비밀번호 = "2658";
	
	public void 접속() {
		System.out.println("접속 시작!");
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			
			String sql1 = "create OR REPLACE table test (no int, name varchar(50))";
			// create OR REPLACE table 테이블명 (no int, name varchar(50))";
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.execute();
			
			
			String sql2 = "insert into test (name, no) value('하이', 1)";	
									// 테이블 명 (순서가 어떻게 되든 옆에 value랑 맞춰주면 됨
			ps = conn.prepareStatement(sql2);
			int result =  ps.executeUpdate();
			System.out.println(result);
			
			
			// sql = select문 실행해서 위의 insert된 데이터를 출력 하시오
			
			String sql3 = "select * from test";
							// 뭐를 from 어디서 불러온다는 뜻
			ps = conn.prepareStatement(sql3);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);				
//				System.out.println(no + ", " + name);
			}
			
			
			String sql4 = "update test set name = '안녕'";
								// 테이블 명 set 컬럼명 = 고칠 값
			ps = conn.prepareStatement(sql4);
			result =  ps.executeUpdate();
			System.out.println(result);
			
			// 데이터 확인 
			ps = conn.prepareStatement(sql3);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
				
				String sql5 = "delete from test";
							
				ps = conn.prepareStatement(sql5);
				result = ps.executeUpdate();
				System.out.println(result);
			}
			
			// 데이터 확인
			
			ps = conn.prepareStatement(sql3);
			rs = ps.executeQuery();
			int cnt = 0;
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
				cnt++;
//			System.out.println(no + ", " + name);
			}
			System.out.println("행수 : " + cnt);
			// 데이터 확인
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}