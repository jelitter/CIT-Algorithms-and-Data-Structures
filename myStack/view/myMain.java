package view;
import model.MyStack;
import model.MyStackArray;

public class myMain {

	public static void main(String[] args) {

		MyStack st = new MyStackArray(5);
		
		System.out.println("\n---- PUSHING ---");

		for (int i = 1; i <= 10; i++) {
			st.push(i);
			System.out.println("Pushed number: " +i+ "\nNew stack: " + st.toString());
		}
		
		System.out.println("\n---- POPPING ---");

		try {
			for (int i = 1; i <= 12; i++) {

				System.out.println("Popped number: " + st.pop() + "\nNew stack: " + st.toString());
			}
		} catch (Exception e) {
			System.out.println("Error: Cannot pop any more items. Stack: " + st.toString() + "\n" + e.getMessage());
		}
	}	
}
