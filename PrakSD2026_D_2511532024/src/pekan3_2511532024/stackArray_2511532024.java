package pekan3_2511532024;

public class stackArray_2511532024 {
	static final int MAX_2024 = 1000;
	int top_2024;
	int a_2024[] = new int [MAX_2024];
	boolean isEmpty_2024() {
		return (top_2024 < 0);
	}
	stackArray_2511532024(){
		top_2024 = -1;
	}
	boolean push_2024(int x) {
		if (top_2024 >= (MAX_2024 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a_2024[++top_2024] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2024() {
		if (top_2024 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2024[top_2024--];
			return x;
		}
	}
	int peek_2024() {
		if (top_2024 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2024[top_2024];
			return x;
		}
	}
	void print_2024() {
		for (int i = top_2024; i > -1; i--) {
			System.out.print(" " + a_2024[i]);
		}
	}	
}
