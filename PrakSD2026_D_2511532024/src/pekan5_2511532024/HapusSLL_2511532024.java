package pekan5_2511532024;

public class HapusSLL_2511532024 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511532024 deleteHead_2024(NodeSLL_2511532024 head_2024) {
		// jika SLL kosong
		if (head_2024 == null)
			return null;
		//pindahkan head ke node berikutnya
		head_2024 = head_2024.next_2024;
		// return head baru
		return head_2024;
	}
	
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2511532024 removeLastNode_2024(NodeSLL_2511532024 head_2024) {
		// jika list kosong, return null
		if (head_2024 == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head_2024.next_2024 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2511532024 secondLast_2024 = head_2024;
		while (secondLast_2024.next_2024.next_2024 != null) {
			secondLast_2024 = secondLast_2024.next_2024;
		}
		// hapus node terakhir
		secondLast_2024.next_2024 = null;
		return head_2024;
	}

	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511532024 deleteNode_2024(NodeSLL_2511532024 head_2024, int position_2024) {
		NodeSLL_2511532024 temp_2024 = head_2024;
		NodeSLL_2511532024 prev_2024 = null;
		// jika linked list null
		if (temp_2024 == null)
			return head_2024;
		// kasus 1: head dihapus
		if (position_2024 == 1) {
			head_2024 = temp_2024.next_2024;
			return head_2024;
		}
		// kasus 2: menghapus node di tengah
		// telusuri ke node yang dihapus
		for (int i_2024 = 1; temp_2024 != null && i_2024 < position_2024; i_2024++) {
			prev_2024 = temp_2024;
			temp_2024 = temp_2024.next_2024;
		}
		// jika ditemukan, hapus node
		if  (temp_2024 != null) {
			prev_2024.next_2024 = temp_2024.next_2024;
		} else {
			System.out.println("Data tidak Ada");
			return head_2024;
		}
		return prev_2024;	
	}
	// fungsi mencetak SLL
	public static void printList_2024(NodeSLL_2511532024 head_2024) {
		NodeSLL_2511532024 curr_2024 = head_2024;
		while (curr_2024.next_2024 != null) {
			System.out.print(curr_2024.data_2024 + " --> ");
			curr_2024 = curr_2024.next_2024;
		}
		if (curr_2024.next_2024 == null) {
			System.out.print(curr_2024.data_2024);
			System.out.println();
		}
	}	
	// kelas main
	public static void main(String[] args) {
		// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511532024 head_2024 = new NodeSLL_2511532024(1);
		head_2024.next_2024 = new NodeSLL_2511532024(2);
		head_2024.next_2024.next_2024 = new NodeSLL_2511532024(3);
		head_2024.next_2024.next_2024.next_2024 = new NodeSLL_2511532024(4);
		head_2024.next_2024.next_2024.next_2024.next_2024 = new NodeSLL_2511532024(5);
		head_2024.next_2024.next_2024.next_2024.next_2024.next_2024 = new NodeSLL_2511532024(6);
		// cetak list awal
		System.out.println("List awa: ");
		printList_2024(head_2024);
		// hapus head
		head_2024 = deleteHead_2024(head_2024);
		System.out.println("List setelah head dihapus: ");
		printList_2024(head_2024);
		// hapus node terakhir
		head_2024 = removeLastNode_2024(head_2024);
		System.out.println("List setelah simpul terakhir di hapus ");
		printList_2024(head_2024);
		// deleting node at position 2
		int position_2024 = 2;
		head_2024 = deleteNode_2024(head_2024, position_2024);
		// print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2024(head_2024);
	}
}























