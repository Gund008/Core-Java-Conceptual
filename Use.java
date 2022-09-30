package com.model;

public class Use {
	public static void main(String arg[]){
		Student sobj=new Student();
		//Accept
		sobj.setId(11002);
		sobj.setName("sukanya");
		sobj.setAddress("Mg road");
		sobj.setSal(4444);
		
		//Display(ssout)
		System.out.println("Id="+sobj.getId());
	    System.out.println("Name="+sobj.getName());
		System.out.println("Address="+sobj.getaddress());
		System.out.println("Sal="+sobj.getSal());
		
	}

}
