package com.priya.CrackingTheCodingInterview;

public class PalindromCheck {

	private static boolean checkPalindrom(String string) {

		char[] charArray = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			charArray[string.length() - 1 - i] = string.charAt(i);
		}

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != string.charAt(i))
				return false;
		}

		return true;
	}

	private static boolean checkPalindrom(int value) {
		int temp = value, reverseVal = 0, reminder = 0;

		while (temp != 0) {
			reminder = temp % 10;
			temp = temp / 10;
			reverseVal = (reverseVal * 10) + reminder;
		}

		if (value == reverseVal)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		// String string = AcceptInputs.acceptInputsAsString();
		int value = AcceptInputs.acceptInputsAsNumber();

		System.out.println(checkPalindrom(value));
	}

}
