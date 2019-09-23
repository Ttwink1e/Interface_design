package com.lxy.prepare.interfaces;

public class NetTest {

	public static void main(String[] args) {
		
		Real real = new Real();
		Proxy p = new Proxy(real, "lxy", "123456");
		
		p.browse();
		
		
		
		
		
		
		
	}

}
