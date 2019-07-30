package com.huaxin.java02.demo;

import java.util.Scanner;

public class Day_03 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("请输入一个数组的长度");
		int sum = in.nextInt();
		int[] a = new int[sum];
		System.out.println("请输入数组");
		for(int i=0;i<sum;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("1【添加】2【删除】3【查找】4【修改】");
		Day_03 text = new Day_03();
		switch(in.nextInt()) {
			case 1:System.out.println(text.add(a).toString());break;
			case 2:text.delete(a);break;
			case 3:text.search(a); break;
			case 4:text.alter(a);break;	
		}
	}
	//x为下标值   y为添加的值
	public int[] add(int[] a) {
		System.out.println("请输入添加值的下标和添加的值");
		int x = in.nextInt();
		int y = in.nextInt();
		int[] b = new int[a.length+1];
		for(int i = 0; i < x ;i++) {
			b[i] = a[i];
		}
		b[x] = y;
		for(int i = x ;i <a.length ;i++) {
			b[i+1] = a[i];
		}
		return b;
	}
	
	public int[] delete(int[] a) {
		System.out.println("请输入删除的值");
		int x = in.nextInt();
		int[] b = new int[a.length-1];
		int j = a.length+1;
		for(int i=0;i < a.length; i++) {
			if(a[i]==x){
				j = i;
				break;
			}
		}
		for(int i = 0; i < j ;i++) {
			b[i] = a[i];
		}
		for(int i = j+1;i<a.length;i++) {
			b[i-1]=a[i];
		}
		return b;
	}
	public int search(int[] a) {
		System.out.println("请输入查找值");
		int x = in.nextInt();
		int j = a.length+1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				j = i;
				break;
			}
		}
		return j;
	}
	public int[] alter(int[] a) {
		System.out.println("请输入修改值的下标和修改的内容");
		int x = in.nextInt();
		int y = in.nextInt();
		a[x]=y;
		return a;
	}
}

