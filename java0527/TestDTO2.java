package java0527;

public class TestDTO2 {
	
	private int no;
	private String name;
	private String sex;
	private String feature;
	private String groupName;
	private String role;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TestDTO [no=" + no + ", name=" + name + ", sex=" + sex + ", feature=" + feature + ", groupName=" + groupName
				+ ", role=" + role + "]";
	}
	
	

}
