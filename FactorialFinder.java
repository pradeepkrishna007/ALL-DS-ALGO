package com.priya.CrackingTheCodingInterview;

public class FactorialFinder {

	private static int findFactorial(int n) {
		int res = 1;

		while (n > 0) {
			res *= n;
			n--;
		}

		return res;

	}

	private static int findFactorialWithRecursion(int n) {
		if (n == 1)
			return 1;
		return n * findFactorial(n - 1);

	}

	public static void main(String[] args) {
		int value = AcceptInputs.acceptInputsAsNumber();
		System.out.println(findFactorialWithRecursion(value));
	}

}
