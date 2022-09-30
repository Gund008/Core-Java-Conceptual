package com.model;

public class One{
	int x;
    Two t;
	
 public One(Two t) {
	 this.t=t;
	 x=10;
 }
 void display()
 {
	 System.out.println("One's x="+x);
	 t.display();
	 System.out.println("Two's var="+t.y);
	 
 }
}

