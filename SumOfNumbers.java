package com.priya.CrackingTheCodingInterview;

public class SumOfNumbers {

	private static int sum(int num) {
		if (num == 0) {
			return 0;
		}
		return num + sum(num - 1);
	}

	private static int sumAsNormal(int num) {
		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println(sumAsNormal(5));

	}
}
