package com.priya.CrackingTheCodingInterview;

import java.util.Scanner;

public class AcceptInputs {
	public static String acceptInputsAsString() {
		String input = null;
		System.out.println("Provide Input");

		Scanner scan = new Scanner(System.in);

		input = scan.nextLine();

		scan.close();

		return input;

	}

	public static int acceptInputsAsNumber() {
		int input = 0;
		System.out.println("Provide Input");

		Scanner scan = new Scanner(System.in);

		input = scan.nextInt();

		scan.close();

		return input;

	}

}
