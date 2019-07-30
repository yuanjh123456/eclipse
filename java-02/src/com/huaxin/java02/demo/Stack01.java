package com.huaxin.java02.demo;
import java.util.ArrayList;
import java.util.List;
public class Stack01 {
	List list = new ArrayList();
	public void push(Object o) {
		list.add(o);
	}
	public void pop() {
		list.remove(list.size()-1);
	}
	public Object get() {
		return list.get(list.size()-1);
	}
	public int sum() {
		return list.size();
	}
}
