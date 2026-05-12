package pekan6_2511532024;

public class InsertDLL_2511532024 {
	// menambahkan node diawal DLL
	static NodeDLL_2511532024 insertBegin_2024(NodeDLL_2511532024 head_2024, int data_2024) {
		// buat node baru
		NodeDLL_2511532024 new_node_2024 = new NodeDLL_2511532024(data_2024);
		// jadikan pointer nextnya head
		new_node_2024.next_2024 = head_2024;
		// jadikan pointer prev head ke new_node
		if (head_2024 != null) {
			head_2024.prev_2024 = new_node_2024;
		}
		return new_node_2024;
	}
	//fungsi menambahkan node diakhir
	public static NodeDLL_2511532024 insertEnd_2024(NodeDLL_2511532024 head_2024, int newData_2024) {
		// buat node baru
		NodeDLL_2511532024 newNode_2024 = new NodeDLL_2511532024(newData_2024);
		// jika dll null dijadikan head
		if (head_2024 == null) {
			head_2024 = newNode_2024;
		} else {
			NodeDLL_2511532024 curr_2024 = head_2024;
			while (curr_2024.next_2024 != null) {
				curr_2024 = curr_2024.next_2024;
			}
			curr_2024.next_2024 = newNode_2024;
			newNode_2024.prev_2024 = curr_2024;
		}
		return head_2024;
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532024 insertAtPosition_2024(NodeDLL_2511532024 head_2024, int pos_2024, int new_data_2024) {
		// buat node baru
		NodeDLL_2511532024 new_node_2024 = new NodeDLL_2511532024(new_data_2024);
		if (pos_2024 == 1) {
			new_node_2024.next_2024 = head_2024;
			if (head_2024 != null) {
				head_2024.prev_2024 = new_node_2024;
			}
			head_2024 = new_node_2024;
			return head_2024;
		}
		NodeDLL_2511532024 curr_2024 = head_2024;
		
		for (int i_2024 = 1; i_2024 < pos_2024 - 1 && curr_2024 != null; ++i_2024) {
			curr_2024 = curr_2024.next_2024;
		}
			if (curr_2024 == null) {
				System.out.println("Posisi tidak ada");
				return head_2024;
			}
			new_node_2024.prev_2024 = curr_2024;
			new_node_2024.next_2024 = curr_2024.next_2024;
			curr_2024.next_2024 = new_node_2024;
			if (new_node_2024.next_2024 != null) {
				new_node_2024.next_2024.prev_2024 = new_node_2024;
			}
			return head_2024;
	}
	
	public static void printList_2024(NodeDLL_2511532024 head_2024) {
		NodeDLL_2511532024 curr_2024 = head_2024;
		while (curr_2024 != null) {
			System.out.print(curr_2024.data_2024 + " <-> ");
			curr_2024 = curr_2024.next_2024;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511532024 head_2024 = new NodeDLL_2511532024(2);
		head_2024.next_2024 = new NodeDLL_2511532024(3);
		head_2024.next_2024.prev_2024 = head_2024;
		head_2024.next_2024.next_2024 = new NodeDLL_2511532024(5);
		head_2024.next_2024.next_2024.prev_2024 = head_2024.next_2024;
		// cetak DLL awal
		System.out.print("DLL Awal: ");
		printList_2024(head_2024);
		// tambah 1 diawal
		head_2024 = insertBegin_2024(head_2024, 1);
		System.out.print("Simpul 1 ditambah di awal: ");
		printList_2024(head_2024);
		// tambah 6 diakhir
		System.out.print("Simpul 6 di tambah di akhir: ");
		printList_2024(head_2024);
		int data_2024 = 6;
		head_2024 = insertEnd_2024(head_2024, data_2024);
		printList_2024(head_2024);
		// menambahkan node 4 diposisi 4
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_2024 = 4;
		int pos_2024 = 4;
		head_2024 = insertAtPosition_2024(head_2024, pos_2024, data2_2024);
		printList_2024(head_2024);
	}
}






















