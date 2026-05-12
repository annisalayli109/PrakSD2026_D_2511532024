package pekan6_2511532024;

public class HapusDLL_2511532024 {
	// fungsi menghapus node awal
	public static NodeDLL_2511532024 delHead_2024(NodeDLL_2511532024 head_2024) {
		if (head_2024 == null) {
			return null;
		}
		NodeDLL_2511532024 temp_2024 = head_2024;
		head_2024 = head_2024.next_2024;
		if (head_2024 != null) {
			head_2024.prev_2024 = null;
		}
		return head_2024;
	}
	//fungsi menghapus di akhir
	public static NodeDLL_2511532024 delLast_2024(NodeDLL_2511532024 head_2024) {
		if (head_2024 == null) {
			return null;
		}
		if (head_2024.next_2024 == null) {
			return null;
		}
		NodeDLL_2511532024 curr_2024 = head_2024;
		while (curr_2024.next_2024 != null) {
			curr_2024 = curr_2024.next_2024;
		}
		// update pointer previous node
		if (curr_2024.prev_2024 != null) {
			curr_2024.prev_2024.next_2024 = null;
		}
		return head_2024;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511532024 delPos_2024(NodeDLL_2511532024 head_2024, int pos_2024) {
		// jika DLL kosong
		if (head_2024 == null) {
			return head_2024;
		}
		NodeDLL_2511532024 curr_2024 = head_2024;
		// telusuri sampai ke node yang akan dihapus
		for (int i_2024 = 1; curr_2024 != null && i_2024 < pos_2024; ++i_2024) {
			curr_2024 = curr_2024.next_2024;
		}
		// jika posisi tidak ditemukan
		if (curr_2024 == null) {
			return head_2024;
		}
		// update pointer
		if (curr_2024.prev_2024 != null) {
			curr_2024.prev_2024.next_2024 = curr_2024.next_2024;
		}
		if (curr_2024.next_2024 != null) {
			curr_2024.next_2024.prev_2024 = curr_2024.prev_2024;
		}
		// jika yang dihapus head
		if (head_2024 == curr_2024) {
			head_2024 = curr_2024.next_2024;
		}
		return head_2024;
	}
	// fungsi mencetak DLL
	public static void printList_2024(NodeDLL_2511532024 head_2024) {
		NodeDLL_2511532024 curr_2024 = head_2024;
		while (curr_2024 != null) {
			System.out.print(curr_2024.data_2024 + " <-> ");
			curr_2024 = curr_2024.next_2024;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// buat sebuah DLL
		NodeDLL_2511532024 head_2024 = new NodeDLL_2511532024(1);
		head_2024.next_2024 = new NodeDLL_2511532024(2);
		head_2024.next_2024.prev_2024 = head_2024;
		head_2024.next_2024.next_2024 = new NodeDLL_2511532024(3);
		head_2024.next_2024.next_2024.prev_2024 = head_2024.next_2024;
		head_2024.next_2024.next_2024.next_2024 = new NodeDLL_2511532024(4);
		head_2024.next_2024.next_2024.next_2024.prev_2024 = head_2024.next_2024.next_2024;
		head_2024.next_2024.next_2024.next_2024.next_2024 = new NodeDLL_2511532024(5);
		head_2024.next_2024.next_2024.next_2024.next_2024.prev_2024 =		head_2024.next_2024.next_2024.next_2024;
		
		System.out.print("DLL Awal: ");
		printList_2024(head_2024);
		
		System.out.print("Setelah head dihapus: ");
		head_2024 = delHead_2024(head_2024);
		printList_2024(head_2024);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_2024 = delLast_2024(head_2024);
		printList_2024(head_2024);
		
		System.out.print("menghapus node ke 2: ");
		head_2024 = delPos_2024(head_2024, 2);
		
		printList_2024(head_2024);
	}
}





























