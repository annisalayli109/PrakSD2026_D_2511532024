package pekan4_2511532024;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511532024 {

	public static void main(String[] args) {
		Queue<String> q_2024 = new LinkedList<>();
		q_2024.add("Praktikum");
		q_2024.add("Struktur");
		q_2024.add("Data");
		q_2024.add("Dan");
		q_2024.add("Algoritma");
		Iterator<String> iterator = q_2024.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
