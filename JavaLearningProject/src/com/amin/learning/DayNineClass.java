package com.amin.learning;

import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;

public class DayNineClass {
//Stack
	public static void main(String[] args) throws FileNotFoundException {

		int[][] data = { { 4, 6, 3, 10 },
				         { 4, 2, 40, 1, 3, 2, 30 }, 
				         { 5, 34, 1, 43 } };
		System.out.println("Row  " + data.length);
		System.out.println("Column " + data[0].length);
		System.out.println();
		System.out.println(data[1][2]);
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) { // data[i] to find column
			System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}

	}
}