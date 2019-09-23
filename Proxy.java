package com.lxy.prepare.interfaces;

import java.util.Scanner;

public class Proxy implements Net{
	private Real real;
	private String name;
	private String psw;
	
	public Proxy(Real real,String name,String psw){
		this.name = name;
		this.psw = psw;
		this.real = real;
	}
	
	public void browse(){
		if (isCheck()) {
			real.browse();
		}else{
			System.out.println("�û������������");
		}
		
	}
	
	
	
	public boolean isCheck(){
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������˺�");
		String name = sc.next();
		System.out.println("����������");
		String psw = sc.next();
		if (name.equals(this.name)&&psw.equals(this.psw)) {
			flag = true;
		}
		return flag;
	}
	
}
