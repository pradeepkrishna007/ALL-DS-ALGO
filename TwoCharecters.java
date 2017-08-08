package com.priya.Algos;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * String always consists of two distinct alternating characters. For example,
 * if string t's two distinct characters are x and y, then t could be xyxyx or
 * yxyxy but not xxyy or xyyx.
 * 
 * You can convert some string to string by deleting characters from . When you
 * delete a character from , you must delete all occurrences of it in . For
 * example, if abaacdabd and you delete the character a, then the string becomes
 * bcdbd.
 * 
 * Given , convert it to the longest possible string . Then print the length of
 * string on a new line; if no string can be formed from , print 0 instead.
 * 
 * Input Format
 * 
 * The first line contains a single integer denoting the length of . The second
 * line contains string .
 * 
 * Constraints
 * 
 * only contains lowercase English alphabetic letters (i.e., a to z). Output
 * Format
 * 
 * Print a single integer denoting the maximum length of for the given ; if it
 * is not possible to form string , print instead 0.
 * 
 * sample input 884
 * bleinlirvdllgpqysgejejaptjrnmuvsulpwwofocahzbdngybbqdfleycicnpbrdkz
 * mzraayiqzwplgnnmirnddadidsyftrezectrelgwzegsrvzyjramgqvwwotacyurxrpfyrvkrqpcjrezpbizwkz
 * wtucohtcwqktiyrlvxtwuilwvjdhoqaiiqjpkosjkolpgojlfabpperqqtmnjowynwmxavicjdknpgnmpktovtssy
 * navflaxqbxygryjbfymjfcemqgnhrhyunopicpsskhzkvdnedrweuneshcuoegxzlmcuvojbnqcyapqvnwpfufqpekj
 * vxxujogguhhtvwlrrvctqdllpdegtwwmfnceaiqfpfoqggkqpbmdzhdpsrklllsssazidvcpsipxhucgcqxpekijfijqb
 * lnvbrubgqohwpqrngilierbzjrjozslmibpocyzeqrtfenkcklvtajhrzumyjgdkzdaztytogvrncqgcutwdpvnuesbadhf
 * gijjcjygonhvkhlypwnexumozowkfnykdovqjrwnwsudufhvcikaedsfiyzoqyvodmwixpmdpxtveinykvdrjdbmandgzcou
 * zdlpiynwlhcwqafaqpqjdkbouelfbmztbqshzlgedbduhgcerrbqnqzfvgpfheqrnwlsduxklrfjjnkmvetkuzagkdmkaugpt
 * rdenqfiavgqzfubybmjcgoqlmvgcdmddwigtqmvjpkwlkuyxdycuriyrvlbghvyagxulvqmrkxlqfpxblnwdctznlrbbactsrb
 * ubcaayntkjmhzjzuyruejekcorvtbglaccnzxhutfqzjrfadgpgubqynmbxziudhmzcpmpx
 * 
 */
public class TwoCharecters {
	private static int maxlength = 0;
	private static HashSet oddPos = new HashSet<>();
	private static HashSet evenPos = new HashSet<>();
	private static HashSet mixPos = new HashSet<>();


