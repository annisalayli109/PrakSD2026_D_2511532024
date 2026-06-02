package pekan8_2511532024;

public class ShellSort_2511532024 {
	
	public static void ShellSort_2511532024(int[] A) {
		int n_2024 = A.length;
		int gap_2024 = n_2024 / 2;
		while (gap_2024 > 0) {
			for (int i_2024 = gap_2024; i_2024 < n_2024; i_2024++) {
				int temp_2024 = A[i_2024];
				int j_2024 = i_2024;
				while (j_2024 >= gap_2024 && A[j_2024 - gap_2024] > temp_2024) {
					A[j_2024] = A[j_2024 - gap_2024];
					j_2024 = j_2024 - gap_2024;
				}
				A[j_2024] = temp_2024;
			}
			gap_2024 = gap_2024 / 2;
		}
	}
	
	public static void main(String[] args) {
		int[] data = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray(data);
		
		ShellSort_2511532024(data);
		
		System.out.print("\nSesudah (Shell Sort): ");
		printArray(data);
	}
	
	public static void printArray(int[] arr) {
		for (int i_2024 : arr) System.out.print(i_2024 + " ");	
	}
}
