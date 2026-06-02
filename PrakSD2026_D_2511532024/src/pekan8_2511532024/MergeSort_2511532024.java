package pekan8_2511532024;

public class MergeSort_2511532024 {
	void merge_2024(int arr[], int l_2024, int m_2024, int r_2024 ) {
		// find sizes of two subarrays to be merged
		int n1_2024 = m_2024 - l_2024 + 1;
		int n2_2024 = r_2024 - m_2024;
		/* create temp array */
		int L_2024[] = new int[n1_2024];
		int R_2024[] = new int[n2_2024];
		/* copy data to temp */
		for (int i_2024 = 0; i_2024 < n1_2024; ++i_2024) 
			L_2024[i_2024] = arr[l_2024 + i_2024];
		for (int j_2024 = 0; j_2024 < n2_2024; ++j_2024 ) 
			R_2024[j_2024] = arr[m_2024 + 1 + j_2024];
		int i_2024 = 0, j_2024 = 0;
		// initial index of merged subarray array
		int k_2024 = l_2024;
		while (i_2024 < n1_2024 && j_2024 < n2_2024) {
			if(L_2024[i_2024] <= R_2024[j_2024]) {
				arr[k_2024] = L_2024[i_2024];
				i_2024++;
			} else {
				arr[k_2024] = R_2024[j_2024];
				j_2024++;
			}
			k_2024++;
		}
		/* copy remaining elements of L[] if any */
		while (i_2024 < n1_2024) {
			arr[k_2024] = L_2024[i_2024];
			i_2024++;
			k_2024++;
		}
		/* copy remaining elements of R[] if any */
		while (j_2024 < n2_2024) {
			arr[k_2024] = R_2024[j_2024];
			j_2024++;
			k_2024++;
		}
	}
	
	void sort_2024 (int arr[], int l_2024, int r_2024) {
		if (l_2024 < r_2024) {
			// find the middle point
			int m_2024 = (l_2024 + r_2024) / 2;
			// sort first and second halves
			sort_2024(arr, l_2024, m_2024);
			sort_2024(arr, m_2024 + 1, r_2024);
			// merge the sorted halves
			merge_2024(arr, l_2024, m_2024, r_2024);
		}
	}
	/* A utility function to print array of size n */
	static void printArray_2024(int arr[]) {
		int n_2024 = arr.length;
		for(int i_2024 = 0; i_2024 < n_2024; ++i_2024) 
			System.out.print(arr[i_2024] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.print("Sebelum terurut: ");
		printArray_2024(arr);
		MergeSort_2511532024 ob = new MergeSort_2511532024();
		ob.sort_2024(arr, 0, arr.length - 1);
		System.out.print("Sesudah Terurut menggunakan merge sort: ");
		printArray_2024(arr);
	}
}

