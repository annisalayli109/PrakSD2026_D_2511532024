package pekan8_2511532024;

public class QuickSort_2511532024 {
	static void swap_2024(int[] arr, int i_2024, int j_2024) {
		int temp_2024 = arr[i_2024];
		arr[i_2024] = arr[j_2024];
		arr[j_2024] = temp_2024;
	}
	// metode tambahan untuk mengatur pivot menggunakan median of three
	static void medianOfThree_2024(int[] arr, int low_2024, int high_2024) {
		int mid_2024 = low_2024 + (high_2024 - low_2024) / 2;
		
		// urutkan elemen low, mid, dan high
		if (arr[low_2024] > arr[mid_2024]) {
			swap_2024(arr, low_2024, mid_2024);
		}
		if (arr[low_2024] > arr[high_2024]) {
			swap_2024(arr, low_2024, high_2024);
		}
		if (arr[mid_2024] > arr[high_2024]) {
			swap_2024(arr, mid_2024, high_2024);
		}
		swap_2024(arr, mid_2024, high_2024);
	}
	static int partition_2024(int[] arr, int low_2024, int high_2024) {
		// panggil fungsi medionOfThree sebelum menentukan pivot
		medianOfThree_2024(arr, low_2024, high_2024);
		
		int pivot_2024 = arr[high_2024]; // sekarang arr[high sudah berisi nilai median
		int i_2024 = (low_2024 - 1);
		
		for (int j_2024 = low_2024; j_2024 <= high_2024 - 1; j_2024++) {
			// jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr[j_2024] < pivot_2024) {
				// increment indeks elemen yang lebih kecil
				i_2024++;
				swap_2024(arr, i_2024, j_2024);
			}
		}
		swap_2024 (arr, i_2024 + 1, high_2024);
		return (i_2024 + 1);
	}
	
	static void QuickSort_2511532024 (int[] arr, int low_2024, int high_2024) {
		if (low_2024 < high_2024) {
			int pi_2024 = partition_2024(arr, low_2024, high_2024);
			QuickSort_2511532024(arr, low_2024, pi_2024 - 1);
			QuickSort_2511532024(arr, pi_2024 + 1, high_2024);
		}
	}
	
	public static void printArr_2024(int[] arr) {
		for (int i_2024 = 0; i_2024 < arr.length; i_2024++) {
			System.out.print(arr[i_2024] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int N_2024 = arr.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2024(arr);
		
		QuickSort_2511532024(arr, 0, N_2024 - 1);
		
		System.out.print("Data Terurut QuickSort: ");
		printArr_2024(arr);
	}
}

























