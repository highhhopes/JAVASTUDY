package java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Study02_1 {
	String driver = "org.mariadb.jdbc.Driver";	
	String 주소 = "jdbc:mariadb://localhost:3306/Study";
	String 사용자 = "root";
	String 비밀번호 = "2658";
	
	public void 접속() {
		System.out.println("접속 시작");
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			
			String sql1 = "create OR REPLACE table test2 (no int, name varchar(50), sex varchar(20), feature varchar(50), groupName varchar(30), role varchar(20))";
			
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.execute();
			
			
			String sql2 = "insert into test2 (no, name, sex, feature, groupName, role) value(1,'몽키 D 루피', '남자', '고무고무 열매', '밀짚모자', '선장')";
			String sql3 = "insert into test2 (no, name, sex, feature, groupName, role) value(2, '롤로노아 조로', '남자', '삼도류', '밀짚모자', '부선장')";	
			String sql4 = "insert into test2 (no, name, sex, feature, groupName, role) value(3, '상디', '남자', '요리사', '밀짚모자', '요리사')";	
			String sql5 = "insert into test2 (no, name, sex, feature, groupName, role) value(4, '나미', '여자', '항해사', '밀짚모자', '항해사')";	
			String sql6 = "insert into test2 (no, name, sex, feature, groupName, role) value(5, '우솝', '남자', '사격', '밀짚모자', '저격수')";	
			String sql7 = "insert into test2 (no, name, sex, feature, groupName, role) value(6, '토니토니 초파', '미정', '사람사람 열매', '밀짚모자', '의사')";	
			String sql8 = "insert into test2 (no, name, sex, feature, groupName, role) value(7, '니크 로빈', '여자', '꽃꽃 열매', '밀짚모자', '고고학자')";	
			String sql9 = "insert into test2 (no, name, sex, feature, groupName, role) value(8, '프랑키', '남자', '사이보그', '밀짚모자', '조선공')";	
			String sql10 = "insert into test2 (no, name, sex, feature, groupName, role) value(9, '브룩', '남자', '연주자', '밀짚모자', '선원')";	
			
			ps = conn.prepareStatement(sql2);
			int result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql3);
			result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql4);
			result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql5);
			result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql6);
			result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql7);
			result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql8);
			result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql9);
			result =  ps.executeUpdate();
			System.out.println(result);
			ps = conn.prepareStatement(sql10);
			result =  ps.executeUpdate();
			System.out.println(result);
			
			String sql11 = "select * from test2";
			
			ps = conn.prepareStatement(sql11);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String feature = rs.getString("feature");
				String groupName = rs.getString("groupName");
				String role = rs.getString("role");
				
				TestDTO2 testDto = new TestDTO2();
				
				testDto.setNo(no);
				testDto.setName(name);
				testDto.setSex(sex);
				testDto.setFeature(feature);
				testDto.setGroupName(groupName);
				testDto.setRole(role);
				System.out.println(testDto);
				
			}
			
			
			String sql12 = "insert into test2 (no, name, sex, feature, groupName, role) value(1, '버기', '남자', '동강동강 열매', '버기', '선장')";
				ps = conn.prepareStatement(sql12);
				result = ps.executeUpdate();
				System.out.println(result);
			
			
			String sql13 = "update test2 set role = '광대'";			
			ps = conn.prepareStatement(sql3);
			result =  ps.executeUpdate();
			System.out.println(result);
			
			// 데이터 확인 
			ps = conn.prepareStatement(sql1);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String feature = rs.getString("feature");
				String groupName = rs.getString("groupName");
				String role = rs.getString("role");
				
				TestDTO2 testDto = new TestDTO2();
				
				testDto.setNo(no);
				testDto.setName(name);
				testDto.setSex(sex);
				testDto.setFeature(feature);
				testDto.setGroupName(groupName);
				testDto.setRole(role);
				
				System.out.println(testDto);
				
//				System.out.println(no + ", " + name);
			}
			
			// 데이터 확인
			
			ps = conn.prepareStatement(sql1);
			rs = ps.executeQuery();
			int cnt = 0;
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String feature = rs.getString("feature");
				String groupName = rs.getString("groupName");
				String role = rs.getString("role");
				
				TestDTO2 testDto = new TestDTO2();
				
				testDto.setNo(no);
				testDto.setName(name);
				testDto.setSex(sex);
				testDto.setFeature(feature);
				testDto.setGroupName(groupName);
				testDto.setRole(role);
				System.out.println(testDto);
				
//				System.out.println(no + ", " + name);
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