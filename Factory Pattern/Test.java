package com.lxy.prepare.interfaces;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		PetShop ps = new PetShop(3);
		String[] names={"旺财","大黄","旺财","咪咪","小艾"};
		String[] colors = {"黑色","黄色","白色","黑色","灰色"};
		int[] ages = {1,2,3,4,5};
		
		for (int i = 0; i < ages.length; i++) {
			if (i <= 2) {
				ps.add(new Dog(names[i], colors[i], ages[i]));
			}else{
				ps.add(new Cat(names[i], colors[i], ages[i]));
			}
			
		}
		System.out.println("请输入要查找的名字或颜色：");
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		
		ps.printInfo(ps.selectKye(key));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
