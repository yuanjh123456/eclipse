package com.huaxin.java02.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack stack = new Stack();
//		stack.push("aas");
//		stack.push("123");
//		stack.pop();
//		System.out.println(stack.get());
		Stack01 stack01 = new Stack01();
//		stack01.push("asd");
//		stack01.push("asdasda");
//		stack01.pop();
//		System.out.println(stack01.get());
		Scanner in = new Scanner(System.in);
		System.out.println("«Î ‰»Î¿®∫≈");
		String a = in.next();
		char[] b = a.toCharArray();
		for(int i=0;i<a.length();i++) {
			if(b[i]=='['||b[i]=='{'||b[i]=='(') {
				stack01.push(b[i]);
			}else{
				if(b[i]==']') {
					if((char)stack01.get()=='['){
						stack01.pop();
					}else{
						stack01.push(b[i]);
					}
				}else if(b[i]=='}') {
					if((char)stack01.get()=='{'){
						stack01.pop();
					}else {
						stack01.push(b[i]);
					}
				}else if(b[i]==')') {
					if((char)stack01.get()=='('){
						stack01.pop();
					}else {
						stack01.push(b[i]);
					}
				}else {
					stack01.push(b[i]);
				}
			}
		}
		if(stack01.sum()==0) {
			System.out.println("∆•≈‰≥…π¶");
		}else {
			System.out.println("∆•≈‰ ß∞‹");
		}
		
	}
	
	
}
