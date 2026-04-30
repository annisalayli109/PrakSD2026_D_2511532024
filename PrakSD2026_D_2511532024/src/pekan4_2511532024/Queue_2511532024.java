package pekan4_2511532024;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_2511532024 {

	int front_2024, rear_2024, size_2024;
	int max_2024;
	String queue_2024[];
	
	// Konstruktor
	public Queue_2511532024(int max) {
		this.max_2024 = max;
		front_2024 = 0;
		size_2024 = 0;
		rear_2024 = max - 1;
		queue_2024 = new String[this.max_2024];
	}
	
	boolean isFull_2024() {
		return (size_2024 == max_2024);
	}
	
	boolean isEmpty_2024() {
		return (size_2024 == 0);
	}
	
	void enqueue_2024(String nama_2024) {
		if (isFull_2024()) {
			System.out.println("Antrian penuh.");
			return;
		}
		
		rear_2024 = (rear_2024 + 1) % max_2024;
		queue_2024[rear_2024] = nama_2024;
		size_2024++;
		System.out.println("Data berhasil ditambahkan ke antrian");
	}
	
	String dequeue_2024() {
		if (isEmpty_2024()) {
			return null;
		}
		
		String pelanggan_2024 = queue_2024[front_2024];
		front_2024 = (front_2024 + 1) % max_2024;
		size_2024--;
		return pelanggan_2024;
	}
	
	void display_2024() {
		if (isEmpty_2024()) {
			System.out.println("\nAntrian kosong.");
			return;
		}
		
		System.out.println("\nIsi antrian: ");
		for (int i_2024 = 0; i_2024 < size_2024; i_2024++) {
			int index_2024 = (front_2024 + i_2024) % max_2024;
			System.out.println((i_2024 + 1) + ". " + queue_2024[index_2024]);
		}
	}
	
	void reverse_2024() {
		if (isEmpty_2024()) {
			System.out.println("\nAntrian kosong.");
			return;
		}
		
		java.util.Queue<String> qTemp_2024 = new java.util.LinkedList<>();
        java.util.Stack<String> s_2024 = new java.util.Stack<>();
        
        for (int i_2024 = 0; i_2024 < size_2024; i_2024++) {
        	int index_2024 = (front_2024 + i_2024) % max_2024;
        	qTemp_2024.add(queue_2024[index_2024]);
        }
        
        while (!qTemp_2024.isEmpty()) {
        	s_2024.push(qTemp_2024.remove());
        }
        
        for (int i_2024 = 0; i_2024 < size_2024; i_2024++) {
        	int index_2024 = (front_2024 + i_2024) % max_2024;
        	queue_2024[index_2024] = s_2024.pop();
        }
        
        System.out.println("\nAntrian berhasil dibalik.");
	}
}

