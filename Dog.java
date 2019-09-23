package com.lxy.prepare.interfaces;

public class Dog implements Pet{
	
	private String name;
	private String color;
	private int age;
	
	
	
	
	public Dog(String name, String color, int age) {
		
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
	public String print(){
		return "Ãû×Ö:"+name+"  ÑÕÉ«:"+color+"  ÄêÁä:"+age;
	}
	
	
	
	
	
	
	
}
