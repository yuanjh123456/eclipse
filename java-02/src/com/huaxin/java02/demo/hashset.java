package com.huaxin.java02.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class hashset {
	static Integer a = 1;
	static Integer b = 1;
	public static void main(String[] args) {
		Set hash = new HashSet();
		hash.add(1);
		hash.add(a);
		hash.add(b);
		System.out.println(hash);
	}

}
