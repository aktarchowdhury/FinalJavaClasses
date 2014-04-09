package com.aktar.practice;

import java.util.Scanner;

import com.aktar.prac1.Calculator3;

public class Calculator1 extends Calculator3 {
	public static void main(String[] args) {
		String();
		Scanner y = new Scanner(System.in);
		int FirstNum, SecondNum, Result;
		System.out.println("Enter FirstNum");
		FirstNum = y.nextInt();
		System.out.println("Enter SecondNum");
		SecondNum = y.nextInt();
		Result = FirstNum + SecondNum;
		System.out.println(Result);
	}
}
