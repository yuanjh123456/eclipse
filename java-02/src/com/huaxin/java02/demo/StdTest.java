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
			System.out.println("�������˺ź�����");
			String user = scanner.next();
			String pwd = scanner.next();
			j = stdfun.exits(st,user,pwd);
			if(j==st.length) {
				System.out.println("�˺Ż����������");
				continue;
			}else {
				System.out.println("��½�ɹ�");
				while(true){
					System.out.println("��������ѡ��Ĺ��ܡ�1.��ѯ���   2.ת��    3.���    4.�˳���");
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
