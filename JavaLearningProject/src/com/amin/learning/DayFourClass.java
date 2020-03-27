package com.amin.learning;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class DayFourClass {
//Stack
	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Amin");
		names.push("Irfan");
		names.push("Mustufa");

		System.out.println(names.pop());
		System.out.println(names.remove());
		System.out.println(names.removeFirst());
	}
}