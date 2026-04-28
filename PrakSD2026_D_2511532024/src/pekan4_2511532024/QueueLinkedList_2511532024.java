package pekan4_2511532024;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532024 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++) 
			q.add(i);
			
		// menampilkan isi antrian
		System.out.println("Elemen Antrian " + q);
		
		// untuk menghapus kepala antrian
		int hapus = q.remove();
		System.out.println("Hapus elemen = " + hapus);
		System.out.println(q);
		
		// untuk melihat antrian terdepan
		int depan = q.peek();
		System.out.println("Kepala Antrian = " + depan);
		
		// untuk melihat jumlah antrian
		int banyak = q.size();
		System.out.println("Size Antrian = " + banyak);
	}
}
