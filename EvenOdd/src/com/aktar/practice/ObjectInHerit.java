package com.aktar.practice;

public class ObjectInHerit {

	public static void main(String[] args) {
		IfElse2 obj = new IfElse2();
		obj.Guess();
		Good(50, 30, 22);
	}

	public static void Good(int x, int y, int z) {
		x = 50;
		y = x++;
		z = x + y;
		System.out.println(z + "the result");
	}
}
