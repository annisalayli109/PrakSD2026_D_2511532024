package pekan2_2511532024;

import java.util.ArrayList;

public class ArrayList1_2511532024 {

	public static void main(String[] args) {
		// size of the arraylist
		int n = 5;
		// declaring the arraylist with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		// appending new elements at the end of the list
		for (int i = 1; i <= n; i++)
		arrli.add(i);
		// printing elements
		System.out.println(arrli);
		// remove element at index 3
		arrli.remove(3);
		// displaying the arraylist
		// after deletion
		System.out.println(arrli);
		// printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
		System.out.print(arrli.get(i) + " ");
	}

}
