package com.huaxin.java02.demo;

public class people {
	public static void main(String[] args) {
		people peo = new people();
		people men = new men();
		people women = new women();
		men.eating(men);
	}
	public void eating(people peo) {
		peo.eat();
	}
	public void eat() {
		System.out.println("�����eat");
	}
}
class men extends people{
	public void eat() {
		System.out.println("men��eat");
	}
}
class women extends people{
	public void eat() {
		System.out.println("women��eat");
	}
}
