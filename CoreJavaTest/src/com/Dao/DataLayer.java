package com.Dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.Bean.Bean;


public class DataLayer {
	Bean obj=new Bean();
	HashMap<String,String> hm = new HashMap<String,String>();
	public void add(Bean bo) {

		hm.put(bo.getName(),bo.getPassword());
		
	}

	
		public HashMap User() {
			Bean b1=new Bean("roshni","roshni@123");
			
			hm.put(b1.getName(),b1.getPassword());
			Bean b2=new Bean("varsni", "varsni@123");
			hm.put(b2.getName(), b2.getPassword());
			Bean b3=new Bean("balaji", "balaji@123");
			hm.put(b3.getName(), b3.getPassword());
			Bean b4=new Bean("rahul", "rahul@123");
			hm.put(b4.getName(), b4.getPassword());
			Bean b5=new Bean("kavita", "kavita@123");
			hm.put(b5.getName(), b5.getPassword());
	
		return hm;
		}
	
}

