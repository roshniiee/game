package com.UI;

import java.util.Scanner;
import com.Bean.Bean;
import com.Dao.DataLayer;
import com.Service.Service;

public class UserUI {
	Bean b;
	DataLayer daoobj=new DataLayer();
	Service serviceobj=new Service();
	Scanner sc=new Scanner(System.in);
	
	public void login() {//login of the user
		
	System.out.println("User Name: ");
String name=namecheck(sc.next());
	System.out.println("Password: ");
String password=passwordcheck(sc.next(),name);
b=new Bean(name,password);
serviceobj.validateuser(b);
	}
	
	public void createacccount() { //creating a new login 
		
		System.out.println("Enter user Name: ");
		String name=namecheck(sc.next());
		System.out.println("Password: ");
		String pswd=passwordcheck(sc.next(),name);
		System.out.println("Welcome " +name.toUpperCase());
		b=new Bean(name,pswd);
		serviceobj.addUser(b);
		
		
	}
	
	public String namecheck(String name) { //name constraints
		while(true) {
			if(name.length()>5 && name.length()<10)
{
				return name;
			}
			else {
				System.out.println("Name should have atleast 5 letters.");
				System.out.println("Enter again: ");
				name = sc.next();
			}
		
		return name;
		
	}

	}

	public String passwordcheck(String pswd,String name) { //password constraint
		while(true) {
		if(pswd.contains("@"))
		{
	String arr[]=pswd.split("@");
	if(arr[0].equals(name))
	{
		try {
		Integer.parseInt(arr[1]);
		}catch(Exception e) {
			System.out.println("Invalid password");
		}
	}else
	{
		System.out.println("enter valid password format");
	}
		}
		else
		{
			System.out.println("pswd must be of format name@123");
			System.out.println("Enter again: ");
			pswd = sc.next();
		}
		return pswd;
		
	}
}
}

