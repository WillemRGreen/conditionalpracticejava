package com;

public class flowchart {

	public static boolean flowBool = false;
	public static int x = 12;
	public static int y = 6;

	public static void main(String[] args) {
		flowTwo(2550);
	}

	public static void firstBool(int x, int y, boolean argBool) {
		if (argBool == true) {
			System.out.println(x + y);
		} else {
			System.out.println(x * y);
		}
	}

	public static void flowTwo(int A) {
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else if (A < 6000) {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
}
