package com.amin.learning;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class DayThreeClass {

	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> names = new LinkedList<String>();
		names.add("Amin");
		names.add("Irfan");
		names.add("Mustufa");

		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}
}