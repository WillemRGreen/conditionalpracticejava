package com;

public class Result {
	
	public static double Biology = 130;
	public static double Chemistry = 100;
	public static double Physics = 84;
	
	public static double result = (Biology + Chemistry + Physics)*(100/450);
	
	public static void main(String[] args) {
		if(Biology < 104||Chemistry < 104||Physics < 104) {
			System.out.println("One of your scores is too low to pass");
		} else if(result < 70) {
			System.out.println("Your overall score is too low to pass");
		} else {
			System.out.println("you passed!");
		}
		
	}

}
