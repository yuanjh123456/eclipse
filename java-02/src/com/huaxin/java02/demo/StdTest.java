package com.huaxin.java02.demo;

import java.util.Scanner;

public class StdTest {
	static  Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int j;
		StringBuilder stringBuilder = new StringBuilder();
		StdFun stdfun = new StdFun();
		int x = scanner.nextInt();
		std st[] = new std[x];
		for(int i=0;i<x;i++) {
			st[i].setUsename(scanner.next());
			st[i].setPassword(scanner.next());
			st[i].setMoney(scanner.nextInt());
		}
		while(true){
			System.out.println("请输入账号和密码");
			String user = scanner.next();
			String pwd = scanner.next();
			j = stdfun.exits(st,user,pwd);
			if(j==st.length) {
				System.out.println("账号或者密码错误");
				continue;
			}else {
				System.out.println("登陆成功");
				while(true){
					System.out.println("请输入您选择的功能【1.查询余额   2.转账    3.提款    4.退出】");
					int count = scanner.nextInt();
					if(count==4) {
						break;
					}else {
						stdfun.choose(count,st[j].getUsename(),st[j].getPassword(),st[j].getMoney(),st);
						continue;
					}
				}
				
			}
		}
		
	}
}
