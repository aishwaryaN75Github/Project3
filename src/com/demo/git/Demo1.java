package com.demo.git;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("java");
		a.add("python");
		a.add(null);
		a.add("php");
		a.add("JDBC");
		System.out.println(a);
		System.out.println("dev1 change in another packege");
		Demo1.m1();
		
		

	}

	private static void m1() {
		System.out.println("this is m1");
		
	}

}
