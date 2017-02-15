package model;

import java.util.Arrays;

public class MyStackArray implements MyStack {

	private int[] stack;
	private int numItems;
	private int MAX;

	public MyStackArray(int size) {
		this.MAX = size;
		this.numItems = 0;
		this.stack = new int[MAX];
		for (int i = 0; i < this.numItems; i++) {
			this.stack[i] = 0;
		}
	}

	public void push(int value) {

		if (this.numItems >= this.MAX - 1) {
			this.resize();
		}
		for (int i = this.numItems; i >= 0; i--) {
			this.stack[i+1] = this.stack[i];
		}
		this.stack[0] = value;
		this.numItems++;
	}

	public int pop() throws Exception {
		if (this.numItems == 0) {
			throw (new Exception());
		} else {
			int ret = this.stack[0];
			for (int i = 0; i < this.numItems; i++) {
				this.stack[i] = this.stack[i+1];
			}
			this.numItems--;
			return ret;
		}
	}

	private void resize() {

		this.MAX = (int) Math.floor(MAX * 1.5);
		int [] newStack = new int[this.MAX];
		
		// Copying items to new stack
		for (int i = 0; i < this.numItems; i++) {
			newStack[i] = this.stack[i];
		}
		this.stack = new int[this.MAX];
		for (int i = 0; i < this.numItems; i++) {
			this.stack[i] = newStack[i];
		}	
		System.out.println("*** Stack resized:" + this.toString());

	}
	
	public String toString() {
		return Arrays.toString(this.stack) + " - Items: " + this.numItems;
	}
}
