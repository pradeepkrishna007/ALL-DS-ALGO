package com.mine.DS_ALGO;

public class MergeSortedArrayTogether {

	private static int[] mergeSortedArray(int[] first, int[] second, int[] finalArray, int fi, int sj,
			int finalLength) {

		if (first[first.length - 1] < second[0]) {
			for (int i = 0; i < first.length; i++) {
				finalArray[i] = first[i];
				finalArray[i + first.length] = second[i];
			}
			return finalArray;
		}
		if (second[second.length - 1] < first[0]) {
			for (int i = 0; i < second.length; i++) {
				finalArray[i] = second[i];
				finalArray[i + second.length] = first[i];
			}
			return finalArray;
		}

		if ((first.length - 1) == fi && (second.length - 1) == sj) {

			if (first[fi] > second[sj]) {
				finalArray[finalArray.length - 2] = second[sj];
				finalArray[finalArray.length - 1] = first[fi];

			} else {
				finalArray[finalArray.length - 1] = second[sj];
				finalArray[finalArray.length - 2] = first[fi];
			}

			return finalArray;

		}

		if (first[fi] < second[sj]) {
			finalArray[finalLength] = first[fi];
			if (fi < first.length - 1) {
				++fi;
			}
			++finalLength;
			mergeSortedArray(first, second, finalArray, fi, sj, finalLength);
		}
		if (first[fi] > second[sj]) {
			finalArray[finalLength] = second[sj];
			if (sj < second.length - 1) {
				++sj;
			}
			++finalLength;
			mergeSortedArray(first, second, finalArray, fi, sj, finalLength);
		}

		return mergeSortedArray(first, second, finalArray, fi, sj, finalLength);

	}

	private static void initiateMerge(int[] first, int[] second) {
		int[] finalArray = new int[first.length + second.length];
		finalArray = mergeSortedArray(first, second, finalArray, 0, 0, 0);
		for (int i : finalArray) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		// int[] firstArray = { 1, 2, 3, 4 };
		// int[] secondArray = { 5, 6, 8, 10 };

		// int[] secondArray = { 1, 12, 15, 26, 38 };
		// int[] firstArray = { 2, 13, 17, 30, 45 };

		int[] firstArray = { 1, 12, 15, 26, 38 };
		int[] secondArray = { 2, 13, 17, 30, 45 };

		// int[] firstArray = { 1, 4, 5 };
		// int[] secondArray = { 2, 3, 7 };

		// int[] firstArray = { 5, 6, 8, 10 };
		// int[] secondArray = { 1, 2, 3, 4 };

		initiateMerge(firstArray, secondArray);

	}

}
