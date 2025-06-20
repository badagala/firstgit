package com.gss.demotest;

import java.util.HashMap;
import java.util.Map;

public class Orange {

	public static void main(String[] args) {
		
		Map<Integer,String> value=new HashMap<Integer,String>();
		
		value.put(1, "Ravi");
		value.put(2, "Swamy");
		value.put(3, "Teja");
		value.put(4, "Loki");
		value.put(5,"Vijay");
		
		//value.clear();
		value.containsKey(4);
		value.containsValue("tarun");
		value.entrySet();
		value.keySet();
		value.hashCode();
		
		
		System.out.println(value.hashCode());
		
	}
}
