package model;

public class Anagram {

	public static boolean anagrams3 (int[] a1, int[] a2) {

		if (a1.length != a2.length)
			return false;

		for (int i = 0; i < a1.length; i++) {
			if (appearances(a1, a1[i]) != appearances(a2, a1[i]))
				return false;
		}
		return true;
	}

	public static int appearances (int[] arr, int item) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item)
				count++;
		}		
		return count;
	}
}
