package com.method.para;

import java.util.Scanner;

public class TryWhile2 {

	public static void main(String[] args) {
		Scanner accurate = new Scanner(System.in);
		int x = 0;
		int Grade;
		int total = 0;
		int Average;
		while (x < 10) {
			Grade = accurate.nextInt();
			total = total + Grade;
			x++;
		}
		Average = total / 10;
		System.out.println("My average is" + Average);

	}

}
