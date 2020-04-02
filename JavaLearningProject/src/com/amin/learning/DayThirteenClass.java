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

public class DayThirteenClass {
	public static void main(String[] args) {
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		Maze m = new Maze();
		int[][] maze = { { 2, 1, 1, 1, 0, 1, 0 },
						 { 1, 0, 1, 1, 0, 0, 1, 1 },
						 { 0, 0, 0, 1, 1, 1, 1 } };
		m.maze = maze;
		m.start = new Position(2, 6);
		m.path = new LinkedList<Position>();

		Maze n = new Maze();
		int[][] n_maze = { { 2, 1, 0, 1, 0, 1, 0 }, 
						   { 1, 1, 1, 1, 0, 0, 1, 1 },
				           { 0, 0, 0, 1, 1, 1, 1 } };
		n.maze = n_maze;
		n.start = new Position(2, 6);
		n.path = new LinkedList<Position>();

		mazes.add(m);
		mazes.add(n);
		int i = 0;
		while (i < mazes.size()) {
			if (solveMaze(mazes.get(i))) {
				System.out.println("You Won!");
			} else {
				System.out.println("no Path");
			}
			i++;
			;

		}

	}

	private static Boolean solveMaze(Maze m) {
		Position p = m.start;
		m.path.push(p);

		while (true) {
			int x = m.path.peek().x;
			int y = m.path.peek().y;
			m.maze[y][x] = 0;
			if (isValid(y + 1, x, m)) {
				// down
				if (m.maze[y + 1][x] == 2) {

					System.out.println(" Moved Down.");
					return true;
				} else if (m.maze[y + 1][x] == 1) {
					System.out.println(" Moved Down");
					m.path.push(new Position(y + 1, x));
					continue;
				}
			}

			// left
			if (isValid(y, x - 1, m)) {
				if (m.maze[y][x - 1] == 2) {

					System.out.println(" Moved Left.");
					return true;
				} else if (m.maze[y][x - 1] == 1) {
					System.out.println(" Moved Left");
					m.path.push(new Position(y, x - 1));
					continue;
				}
			}
			// Up
			if (isValid(y - 1, x, m)) {
				if (m.maze[y - 1][x] == 2) {

					System.out.println(" Moved Up.");
					return true;
				} else if (m.maze[y - 1][x] == 1) {
					System.out.println(" Moved up");
					m.path.push(new Position(y - 1, x));
					continue;
				}
			}
			// right
			if (isValid(y, x + 1, m)) {
				if (m.maze[y][x + 1] == 2) {

					System.out.println(" Moved Right.");
					return true;
				} else if (m.maze[y][x + 1] == 1) {
					System.out.println(" Moved Right");
					m.path.push(new Position(y, x + 1));
					continue;
				}
			}

			m.path.pop();
			System.out.println(" Moved Back");
			if (m.path.size() <= 0) {

				return false;
			}

		}

	}

	public static boolean isValid(int y, int x, Maze m) {
		if (y < 0 || y >= m.maze.length || x < 0 || x >= m.maze[y].length) {

			return false;
		}
		return true;
	}
}