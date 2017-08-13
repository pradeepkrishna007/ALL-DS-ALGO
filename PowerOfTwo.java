package com.priya.CrackingTheCodingInterview;

public class PowerOfTwo {

	private static int printPowerViaRecursion(int n) {
		if (n <= 0) {
			return 1;
		}
		if (n == 1) {
			return 2;
		}

		return 2 * printPowerViaRecursion(n - 1);

	}

	private static void printPower(int n) {
		if (n <= 0)
			System.out.println(1);
		if (n == 1)
			System.out.println(2);
		long val = 2;

		System.out.println(2);

		for (int i = 2; i <= n; i++) {
			System.out.println(val *= 2);
		}
	}

	public static void main(String[] args) {
		int num = AcceptInputs.acceptInputsAsNumber();
		System.out.println(printPowerViaRecursion(num));

	}

}
