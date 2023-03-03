package com.sel;



public class Abc extends Xyz implements Inter1{
	
	public void stud1() {
		System.out.println("child");
	}
	
	public void stu() {
		System.out.println("overrided");
	}
	
	

	@Override
	public void login() {
		System.out.println("abc");
	}
	
	
	public static void main(String[] args) {
		Abc a = new Abc();
		a.login();
		
		
		
		
	}
	

}
