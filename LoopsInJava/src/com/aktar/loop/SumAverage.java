package com.aktar.loop;
import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner accurate=new Scanner(System.in);
		int total=0;
		int grade;
		int x=0;
		int average;
		while(x<10){
			grade=accurate.nextInt();
			total=total+grade;
			x++;
		}
		average=total/10;
		System.out.println("total average is"+average);
}
}