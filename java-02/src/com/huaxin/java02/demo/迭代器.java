package com.huaxin.java02.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ������ {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list);
	}
}
