package test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class text {

	public static void main(String[] args) {
		Set std = new TreeSet();
		std.add(new student("yuan",123,new Address(1,"yuan")));
		std.add(new student("yuan",123,new Address(1,"yuan")));
		
		
//		Address address1 = new Address(1,"yuan");
//		Address address2 = new Address(2,"yuan");
//		std.add(new student("yuan",113,address1));
//		std.add(new student("yuan",113,address2));
		
		System.out.println(std);
	}
}
