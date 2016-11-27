﻿package ex;
import java.util.Scanner;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021026 詹佩郡
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		com cpu= new com();
		int a = scn.nextInt();
		char b = scn.next().charAt(0);
		if (b == '+' || b == '-' || b == '*' || b == '/') {
			int c = scn.nextInt();
			System.out.println(cpu.cpu2(a, b, c));
		} else if (b == '^' || b == '3' || b == '√') {
			System.out.println(cpu.cpu2(a, b, 0));
		} else {
			System.out.println("fault");
		}}}
		class com {

			public static float cpu2(int a, char x, int c) {
				float result = 0;
				switch (x) {
				case '+':
					result = a + c;
					break;
				case '-':
					result = a - c;
					break;
				case '*':
					result = a * c;
					break;
				case '/':
					result = a / c;
					break;
				case '^':
					result = (float) Math.pow(a, 2);
					break;
				case '3':
					result = (float) Math.pow(a, 3);
					break;
				case '√':
					result = (float) Math.sqrt(a);
					break;
				}
				return result;
			}
	}

