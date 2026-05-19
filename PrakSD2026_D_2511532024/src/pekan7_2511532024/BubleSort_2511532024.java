package pekan7_2511532024;

public class BubleSort_2511532024 {
	public static void bubbleSort_2511532024(int[] arr_2024) {
		int n_2024 = arr_2024.length;
		for (int i_2024 = 0; i_2024 < n_2024; i_2024++) {
			for (int j_2024 = 0; j_2024 < n_2024 - i_2024 - 1; j_2024++) {
				if (arr_2024[j_2024] > arr_2024[j_2024 + 1]) {
					int temp_2024 = arr_2024[j_2024];
					arr_2024[j_2024] = arr_2024[j_2024 + 1];
					arr_2024[j_2024 + 1] = temp_2024;
				// System.out.println("data:" + arr_2024[j_2024] + " " + arr_2024[j_2024 + 1]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr_2024[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2024 = arr_2024.length;
		System.out.print("array yang belum terurut: ");
		for (int i_2024 = 0; i_2024 < n_2024; i_2024++)
			System.out.print(arr_2024[i_2024] + " ");
		System.out.println("");
		bubbleSort_2511532024(arr_2024);
		System.out.print("array yang terurut menggunakan BubleSort: ");
		for (int i_2024 = 0; i_2024 < n_2024; i_2024++)
			System.out.print(arr_2024[i_2024] + " ");
		System.out.println("");
	}
}
