package pekan4_2511532024;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532024 {

	public static void main(String[] args) {
		Queue<Integer> q_2024 = new LinkedList<>();
		
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i_2024 = 0; i_2024 < 6; i_2024++) 
			q_2024.add(i_2024);
			
		// menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_2024);
		
		// untuk menghapus kepala antrian
		int hapus_2024 = q_2024.remove();
		System.out.println("Hapus elemen = " + hapus_2024);
		System.out.println(q_2024);
		
		// untuk melihat antrian terdepan
		int depan_2024 = q_2024.peek();
		System.out.println("Kepala Antrian = " + depan_2024);
		
		// untuk melihat jumlah antrian
		int banyak_2024 = q_2024.size();
		System.out.println("Size Antrian = " + banyak_2024);
	}
}
