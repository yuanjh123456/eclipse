package com.huaxin.java02.demo;

import java.util.ArrayList;

public class Stack extends ArrayList{
	public void push(Object o) {
		this.add(o);
	};
	public void pop() {
		if(this.size()!=0) {
			this.remove(this.size()-1);
		}
	};
	public Object get() {
		if(this.size()!=0) {
			return this.get(this.size()-1);
		}	
		return null;
	};
}
