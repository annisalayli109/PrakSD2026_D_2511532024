package pekan9_2511532024;

public class BTreeDriver_2511532024 {
	public static void main(String[] args) {
		// membuat pohon
		BTree_2511532024 tree_2024 = new BTree_2511532024();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_2024.countNodes_2024());
		// menambahkan simpul data 1
		Node_2511532024 root_2024 = new Node_2511532024(1);
		// menjadikan simpul 1 sebagai root
		tree_2024.setRoot_2024(root_2024);
		System.out.print("Jumlah simpul jika hanya ada root ");
		System.out.println(tree_2024.countNodes_2024());
		Node_2511532024 node2 = new Node_2511532024 (2);
		Node_2511532024 node3 = new Node_2511532024 (3);
		Node_2511532024 node4 = new Node_2511532024 (4);
		Node_2511532024 node5 = new Node_2511532024 (5);
		Node_2511532024 node6 = new Node_2511532024 (6);
		Node_2511532024 node7 = new Node_2511532024 (7);
		Node_2511532024 node8 = new Node_2511532024 (8);
		Node_2511532024 node9 = new Node_2511532024 (9);
		root_2024.setLeft_2024(node2);
		node2.setLeft_2024(node4);
		node2.setRight_2024(node5);
		node4.setRight_2024(node8);
		root_2024.setRight_2024(node3);
		node3.setLeft_2024(node6);
		node3.setRight_2024(node7);
		node6.setLeft_2024(node9);
		// set root
		tree_2024.setCurrent_2024(tree_2024.getRoot_2024());
		System.out.print("Menampilkan simpul terakhir: ");
		System.out.println(tree_2024.getCurrent_2024().getData_2024());
		System.out.print("Jumlah simpul; setelah simpul 7 ditambahkan ");
		System.out.println(tree_2024.countNodes_2024());
		System.out.println("InOrder: ");
		tree_2024.printInOrder_2024();
		System.out.println("\nPreOrder: ");
		tree_2024.printPreOrder_2024();
		System.out.println("\nPostOrder: ");
		tree_2024.printPostOrder_2024();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_2024.print_2024();
	}
}
