package com.amin.learning;

import java.util.Scanner;

public class DayOneClass {
	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		// If Loop
		if (s.equals("Amin")) {
			System.out.println("Hey, " + s);
		} else if (s.equals("Amrelia")) {
			System.out.println("Hey, " + s);
		} else {
			System.out.println("Hey, You're not welcome");
		}
		in.close();

		// while Loop
		int i = 0;
		while (i < 10) {
			System.out.println("i is :: " + i);
			i++;

		}
	}

}
