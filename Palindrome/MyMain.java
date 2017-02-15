import java.util.Arrays;
import java.util.Scanner;

public class MyMain {

	public static final int DIGITS = 6;
	static Scanner keyboard = new Scanner(System.in);
	public static int[] a = new int[DIGITS];
	static int p = 0;
	static int nm = 0;

	public static void main(String[] args) {

		Pal pal = new Pal();
		String mov = "";

		int n = 0;
		n = get_number();

		for (int i = 0; i < DIGITS; i++) {
			a[i] = (int) (Math.floor(n / Math.pow(10, DIGITS-i-1)) - 10*Math.floor(n / Math.pow(10, DIGITS-i)));
		}

		pal.print_status();

		while (!pal.is_palindrome(a)) {
			mov = ask_for_movement();
			nm++;
			switch (mov) {
				case ("a"):
				if (p > 0) {
					p--;
				}
				break;
				case ("w"):
				if (a[p] < 9) {
					a[p]++;
				}
				break;
				case ("d"):
				if (p < a.length-1) {
					p++;
				}
				break;
				case ("x"):
				if (a[p] > 0) {
					a[p]--;
				}
				break;
				default:
				break;
			}
			pal.print_status();

		}
		System.out.println("SUCCESS!");
	}

	static private boolean check_message(String m) {
		int n = 0;

		try {
			n = Integer.parseInt(m);
			return (n >= (int) Math.pow(10, DIGITS-1) && n < (int) Math.pow(10, DIGITS));
		} catch (Exception e) {
			return false;
		} 
	}

	private static boolean check_command(String s) {
		return s.matches("(a|d|w|x)");
	}


	static public int get_number() {
		String  s;

		do {
			System.out.print("\nEnter a number between "+ (int) Math.pow(10, DIGITS-1) +" and " + (int) Math.pow(10, DIGITS) + ": ");
			s = keyboard.next();
		} while (!check_message(s));
		return Integer.parseInt(s);

	}

	static private String ask_for_movement() {
		String  s;

		do {
			System.out.print("\nNEW MOVEMENT: Enter a valid command by keyword:: ");
			s = keyboard.next();
		} while (!check_command(s));
		return s;
	}
}
