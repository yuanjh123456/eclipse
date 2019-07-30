package com.huaxin.java02.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add("adasasd");
//		list.add("adsa");
//		list.add("addadcxz");
//		list.add("adsqweqw");
//		list.add("avhfvgrthy");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		List list = new ArrayList();
		list.add(new std("1","1",1));
		list.add(new std("2","2",2));
		list.add(new std("3","3",3));
		list.add(new std("4","4",4));
		System.out.println(list.contains("1"));
		Collections.sort(list);
	}
	

}
