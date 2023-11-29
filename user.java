package com.customer;

public class user {

    private int id;
    private String fName;
    private String lName;
    private String email;
	private String phone;
    private String username;
    private String password;

    public user(int id, String fName, String lName, String email, String phone, String username, String password) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
