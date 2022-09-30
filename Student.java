package com.model;

public class Student {
	
	int id; 
	String name;
	String address;
	float sal;
	
	void setId(int id) {  
		this.id=id;
	}
	int  getId()
	{
		return id;
	}
    void setName(String address)
    {
    	this.address=address;	
    }
   String getName()
   {
	   	return name;
   }
   void setAddress(String address)
   {
	   this.address=address;
   }
	String getaddress()
	{
		return address;
	}
	void setSal(float sal)
	{
		this.sal=sal;
	}
	float getSal()
	{
		return sal;
	}
}
