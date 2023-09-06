package servlet.demos.model;

public class UserDataModel {
	String name;
	String dob;
	String email;
	String mobNo;
	String password;
	String Gender;
	String Status;
	public UserDataModel(String name, String dob, String email, String mobNo, String password, String Gender,
			String Status) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
		this.Gender = Gender;
		this.Status = Status;
	}
	public UserDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}
	@Override
	public String toString() {
		return "UserDataModel [name=" + name + ", dob=" + dob + ", email=" + email + ", mobNo=" + mobNo + ", password="
				+ password + ", Gender=" + Gender + ", Status=" + Status + "]";
	}
	

}
