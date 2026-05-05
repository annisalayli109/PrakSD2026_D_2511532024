package pekan5_2511532024;

public class PencarianSLL_2511532024 {
	static boolean searchKey_2024 (NodeSLL_2511532024 head_2024, int key_2024) {
		NodeSLL_2511532024 curr_2024 = head_2024;
		while (curr_2024 != null) {
			if (curr_2024.data_2024 == key_2024)
				return true;
			curr_2024 = curr_2024.next_2024;
		}
			return false;
	}
	
	public static void traversal_2024(NodeSLL_2511532024 head_2024) {
		// mulai dari head
		NodeSLL_2511532024 curr_2024 = head_2024;
		// telusuri sampai pointer null
		while (curr_2024 != null) {
			System.out.print(" " + curr_2024.data_2024);
			curr_2024 = curr_2024.next_2024;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeSLL_2511532024 head_2024 = new NodeSLL_2511532024(14);
		head_2024.next_2024 = new NodeSLL_2511532024(21);
		head_2024.next_2024.next_2024 = new NodeSLL_2511532024(13);
		head_2024.next_2024.next_2024.next_2024 = new NodeSLL_2511532024(30);
		head_2024.next_2024.next_2024.next_2024.next_2024 = new NodeSLL_2511532024(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2024(head_2024);
		// data yang akan dicari
		int key_2024 = 30;
		System.out.print("cari data " + key_2024 + " = ");
		if (searchKey_2024(head_2024, key_2024))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");
	}
}














