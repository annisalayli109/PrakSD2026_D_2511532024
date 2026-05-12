package pekan6_2511532024;

public class PenelusuranDLL_2511532024 {
	// fungsi penelusuran maju
	static void forwardTraversal_2024(NodeDLL_2511532024 head_2024) {
		// memulai penelusuran dari head
		NodeDLL_2511532024 curr_2024 = head_2024;
		// lanjutkan sampai akhir
		while (curr_2024 != null) {
			// print data
			System.out.print(curr_2024.data_2024 + " <-> ");
			// pindah ke node berikutnya
			curr_2024 = curr_2024.next_2024;
		}
		// print spasi
		System.out.println();
	}
	// fungsi penelusuran mundur
	static void backwardTraversal_2024(NodeDLL_2511532024 tail_2024) {
		// mulai dari akhir
		NodeDLL_2511532024 curr_2024 = tail_2024;
		// lanjut sampai head
		while (curr_2024 != null) {
			//cetak data
			System.out.print(curr_2024.data_2024 + " <-> ");
			// pindah ke node sebelumnya
			curr_2024 = curr_2024.prev_2024;
		}
		// cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511532024 head_2024 = new NodeDLL_2511532024(1);
		NodeDLL_2511532024 second_2024 = new NodeDLL_2511532024(2);
		NodeDLL_2511532024 third_2024 = new NodeDLL_2511532024(3);
		
		head_2024.next_2024 = second_2024;
		second_2024.prev_2024 = head_2024;
		second_2024.next_2024 = third_2024;
		third_2024.prev_2024 = second_2024;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_2024(head_2024);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_2024(third_2024);
	}
}


















