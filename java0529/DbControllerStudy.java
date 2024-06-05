package P0529;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java0527.TestDTO;

public class DbControllerStudy {
	
	private String 드라이버;
	private String 주소;
	private String 사용자;
	private String 비밀번호;
	// 껍데기
	public DbControllerStudy(String 드라이버, String 주소, String 사용자, String 비밀번호) {
		this.드라이버 = 드라이버;
		this.주소 = 주소;
		this.사용자 = 사용자;
		this.비밀번호 = 비밀번호;
		
		시작();
	}
	
	
	private void 시작() {
		try {
			// try catch문은 try를 먼저 시작하고 그 문장에서 오류가 났을 시 e.printStackTrace();가 출력 되므로서
			// 어디서 어떤 오류났는지 알기 위해서이다.
			Class.forName(드라이버);
			// 외부 라이러리의 존재 여부를 확인하는 코드로 필수는 아니다.
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			// 데이터베이스 와 연결하기 위함
			기능제어(conn);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void 기능제어(Connection conn) {
		// connection을 쓴 이유는 데이터베이스에 연결시켜 저장하기 위해서
		System.out.println("테이블 생성 합니다.");
		String sql = "create OR REPLACE table 명단 (";
		sql += " 번호 	int,";
		sql += " 이름 	varchar(50),";
		sql += " 성별 	varchar(50),";
		sql += " 특징 	varchar(50),";
		sql += " 해적단 	varchar(50),";
		sql += " 역활		varchar(50)";
		sql += " )";
		// 전에 했던 것 처럼 옆으로 쭉 늘어 놓을 수 있는데 이렇게 작성한 이유는 사용자가 읽기 편하기 위해서
		if(테이블생성(sql, conn)) {
			// 테이블생성 이라는 부분이 true가 되면 if문 실행
			// 테이블생성 부분이 모두 true가 돼면 if문 실행이기 때문에 테이블생성이 먼저 실행된다.
			// 테이블생성 부분으로 
			
			cud기능(데이터생성(), conn); // << 
			// sql = 데이터생성();
			// cud기능 부분으로 가라는 뜻인데 sql대신에 return을 써서 데이터생성에 저장했기 때문에 이렇게 써도 무관하다
			
			데이터읽기("select * from 명단", conn);
			// 데이터읽기로 괄호안에 명단에 있는 모든(*) 데이터를 읽으라는 뜻
			sql = "update 명단 set 역활 = '광대' where 번호 = 1";
			cud기능(sql, conn);
			// 바로 위 sql을 update문으로 바꾸고 그걸 바로 가져옴
			// 위에 있는 cud기능(데이터생성(), conn);와 다른 점은 다른 DML(delete 등)을 사용
			// 다른 값의 sql을 가지고 밑에 cud로 감
			데이터읽기("select * from 명단", conn);
			// 바꾼 데이터를 확인하기 위해 씀
			
			sql = "delete from 명단 where 번호 = 1";
			cud기능(sql, conn);
			// sql을 다시 바꿈 delete문으로
			
			데이터읽기("select * from 명단", conn);
			// 반복
		} else {
			System.out.println("테이블 생성 실패!!");
		}
	}
	
	private String 데이터생성() {
		// 여기서 conn이 없는 이유는 데이터베이스와 당장 연결시키지 않을 것이므로
		DataDto data = new DataDto();
		// DataDto를 불러오기 와서 DataDto에 set을 사용해서 집어 넣고 get 불어오기 위함
		data.set번호(1);
		data.set이름("몽키 D 루피");
		data.set성별("남자");
		data.set특징("고무고무 열매");
		data.set해적단("밀짚모자");
		data.set역활("선장");
		
		String sql = "insert into 명단 value (";
		
		sql += data.get번호();
		sql += ",'" + data.get이름() + "'";
		sql += ",'" + data.get성별() + "'";
		sql += ",'" + data.get특징() + "'";
		sql += ",'" + data.get해적단() + "'";
		sql += ",'" + data.get역활() + "'";

		sql += ")";
		// 이 코드는 데이터베이스에 저장하기 위한 코드지만 
		// 밑에 데이터 읽기는 사람이 읽기 위해 만든 코드다
		
		System.out.println(sql + "2");
		return sql;
		// sql에 저장을 하고 저장된 값을 밖에서도 사용할 수 있게 return을 해준 것이다.
	}
	
	private boolean 테이블생성(String sql, Connection conn) {
		System.out.println(sql + "1");
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true;  // << 성공
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;  // << 실패
	}
	
	private void 데이터읽기(String sql, Connection conn) {
		System.out.println(sql + "4");
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			// 설명 참조
			while(rs.next()) {
				// next는 다음 행이 있으면 실행한다는 조건이다.
				DataDto data = new DataDto();
				
				data.set번호(rs.getInt("번호"));
				data.set이름(rs.getString("이름"));
				data.set성별(rs.getString("성별"));
				data.set특징(rs.getString("특징"));
				data.set해적단(rs.getString("해적단"));
				data.set역활(rs.getString("역활"));
				// 데이터베이스에 있는 데이터를 자바로 가져오는 코드
				// 사람이 알아볼 수 있게 한글로 가져오기 위한 코드
				System.out.println(data + "5");
				
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void cud기능(String sql, Connection conn) {
		System.out.println(sql + "3");
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			// 자바에서 데이터베이스의 select, insert 등의 명령어를 사용하기 위한 외부 라이브러리다 그것을 호출
			int result = ps.executeUpdate();
			// int result는 적을 필요 없는데 결과값을 보기 위함이다.
			// ps를 실행하기 위해 executeUpdate를 사용
			System.out.println(result);
			//그 값을 확인하기 위해 print
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}