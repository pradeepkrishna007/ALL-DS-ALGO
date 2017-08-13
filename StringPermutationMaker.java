package com.priya.CrackingTheCodingInterview;

public class StringPermutationMaker {

	private static void permutationmaker(String string, String prifix) {
		if (string.length() == 0) {
			System.out.println("'" + prifix + "'");
		} else {
			for (int i = 0; i < string.length(); i++) {
				String rem = string.substring(0, i) + string.substring(i + 1);
				System.out.println(" rem = " + string.substring(0, i) + " ** " + string.substring(i + 1) + " *** " + i);
				System.out.println(rem + " -- " + prifix + "+" + string.charAt(i));
				System.out.println("----------------------" + string);
				permutationmaker(rem, prifix + string.charAt(i));

			}

		}

	}

	private static void initiatePermutationMaker(String string) {
		permutationmaker(string, "");

	}

	public static void main(String[] args) {

		String value = AcceptInputs.acceptInputsAsString();
		initiatePermutationMaker(value);

	}

}
