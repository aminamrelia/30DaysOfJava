package com.amin.learning;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class DayTwoClass {

	public static void main(String[] args) throws FileNotFoundException {
		// Example 1
		/*
		 * Scanner in = new Scanner(System.in); System.out.println(" Give us a size");
		 * int size = in.nextInt();
		 * 
		 * int[] grades = new int[size]; // int score[]; We can also define this way.
		 * System.out.println(" Enter " + size + " numbers. Press enter after each");
		 * for (int i = 0; i < size; i++) { grades[i] = in.nextInt();
		 * System.out.println(" Array Index :: " + grades[i]); } in.close(); }
		 */

		// Example 2 -- Read from file
		Scanner in = new Scanner(new File("students.txt"));
		List<String> students = new ArrayList<String>();
		while (in.hasNextLine()) {
			students.add(in.nextLine());

		}
		for (int i = 0; i < students.size(); i++) {

			System.out.println(" Name::: " + students.get(i));

		}
		in.close();

	}
}
