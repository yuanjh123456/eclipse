package com.huaxin.java02.demo;

import java.util.Random;
import java.util.Scanner;


class Day01 {
	
	static double ff;
	//�����
	double fff;
	//��Ա����
	static byte a; //0
	static float b;//0.0
	static double c;  //0.0
	static int d;  //0
	static short e;  //0
	static char f;  //""
	static boolean g; //false
	static long h;  //0
	
	//��Ĭ�ϵĳ�ʼ��ֵ  ����Ҫ��ʼ��
	public static void main(String[] args) {
//		//�ֲ�����  �����ʼ��ֵ
//		byte c = 8;
////		c = c - 3;
////		ת��  ��Ϊ3Ĭ����int����
//		c = (byte)(c - 3);
//		//�ַ�ǿת(Ŀ������)()
//		
//		int a = 327698;
//		float b = 12.0f;
//		char c = 'a';
//		System.out.println("asd"+c);
//		System.out.println(a+b);
//		//��������ֲ�����
//		byte b1=3,b2=4,b3=0;
//		int c1;
//		b3=100;
//		b3=100+1;
//		int jj = 'a'+20;
//		int a = 1;
//		System.out.println();
//		System.out.println('9'+1);
//		System.out.println(jj);
//		
//		System.out.println('a');
//		System.out.println('a'+1);
//		System.out.println('a'+'s');
//		System.out.println("asd"+'a');
//		System.out.println(5+5+"asd");
//		System.out.println("asd"+(5+5));
//		System.out.println("a");
		//�����Ҽ���
//		System.out.println(2==2|1/0==1);
//		System.out.println(10<20?(3>2?1:0):20);
//		Myin.Test();
//		Myin.Test1();
//		Myin.Test2();
//		Myin.Test3();
//		Myin.Test4();
//		Myin.Test5();
//		Myin.Test6();
		Myin.Test7();
		
	}
	
}
class Myin{
	public static void Test() {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		switch(a) {
		case 1:System.out.println("����һ");break;
		case 2:System.out.println("���ڶ�");break;
		case 3:System.out.println("������");break;
		case 4:System.out.println("������");break;
		case 5:System.out.println("������");break;
		case 6:System.out.println("������");break;
		case 7:System.out.println("������");break;
		}
	}
	public static void Test1() {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		switch(a/10) {
		case 9:System.out.println("����");break;
		case 8:System.out.println("����");break;
		case 7:System.out.println("��ͨ");break;
		case 6:System.out.println("����");break;
		default:System.out.println("������");break;
		}
	}
	public static void Test2() {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c =scanner.nextInt();
		System.out.println("���ֵΪ"+(a>b?(a>c?a:c):(b>c?c:c)));
	}
	public static void Test3() {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		if(a>3) {
			System.out.println(a*2+1);
		}else if(a>-1) {
			System.out.println(a*2);
		}else {
			System.out.println(a*2-1);
		}
	}
	public static void Test4() {
		double sum=0;
		for(int i=1;;i++) {
			sum+=2.5;
			if(i%5==0) {
				sum-=6;
			}
			if(sum<=100) { 
				System.out.println(i);
				System.out.println(sum);
				break;
			}
		}
	}
	public static void Test5() {
		double a = 0.01;
		double b = 0;
		while(a < 8848) {
			a=a*2;
			++b;
		}
		System.out.print(b+"\n");
	}
	public static void Test6() {
		byte a;
		float b;
		double c;
		int d;
		short e;
		char f;
		boolean g;
		long h;
		int max = 10;
		int min = 2;
		String[] asdf = {"asd"};
		String[] aasd = new String[] {"a"};
		int aqwe[] = {};
		int azxc[][] = {};
		int aweqwreqw[]= {1,23,3};
		int aaaa[]= {1};
		
	}
	public static void Test7() {
			int random = (int)(Math.random()*(10));
			System.out.println("��һ��random��"+random);

            int random1 = new Random().nextInt(10);
			System.out.println("�ڶ���random��"+random1);
			
			
		}
}