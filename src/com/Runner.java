package com;

public class Runner {

	public static void main(String[] args) {
		calcTask(12, 6);

	}
	
	public static void calcTask( int x, int y) {
		if(x > y) {
			System.out.println(x/y);
		} else {
			System.out.println("this function cannot be performed");
		}
	}

}
