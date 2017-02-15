import java.util.Arrays;

public class Pal {


	public boolean is_palindrome(int[] a) {

		for (int i = 0; i < (int) a.length/2 + 1; i++) {
			if (a[i] != a[a.length - i -1]) {
				return false;
			}
		}
		return true;
	}
	
	void print_status() {
		String spaces = " ";
		for (int i = 0; i < MyMain.p; i++) {
			spaces = spaces.concat("   ");
		}
		System.out.println(Arrays.toString(MyMain.a));
		System.out.println(spaces + "^");
		System.out.println("nm: " + MyMain.nm);

	}
	
	private void update_status (int[] list, int position,char movement) {
		// TODO Auto-generated method stub

	}
}
