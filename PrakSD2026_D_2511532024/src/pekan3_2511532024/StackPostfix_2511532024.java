package pekan3_2511532024;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532024 {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s_2024 = new Stack<Integer>();
		Scanner input_2024 = new Scanner (expression);
		while (input_2024.hasNext()) {
			if (input_2024.hasNextInt()) {		// an operand (integer)
				s_2024.push (input_2024.nextInt());
			} else {							// an operator
				String operator = input_2024.next();
				int operand2 = s_2024.pop();
				int operand1 = s_2024.pop();
				if (operator.equals("+")) {
					s_2024.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s_2024.push(operand1 - operand2);
				} else if (operator.equals("*")) {
					s_2024.push(operand1 * operand2);
				} else {
					s_2024.push(operand1 / operand2);
				}	
			}
		}
		input_2024.close();
		return s_2024.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix= " + postfixEvaluate("5 2 4 * + 7 -"));
	}
}
