package pekan7_2511532024;

public class InsertionSort_2511532024 {
	public static void InsertionSort_2511532024(int[] arr_2024) {
		int n_2024 = arr_2024.length;
		for (int i_2024 = 1; i_2024 < n_2024; i_2024++) {
			int key_2024 = arr_2024[i_2024];
			int j_2024 = i_2024 - 1;
			while (j_2024 >= 0 && arr_2024[j_2024] > key_2024) {
				arr_2024[j_2024 + 1] = arr_2024[j_2024];
				j_2024--;
			}
			arr_2024[j_2024 + 1] = key_2024;
		}
	}
	
	public static void main(String[] args) {
		int arr_2024[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2024 = arr_2024.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_2024 = 0; i_2024 < n_2024; i_2024++) 
			System.out.print(arr_2024[i_2024] + " ");
		System.out.println("");
		InsertionSort_2511532024(arr_2024);
		System.out.printf("array yang terurut:\n");
		for (int i_2024 = 0; i_2024 < n_2024; i_2024++) 
			System.out.print(arr_2024[i_2024] + " ");
		System.out.println("");
			
	}
}
