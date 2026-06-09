package pekan9_2511532024;

public class BTree_2511532024 {
	private Node_2511532024 root_2024;
	private Node_2511532024 currentNode_2024;
	public BTree_2511532024() {
		root_2024 = null;
	}
	public boolean search_2024(int data_2024) {
		return search_2024(root_2024, data_2024);
	}
	private boolean search_2024(Node_2511532024 node_2024, int data_2024) {
		if (node_2024.getData_2024() == data_2024)
			return true;
		if (node_2024.getLeft_2024() != null)
			if (search_2024(node_2024.getLeft_2024(), data_2024))
				return true;
		if (node_2024.getRight_2024() != null)
			if (search_2024(node_2024.getRight_2024(), data_2024))
				return true;
		return false;
	}
	public void printInOrder_2024() {
		root_2024.printInOrder_2024(root_2024);
	}
	public void printPreOrder_2024() {
		root_2024.printPreOrder_2024(root_2024);
	}
	public void printPostOrder_2024() {
		root_2024.printPostOrder_2024(root_2024);
	}
	
	public Node_2511532024 getRoot_2024() {
		return root_2024;
	}
	public boolean isEmpty_2024() {
		return root_2024 == null;
	}
	
	public int countNodes_2024() {
		return countNodes_2024(root_2024);
	}
	
	private int countNodes_2024(Node_2511532024 node_2024) {
		int count_2024 = 1;
		if (node_2024 == null) {
			return 0;
		} else {
			count_2024 += countNodes_2024(node_2024.getLeft_2024());
			count_2024 += countNodes_2024(node_2024.getRight_2024());
			return count_2024;
		}
	}
	
	public void print_2024() {
		root_2024.print_2024();
	}
	
	public Node_2511532024 getCurrent_2024() {
		return currentNode_2024;
	}
	
	public void setCurrent_2024(Node_2511532024 node_2024) {
		this.currentNode_2024 = node_2024;
	}
	
	public void setRoot_2024(Node_2511532024 root_2024) {
		this.root_2024 = root_2024;
	}
}
