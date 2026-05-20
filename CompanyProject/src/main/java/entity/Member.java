package entity;

public class Member {
	private int id;
	private String user;
	private String username;
	private String password;
	private String phone;
	private String address;
	
	public Member(String user, String username, String password, String phone, String address) {
		super();
		this.user = user;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
