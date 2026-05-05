package pekan5_2511532024;

public class TambahSLL_2511532024 {
	public static NodeSLL_2511532024 insertAtFront_2024(NodeSLL_2511532024 head_2024, int value_2024) {
		NodeSLL_2511532024 new_node_2024 = new NodeSLL_2511532024(value_2024);
		new_node_2024.next_2024 = head_2024;
		return new_node_2024;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511532024 insertAtEnd_2024(NodeSLL_2511532024 head_2024, int value_2024) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511532024 newNode_2024 = new NodeSLL_2511532024(value_2024);
		// jika list kosong maka node jadi head
		if (head_2024 == null) {
			return newNode_2024;
		}
		// simpan head ke variabel sementara
		NodeSLL_2511532024 last_2024 = head_2024;
		// telusuri ke node akhir
		while (last_2024.next_2024 != null) {
			last_2024 = last_2024.next_2024;
		}
		// ubah pointer
		last_2024.next_2024 = newNode_2024;
		return head_2024;
	}
	static NodeSLL_2511532024 GetNode_2024(int data_2024) {
		return new NodeSLL_2511532024(data_2024);
	}
	
	static NodeSLL_2511532024 insertPos_2024(NodeSLL_2511532024 headNode_2024, int position_2024, int value_2024) {
		NodeSLL_2511532024 head_2024 = headNode_2024;
		if (position_2024 < 1) 
			System.out.print("Invalid position");
		if (position_2024 == 1) {
			NodeSLL_2511532024 new_node_2024 = new NodeSLL_2511532024(value_2024);
			new_node_2024.next_2024 = head_2024;
			return new_node_2024;
		} else {
			while (position_2024-- != 0) {
				if (position_2024 == 1) {
					NodeSLL_2511532024 newNode_2024 = GetNode_2024(value_2024);
					newNode_2024.next_2024 = headNode_2024.next_2024;
					headNode_2024.next_2024 = newNode_2024;
					break;
				}
				headNode_2024 = headNode_2024.next_2024;
			}
			if (position_2024 != 1) 
				System.out.print("Posisi di luar jangkauan");
				return head_2024;
				}
			}
		
		public static void printList_2024 (NodeSLL_2511532024 head_2024) {
			NodeSLL_2511532024 curr_2024 = head_2024;
			while (curr_2024.next_2024 != null) {
				System.out.print(curr_2024.data_2024+" --> ");
				curr_2024 = curr_2024.next_2024;
			}
			if (curr_2024.next_2024 == null) {
				System.out.print(curr_2024.data_2024);
				System.out.println();
			}
		}
			
		public static void main(String[] args) {
			// buat linked list 2->3->5->6
			NodeSLL_2511532024 head_2024 = new NodeSLL_2511532024(2);
			head_2024.next_2024 = new NodeSLL_2511532024(3);
			head_2024.next_2024.next_2024 = new NodeSLL_2511532024(5);
			head_2024.next_2024.next_2024.next_2024 = new NodeSLL_2511532024(6);
			// cetak list asli
			System.out.print("Senarai berantai awal: ");
			printList_2024(head_2024);
			// tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan: ");
			int data_2024 = 1;
			head_2024 = insertAtFront_2024(head_2024, data_2024);
			// cetak update list
			printList_2024(head_2024);
			// tambahkan node baru di belakang
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_2024 = 7;
			head_2024 = insertAtEnd_2024(head_2024, data2_2024);
			// cetak update list
			printList_2024(head_2024);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3_2024 = 4;
			int pos_2024 = 4;
			head_2024 = insertPos_2024(head_2024, pos_2024, data3_2024);
			// cetak update list
			printList_2024(head_2024);
			}
				
	}






































