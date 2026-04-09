package pekan3_2511532024;

import java.util.Stack;

public class NilaiMaksimum_2511532024 {
	
	public static int max_2024 (Stack<Integer> s_2024){
		Stack<Integer> backup_2024 = new Stack<Integer>();
		int maxValue_2024 = s_2024.pop();
		backup_2024.push(maxValue_2024);
		while (!s_2024.isEmpty()) {
			int next = s_2024.pop();
			backup_2024.push(next);
			maxValue_2024 = Math.max(maxValue_2024, next);
		}
		while (!backup_2024.isEmpty()) {
			s_2024.push(backup_2024.pop());
		}
		return maxValue_2024;
	}
	public static void main(String[] args) {
		Stack<Integer> s_2024 = new Stack<Integer>();
		s_2024.push(70);
		s_2024.push(12);
		s_2024.push(20);
		System.out.println("isi stack " + s_2024);
		System.out.println("Stack Teratas " + s_2024.peek());
		System.out.println("Nilia maksimum " + max_2024(s_2024));
	}
}
