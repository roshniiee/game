package com.Service;

import java.util.HashMap;

import com.Bean.Bean;
import com.Dao.DataLayer;

public class Service {
	DataLayer dao=new DataLayer();
	public void addUser(Bean bobj) {
		dao.add(bobj);
		
	}
	public void validateuser(Bean bobj) {
		HashMap<String,String> hm= dao.User();
		if(hm.containsKey(bobj.name)&&hm.containsValue(bobj.password))
		{
			System.out.println("Welcome " +bobj.name.toUpperCase());
			
		}
		else
		{
			System.out.println("invalid user name or password");
		}
		
		
		
		
	
		
			
		
	}
	

}
