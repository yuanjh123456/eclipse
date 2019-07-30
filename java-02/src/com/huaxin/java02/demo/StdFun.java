package com.huaxin.java02.demo;

import java.util.Scanner;

public class StdFun {
	static Scanner sc = new Scanner(System.in);
	static StdFun stdfun = new StdFun();
	public int exit(std[] a,String user) {
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i].getUsename().equals(user)) {
				break;
			}
		}
		return i;
	}
	public int exits(std[] a,String user,String pwd) {
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i].getUsename().equals(user)&&a[i].getPassword().equals(pwd)) {
				break;
			}
		}
		return i;
	}
	public void choose(int count,String getUsename,String getPassword,int getMoney,std[] st) {
		switch(count) {
			case 1:stdfun.check(getUsename,getPassword,getMoney);break;
			case 2:stdfun.transmoney(st,getUsename,getMoney);break;
			case 3:stdfun.drawmoney(st,getUsename,getPassword,getMoney);break;
			default :System.out.println("请选择正确的功能");break;
		}
	}
	public void check(String usename, String password, int money) {
		System.out.println("名称"+usename);
		System.out.println("密码"+password);
		System.out.println("余额"+money);
	}
	public void transmoney(std[] a,String user,int money) {
		while(true) {
			System.out.println("请输入转账人的姓名");
			String name = sc.next();
			if(exit(a,name)==a.length) {
				System.out.println("请输入正确的姓名"); 
				continue;
			}else {
				System.out.println("请输入转账金额");
				int mon = sc.nextInt();
				if(a[exit(a,user)].money - mon<0) {
					System.out.println("您还没那么多钱啊");
					continue;
				}else {
					a[exit(a,name)].money = a[exit(a,name)].money + mon;
					a[exit(a,user)].money = a[exit(a,user)].money - mon;
					System.out.println("转账成功");
					break;
				}	
			}
		}
	}
	public void drawmoney(std[] a,String user,String pwd,int money) {
		while(true) {
			System.out.println("请输入取多少钱");
			int mon = sc.nextInt();
			if(a[exit(a,user)].money - mon<0) {
				System.out.println("对不起，你没有钱了");
				continue;
			}else {
				a[exit(a,user)].money = a[exit(a,user)].money - mon;
				System.out.println("名称"+user);
				System.out.println("密码"+pwd);
				System.out.println("转账"+mon);
				System.out.println("余额"+a[exit(a,user)].money);
				break;
			}
		}
	}
	
}