	public static void main(String[] args) {
		System.out.println();
		try {

			// ArrayList<String> keylist = new ArrayList<>();
			// for (int j = 97; j < 97 + 26; j++) {
			// keylist.add(Character.toString((char) j));
			// }
			//
			// String random = "";
			// for (int i = 0; i < 999; i++) {
			// random = random + keylist.get(new
			// java.util.Random().nextInt(keylist.size()));
			// }
			// System.out.println(random + " \n"+random.length());
			long startMili = System.currentTimeMillis();
			// System.out.println("started at" +startMili);
			Scanner scan = new Scanner(System.in);
			int stringLength = scan.nextInt();
			String givenString = scan.next();
			TreeSet<String> charecters = new TreeSet<>();
			int lenLength = stringLength > 200 ? stringLength / 2 : stringLength;
			givenString = givenString.substring(0, lenLength);

			// String tempString

			for (int i = 0; i < lenLength; i++) {
				charecters.add(String.valueOf(givenString.charAt(i)));
			}
			System.out.println(charecters.size());

			// ArrayList<String> set = new ArrayList<String>(charecters);
			long startmili = System.currentTimeMillis();
			// TwoCharecters<String> it = new TwoCharecters<String>(set);
			// System.out.println(it.size);
			// while (it.hasNext()) {
			// System.out.println(it.size);
			// makeCounts(it.next(), givenString);
			// // System.out.println(it.next());
			// }

			// System.out.println(charecters.subSet(0, 3));

			startmili = System.currentTimeMillis();
			// findPowerSet(new ArrayList<String>(charecters), 1);
			// System.out.println(findPowerSet(new
			// ArrayList<String>(charecters),1));

			ArrayList<ArrayList<String>> charectersSets = findPowerSet(new ArrayList<String>(charecters), 1);
			System.out.println((System.currentTimeMillis() - startMili) / 1000 + " by done creating with "
					+ charectersSets.size());
			for (ArrayList<String> set : charectersSets) {
				if (set.size() != stringLength) {
					// System.out.println(set);
					makeCounts(set, givenString);
				}
			}

			// System.out.println(System.currentTimeMillis() - startMili + "done
			// creating");

			// startmili = System.currentTimeMillis();
			// Set<Set<String>> charectersSets = powerSet(charecters);
			// System.out.println(System.currentTimeMillis() - startMili + "done
			// creating");
			// for (Set<String> set : charectersSets) {
			// if (set.size() != stringLength) {
			// // System.out.println(set);
			// makeCounts(new ArrayList<String>(set), givenString);
			// }
			// }

			System.out.println(maxlength);
			System.out.println((System.currentTimeMillis() - startMili) / 1000 + " with total time ");
			scan.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static ArrayList<ArrayList<String>> findPowerSet(ArrayList<String> originalSet, int pos) {
		if (originalSet == null)
			return null;

		if (pos == originalSet.size()) {
			ArrayList<ArrayList<String>> powerSet = new ArrayList<ArrayList<String>>();
			ArrayList<String> subset = new ArrayList<String>();
			powerSet.add(subset);
			return powerSet; // return powerset with 1 element as [ [] ]
		}

		ArrayList<ArrayList<String>> subPowerSet = findPowerSet(originalSet, pos + 1);

		String currentVal = originalSet.get(pos);

		// copy each subset into a new one, and add current element to it
		ArrayList<ArrayList<String>> subPowerSet2 = new ArrayList<ArrayList<String>>();

		for (ArrayList<String> subset : subPowerSet) {
			ArrayList<String> subset2 = (ArrayList<String>) subset.clone();
			subset2.add(currentVal);
			subPowerSet2.add(subset2);
		}

		// merge the two sub-powersets into one
		subPowerSet.addAll(subPowerSet2);
		return subPowerSet;
	}

	private static Set<Set<String>> powerSet(Set<String> originalSet) {
		Set<Set<String>> sets = new HashSet<Set<String>>();
		if (originalSet.isEmpty()) {
			sets.add(new HashSet<String>());
			return sets;
		}
		ArrayList<String> list = new ArrayList<String>(originalSet);
		String head = list.get(0);
		Set<String> rest = new HashSet<String>(list.subList(1, list.size()));
		for (Set<String> set : powerSet(rest)) {
			Set<String> newSet = new HashSet<String>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		// System.out.println(sets);
		return sets;
	}

	private static void makeCounts(ArrayList<String> charecterList, String givenString) {
		// System.out.println(charecterList);
		// System.out.println(" \n from " + givenString + " we need to remove "
		// + charecterList
		// + " with size as charecterList " + charecterList.size());

		// StringBuilder stringBuilder = new StringBuilder(givenString);

		for (String string : charecterList) {
			givenString = givenString.replace(string, "");
		}

		if (isAValidString(givenString))
			maxlength = givenString.length() > maxlength ? givenString.length() : maxlength;

	}

	private static boolean isAValidString(String givenString) {

		// System.out.println(givenString);

		boolean isValid = false;

		for (int i = 0; i < givenString.length(); i++) {
			if (i % 2 == 0) {
				evenPos.add(givenString.charAt(i));
				mixPos.add(givenString.charAt(i));
			} else {
				oddPos.add(givenString.charAt(i));
				mixPos.add(givenString.charAt(i));
			}
		}

		if (!evenPos.isEmpty() && evenPos.size() <= 1 && !oddPos.isEmpty() && oddPos.size() <= 1
				&& mixPos.size() == 2) {
			isValid = true;
		}

		if (isValid)
			System.out.println(givenString + " evenPos" + evenPos + " oddPos" + oddPos + " isValid" + isValid);

		oddPos.clear();
		evenPos.clear();
		mixPos.clear();

		return isValid;
	}

}
