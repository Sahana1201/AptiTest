package com.xworkz.aptitest;

import java.util.Scanner;

public class Aptitest {

	public static void main(String[] args) {

		int row = 5;
		int mid1 = row / 2 + 1;
		patternK(row, mid1);

		patternDiamond(3);

		patternV(row, mid1);
		pattern();
	}

	public static void patternK(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c <= mid && r == mid)
					System.out.print("** ");
				else if (r + c == row + 1 && r <= mid)
					System.out.print("** ");
				else if (r == c && r >= mid)
					System.out.print("** ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void patternDiamond(int n) {

		{

			int space = n - 1;

			for (int i = 0; i < n; i++)

			{
				for (int j = 0; j < space; j++)

					System.out.print(" ");

				for (int j = 0; j <= i; j++)

					System.out.print("* ");

				System.out.print("\n");

				space--;

			}

			space = 0;

			for (int i = n; i > 0; i--)

			{

				for (int j = 0; j < space; j++)

					System.out.print(" ");

				for (int j = 0; j < i; j++)

					System.out.print("* ");

				System.out.print("\n");

				space++;

			}

		}

	}

	public static void patternV(int row, int mid) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == row && c == mid)
					System.out.print("** ");
				else if (r <= mid && (c == 1 || c == row))
					System.out.print("** ");
				else if (c + r == row + mid)
					System.out.print("** ");
				else if (r - c == row / 2)
					System.out.print("** ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void pattern() {
		int n = 5;
		int k = 1;
		System.out.println("Printing Patterns");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(k);

			}
			System.out.println();
			k++;

		}

	}

}
