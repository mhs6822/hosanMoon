package stackMemoryImplement;

import java.util.Scanner;

interface Stack {
	int length();			// return stored number
	int capacity();			// return capacity of stack memory
	String pop();			// return stored string of top(last) position
	boolean push(String val);	// store string at top position and return boolean type
}

class StringStack implements Stack {
	private String[] data;
	private int top = -1;
	
	@Override
	public int length() {
		return top + 1;
	}

	@Override
	public int capacity() {
		return data.length;
	}

	@Override
	public String pop() {
		if (top == -1) return null;
		String str = data[top];		// pop string of top position and store in str temporarily 
		data[top] = null;			
		top--;						// reduce index number of top
		return str;
	}

	@Override
	public boolean push(String val) {
		if(top ==  data.length-1) { return false; }
		else {
			top++;
			data[top] = val;
			return true;
		}
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input size of stack capacity >> ");
		int n = Integer.parseInt(sc.nextLine());
		
		data = new String[n];
		
		while(true) {
			System.out.println("input string >> ");
			String str = sc.nextLine();
			if(str.equals("stop")) { break; }
			boolean result = push(str);
			if(result == false) {
				System.out.println("stack is full and push is impossible !");
			}
		}
		
		System.out.println("-- print all stored string in stack --");
		int len = length();	// return currently stored index number 
		for(int i=0; i<len; i++) {
			System.out.print(pop() + " ");
		}
		System.out.println();
	}
}

public class StackMemoryImplement {
	public static void main(String[] args) {
		StringStack s = new StringStack();
		s.run();
	}
}
