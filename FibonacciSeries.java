package com.priya.CrackingTheCodingInterview;

public class FibonacciSeries {

	private static int findRecursiveFibonacci(int num) {
		if (num <= 1)
			return num;

		return findRecursiveFibonacci(num - 1) + findRecursiveFibonacci(num - 2);
	}

	private static int findFibonaci(int n) {
		int lo = 0, sum = 0, hi = 1, temp = 0;
		if (n == 1 || n == 0)
			return n;

		for (int i = 2; i <= n; i++) {

			sum = hi + lo;
			temp = hi;
			hi = sum;
			lo = temp;
		}

		return sum;
	}

	// 0,1, 1,2,3, 5,8,13,21
	public static void main(String[] args) {
		int n = 10;
		while (n-- > 0) {
			// System.out.println(n + " " + findFibonaci(n));
			System.out.println(findRecursiveFibonacci(n) + " " + n + " " + findFibonaci(n));
		}

	}

}
