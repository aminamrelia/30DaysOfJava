package com.amin.learning;

import java.util.Scanner;
import com.amin.learning.Position;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;

public class DayNineClass {

	static int[][] maze = { { 2, 1, 1, 1, 0, 1, 0 },
			{ 1, 0, 1, 1, 0, 0, 1 ,1},
			{ 0, 0, 0, 1, 1, 1, 1 } };
	// 0 = wall
	// 1 = path
	// 2 = Destination

	static LinkedList<Position> path = new LinkedList<Position>();

	public static void main(String[] args) {
		Position p = new Position(2, 6);
		// p.x=3; // column
		// p.y=0; // row
		path.push(p);

		while (true) {
			int x = path.peek().x;
			int y = path.peek().y;
			maze[y][x] = 0;
			if (isValid(y + 1, x)) {
				// down
				if (maze[y + 1][x] == 2) {

					System.out.println(" Moved Down .. You won!");
					return;
				} else if (maze[y + 1][x] == 1) {
					System.out.println(" Moved Down");
					path.push(new Position(y + 1, x));
					continue;
				}
			}

			// left
			if (isValid(y, x - 1)) {
				if (maze[y][x - 1] == 2) {

					System.out.println(" Moved Left .. You won!");
					return;
				} else if (maze[y][x - 1] == 1) {
					System.out.println(" Moved Left");
					path.push(new Position(y, x - 1));
					continue;
				}
			}
			// Up
			if (isValid(y - 1, x)) {
				if (maze[y - 1][x] == 2) {

					System.out.println(" Moved Up .. You won!");
					return;
				} else if (maze[y - 1][x] == 1) {
					System.out.println(" Moved up");
					path.push(new Position(y - 1, x));
					continue;
				}
			}
			// right
			if (isValid(y, x + 1)) {
				if (maze[y][x + 1] == 2) {

					System.out.println(" Moved Right .. You won!");
					return;
				} else if (maze[y][x + 1] == 1) {
					System.out.println(" Moved Right");
					path.push(new Position(y, x + 1));
					continue;
				}
			}

			path.pop();
			System.out.println(" Moved Back");
			if (path.size() <= 0) {

				System.out.println("No Path");
				return;
			}

		}
	}

	public static boolean isValid(int y, int x) {
		if (y < 0 || y >= maze.length || x < 0 || x >= maze[y].length) {

			return false;
		}
		return true;
	}
}