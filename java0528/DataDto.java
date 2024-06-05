 package java0528;

public class DataDto {

	private int 번호;
	private String 이름;
	private String 성별;
	private String 특징;
	private String 해적단;
	private String 역활;
	
	public int get번호() {
		return 번호;
	}
	public void set번호(int 번호) {
		this.번호 = 번호;
		// set번호는 DbContriller에 있는 번호를 뜻하는 것이고 그것을 int 번호를 만들어 위에 번호로 집어넣는 다는 뜻
		// 맨 위 this 번호는 전역 변수니까 나중에도 쓰기위해 넣는다고 이해하면 됨
	}
	public String get이름() {
		return 이름;
		// 그리고 get은 그 set을 통해 입력한 값을 다시 불러와야 되기 때문이다.
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get성별() {
		return 성별;
	}
	public void set성별(String 성별) {
		this.성별 = 성별;
	}
	public String get특징() {
		return 특징;
	}
	public void set특징(String 특징) {
		this.특징 = 특징;
	}
	public String get해적단() {
		return 해적단;
	}
	public void set해적단(String 해적단) {
		this.해적단 = 해적단;
	}
	public String get역활() {	
		return 역활;
	}
	public void set역활(String 역활) {
		this.역활 = 역활;
	}
	@Override
	public String toString() {
		return "DataDto [번호=" + 번호 + ", 이름=" + 이름 + ", 성별=" + 성별 + ", 특징=" + 특징 + ", 해적단=" + 해적단 + ", 역활=" + 역활 + "]";
	}
	
}
