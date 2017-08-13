package com.priya.CrackingTheCodingInterview;

public class ReverseAnArray {

	private static int[] reversedArray(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = temp;
		}

		return array;

	}

	private static int[] engieneerRecursiveWay(int[] array, int pivot) {
		if (pivot >= array.length / 2)
			return array;
		int temp = array[array.length - 1 - pivot];
		array[array.length - 1 - pivot] = array[pivot];
		array[pivot] = temp;

		return engieneerRecursiveWay(array, pivot + 1);

	}

	private static int[] reveresedArrayThroughRecursion(int[] array) {
		return engieneerRecursiveWay(array, 0);
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 8, 9, 1, 2, 6, 4 };
		for (int i : reveresedArrayThroughRecursion(array)) {
			System.out.print(" " + i);
		}

	}

}
