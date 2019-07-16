package com.Bean;

public class Bean {
	public String name;
	public String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Bean(String name,String password) {
this.name=name;
this.password=password;
		
	}
public Bean() {
	
}

public Bean(String name2) {
	this.name=name2;
	// TODO Auto-generated constructor stub
}


}
