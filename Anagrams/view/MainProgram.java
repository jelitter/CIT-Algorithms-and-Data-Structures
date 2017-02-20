package view;
import java.util.Arrays;

import model.Anagram;

public class MainProgram {

	public static void main(String[] args) {

		int[] a1 = new int[] {11,1,3,4,5,6,7,7};
		int[] a2 = new int[] {7,7,6,5,4,3,1,11};

		System.out.println("");
		System.out.println("--------------------");
		System.out.println("  Anagrams3:");
		System.out.println("    a1: " + Arrays.toString(a1));
		System.out.println("    a2: " + Arrays.toString(a2));
		System.out.println("    anagrams3: " + Boolean.toString(Anagram.anagrams3(a1, a2)));
		System.out.println("--------------------");
		System.out.println("");
	}
}
