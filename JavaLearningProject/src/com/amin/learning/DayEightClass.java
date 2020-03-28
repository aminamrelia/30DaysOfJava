package com.amin.learning;

import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;

public class DaySevenClass {
//Stack
	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Amin");
		names.push("Irfan");
		names.push("Mustufa");
//Stack
	/*	
		Iterator<String> it = names.iterator();
        System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (String s : names) {
			System.out.println(s);
		}*/
		
		// ListIterator
		ListIterator<String> it = names.listIterator();
			it.next();
			it.next();
			it.add("Zidane");			
			for (String s : names) {
				System.out.println(s);
			}


	}
}