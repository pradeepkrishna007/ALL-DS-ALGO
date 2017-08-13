package com.priya.CrackingTheCodingInterview;

public class PrimeNumbers {

	private static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0)
				return false;

		}

		return true;
	}

	private static boolean isPrimeRecursiveness(int num, int subNum) {
		System.out.println(num + " " + subNum);

		if (num == 0 || num == 1)
			return false;

		if (subNum < num) {
			if (num % subNum == 0)
				return false;
			return isPrimeRecursiveness(num, subNum + 1);
		}
		return true;

	}

	public static void main(String[] args) {
		int value = AcceptInputs.acceptInputsAsNumber();
		System.out.println(isPrime(value));

	}

}
