package com.aktar.practice;

public class Switch1 {

	public static void main(String[] args) {
		int Grading;
		Grading = 4;
		switch (Grading) {
		case 1:
			System.out.println("Fail");
			break;
		case 2:
			System.out.println("A little improvement");
			break;
		case 3:
			System.out.println("Much improvement");
			break;
		case 4:
			System.out.println("Completely self confident");
		default:
			System.out.println("Donot know How he will be doing");
			break;
		}

	}

}
