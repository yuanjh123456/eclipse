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
			default :System.out.println("��ѡ����ȷ�Ĺ���");break;
		}
	}
	public void check(String usename, String password, int money) {
		System.out.println("����"+usename);
		System.out.println("����"+password);
		System.out.println("���"+money);
	}
	public void transmoney(std[] a,String user,int money) {
		while(true) {
			System.out.println("������ת���˵�����");
			String name = sc.next();
			if(exit(a,name)==a.length) {
				System.out.println("��������ȷ������"); 
				continue;
			}else {
				System.out.println("������ת�˽��");
				int mon = sc.nextInt();
				if(a[exit(a,user)].money - mon<0) {
					System.out.println("����û��ô��Ǯ��");
					continue;
				}else {
					a[exit(a,name)].money = a[exit(a,name)].money + mon;
					a[exit(a,user)].money = a[exit(a,user)].money - mon;
					System.out.println("ת�˳ɹ�");
					break;
				}	
			}
		}
	}
	public void drawmoney(std[] a,String user,String pwd,int money) {
		while(true) {
			System.out.println("������ȡ����Ǯ");
			int mon = sc.nextInt();
			if(a[exit(a,user)].money - mon<0) {
				System.out.println("�Բ�����û��Ǯ��");
				continue;
			}else {
				a[exit(a,user)].money = a[exit(a,user)].money - mon;
				System.out.println("����"+user);
				System.out.println("����"+pwd);
				System.out.println("ת��"+mon);
				System.out.println("���"+a[exit(a,user)].money);
				break;
			}
		}
	}
	
}
