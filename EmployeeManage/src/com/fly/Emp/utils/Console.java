package com.fly.Emp.utils;

import java.util.Scanner;

public class Console {

	public static String input(){
		Scanner sc = new Scanner(System.in);
		String keys = sc.nextLine();
		return keys;
		
	}
	
	public static void output(String str){
		System.out.println(str);
	}
}
