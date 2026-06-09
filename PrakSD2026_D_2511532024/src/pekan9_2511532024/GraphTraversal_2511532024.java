package pekan9_2511532024;

import java.util.*;

public class GraphTraversal_2511532024 {
	private Map<String, List<String>> graph_2024 = new HashMap<>();
	
	// menambahkan edge (graf tak berarah)
	public void addEdge_2024(String node1, String node2) {
		graph_2024.putIfAbsent(node1, new ArrayList<>());
		graph_2024.putIfAbsent(node2, new ArrayList<>());
		graph_2024.get(node1).add(node2);
		graph_2024.get(node2).add(node1);
	}
	// menampilkan graf awal
	public void printGraph_2024() {
		System.out.println("Graf Awal (Adjacency List): ");
		for (String node_2024 : graph_2024.keySet()) {
			System.out.print(node_2024 + " -> ");
			List<String> neighbors_2024 = graph_2024.get(node_2024);
			System.out.println(String.join(", ", neighbors_2024));
		}
		System.out.println();
	}
	
	//DFS rekursif
	public void dfs_2024(String start_2024) {
		Set<String> visited_2024 = new HashSet<>();
		System.out.println("Penelusuran DFS: ");
		dfsHelper_2024(start_2024, visited_2024);
		System.out.println();
	}
	private void dfsHelper_2024(String current_2024, Set<String> visited_2024) {
		if(visited_2024.contains(current_2024))
			return;
		visited_2024.add(current_2024);
		System.out.print(current_2024 + " ");
		for (String neighbor_2024 : graph_2024.getOrDefault(current_2024, new ArrayList<>())) {
			dfsHelper_2024(neighbor_2024, visited_2024);
		}
	}
	
	// BFS iteratif
	public void bfs_2024(String start_2024) {
		Set<String> visited_2024 = new HashSet<>();
		Queue<String> queue_2024 = new LinkedList<>();
		queue_2024.add(start_2024);
		visited_2024.add(start_2024);
		System.out.println("Penelusuran BFS: ");
		while (!queue_2024.isEmpty()) {
			String current_2024 = queue_2024.poll();
			System.out.print(current_2024 + " ");
			for (String neighbor_2024 : graph_2024.getOrDefault(current_2024, new ArrayList<>())) {
				if(!visited_2024.contains(neighbor_2024)) {
					queue_2024.add(neighbor_2024);
					visited_2024.add(neighbor_2024);
				}
			}
		}
		System.out.println();
	}
	// main
	public static void main(String[] args) {
		GraphTraversal_2511532024 graph_2024 = new GraphTraversal_2511532024();
		
		// contoh graf: A-B, A-C, B-D, B-E
		graph_2024.addEdge_2024("A", "B");
		graph_2024.addEdge_2024("A", "C");
		graph_2024.addEdge_2024("B", "D");
		graph_2024.addEdge_2024("B", "E");
		// cetak garf awal
		System.out.println("Graf Awal adalah: ");
		graph_2024.printGraph_2024();
		//lakukan penelusuran
		graph_2024.dfs_2024("A");
		graph_2024.bfs_2024("A");
	}
}
