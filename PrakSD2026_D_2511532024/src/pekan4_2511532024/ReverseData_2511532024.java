package pekan4_2511532024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532024 {

	public static void main(String[] args) {
		Queue<Integer> q_2024 = new LinkedList<Integer>();
		q_2024.add(1);
		q_2024.add(2);
		q_2024.add(3); // {1,2,3}
		System.out.println("sebelum reverse = " + q_2024);
		Stack<Integer> s_2024 = new Stack<Integer>();
		while (!q_2024.isEmpty()) { // Q -> S
			s_2024.push(q_2024.remove());
		}
		while (!s_2024.isEmpty()) { // S -> Q
			q_2024.add(s_2024.pop());
		}
		System.out.println("sesudah reverse = " + q_2024); // {3,2,1}
	}
}
