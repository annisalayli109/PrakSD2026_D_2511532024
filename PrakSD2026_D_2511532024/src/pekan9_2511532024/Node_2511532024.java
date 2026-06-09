package pekan9_2511532024;

public class Node_2511532024 {
	int data_2024;
	Node_2511532024 left_2024;
	Node_2511532024 right_2024;
	
	public Node_2511532024(int data_2024) {
		this.data_2024 = data_2024;
		left_2024 = null;
		right_2024 = null;
	}
	public void setLeft_2024(Node_2511532024 node_2024) {
		if (left_2024 == null)
			left_2024 = node_2024;
	}
	public void setRight_2024(Node_2511532024 node_2024) {
		if (right_2024 == null)
			right_2024 = node_2024;
	}
	public Node_2511532024 getLeft_2024() {
		return left_2024;
	}
	public Node_2511532024 getRight_2024() {
		return right_2024;
	}	
	public int getData_2024() {
		return data_2024;
	}	
	public void setData_2024(int data_2024) {
		this.data_2024 = data_2024;
	}	
	void printPreOrder_2024(Node_2511532024 node_2024) {
		if(node_2024 == null)
			return;
		System.out.print(node_2024.data_2024 + " ");
		printPreOrder_2024(node_2024.left_2024);
		printPreOrder_2024(node_2024.right_2024);
	}
	void printPostOrder_2024(Node_2511532024 node_2024) {
		if (node_2024 == null)
			return;
		printPostOrder_2024(node_2024.left_2024);
		printPostOrder_2024(node_2024.right_2024);
		System.out.print(node_2024.data_2024 + " ");
	}
	void printInOrder_2024(Node_2511532024 node_2024) {
		if (node_2024 == null)
			return;
		printInOrder_2024(node_2024.left_2024);
		System.out.print(node_2024.data_2024 + " ");
		printInOrder_2024(node_2024.right_2024);
	}
	public String print_2024() {
		return this.print_2024("", true, "");
	}
	public String print_2024(String prefix_2024, boolean isTail_2024, String sb_2024) {
		if (right_2024 != null) {
			right_2024.print_2024(prefix_2024 + (isTail_2024 ? "|    " : "    "), false, sb_2024);
		}
		System.out.println( prefix_2024+(isTail_2024 ? "\\-- " : "/-- ") + data_2024);
		if (left_2024 != null) {
			left_2024.print_2024(prefix_2024+(isTail_2024 ? "    " : "|    "), true, sb_2024);
		}
		return sb_2024;
	}
}

