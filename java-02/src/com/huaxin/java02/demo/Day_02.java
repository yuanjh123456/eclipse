package com.huaxin.java02.demo;

public class Day_02{
	private int a=6;
	public static void main(String[] args) {
//		Day_02.Test1();
//		Day_02.Test2();
//		Day_02.Test3();
//		Day_02.Test4();
//		Day_02.Test6();
//		int a=1;
//		float b=1.1f;
//		float c=b*a;
		int  i=6,j=8,k=10,m=7; 
		if(i>j || m<k--) {
			k++;
		} 
		else {
			k--; 
		}
		System.out.println(k);
		
		
		
	}
	static void Test6() {
		int  i=9, j=8, m=10, n=9;
		if( i<j | m--<n )  System.out.println("asd");  else  System.out.println(--j); 
		System.out.println(m+"  "+i);
	}
	static void Test1() {
		char  ch1='A',ch2='W';
		if(ch1 + 2 < ch2 )  ++ch1;  
		System.out.println(ch1);
	}
	static void Test2() {
		int  i=6,j=8,k=10,m=7; 
		if(i>j || m<k--)  k++;  else  k--; 
		System.out.println(k);
	}
	static void Test3() {
		int j=3, i=2;
		   while( --i!=i/j )  j=j+2;  
		  System.out.println(j);
	}
	static void Test4() {
		int  m = 7;
		   do { m++; System.out.println(m);} while ( m < 8 );
	}
}
