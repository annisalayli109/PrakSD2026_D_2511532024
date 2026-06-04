package pekan8_2511532024;

import java.util.Scanner;

public class Sorting_2511532024 {
	static Lagu_2511532024[] dataLagu_2024 = new Lagu_2511532024[20];
	static int jumlahData_2024 = 0;
	
	static void inputData_2024() {
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"The Man Who Can't Be Moved",
				"The Script",
				241);
		
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"The Apartment We Won't Share",
				"NIKI",
				150);
		
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"Best Friend",
				"Rex Orange County",
				262);
		
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"Needy",
				"Ariana Grande",
				172);
		
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"Hold Me Down",
				"Daniel Caesar",
				231);
		
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"Multo",
				"Cup of Joe",
				238);
		
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"Bags",
				"Clairo",
				261);
		
		dataLagu_2024[jumlahData_2024++] = new Lagu_2511532024(
				"Seasons",
				"wave to earth",
				256);
	}
	
	static void tampilData_2024() {
		for(int i_2024 = 0; i_2024 < jumlahData_2024; i_2024++) {
			System.out.println((i_2024 + 1) + ". " + dataLagu_2024
			[i_2024].judul_2024 + " - " + dataLagu_2024[i_2024].durasi_2024
			+ " detik");
		}
	}
	
	static void shellSort_2024() {
		for(int gap_2024 = jumlahData_2024 / 2; gap_2024 > 0; gap_2024 /= 2) {
			for(int i_2024 = gap_2024; i_2024 < jumlahData_2024; i_2024++) {
				Lagu_2511532024 temp_2024 = dataLagu_2024[i_2024];
				
				int j_2024;
				
				for(j_2024 = i_2024; j_2024 >= gap_2024 && dataLagu_2024
						[j_2024 - gap_2024].judul_2024.compareToIgnoreCase
						(temp_2024.judul_2024) > 0; j_2024 -= gap_2024) {
					
					dataLagu_2024[j_2024] = dataLagu_2024[j_2024 - gap_2024];
				}
				
				dataLagu_2024[j_2024] = temp_2024;
				
			}
		}
	}
	
	static int partition_2024(int low_2024, int high_2024) {
		int pivot_2024 = dataLagu_2024[high_2024].durasi_2024;
		int i_2024 = low_2024 - 1;
		
		for(int j_2024 = low_2024; j_2024 < high_2024; j_2024++) {
			if(dataLagu_2024[j_2024].durasi_2024 < pivot_2024) {
				i_2024++;
				
				Lagu_2511532024 temp_2024 = dataLagu_2024[i_2024];
				dataLagu_2024[i_2024] = dataLagu_2024[j_2024];
				dataLagu_2024[j_2024] = temp_2024;
			}
		}
		
		Lagu_2511532024 temp_2024 = dataLagu_2024[i_2024 + 1];
		dataLagu_2024[i_2024 + 1] = dataLagu_2024[high_2024];
		dataLagu_2024[high_2024] = temp_2024;
		
		return i_2024 + 1;
	}
	
	static void quickSort_2024(int low_2024, int high_2024) {
		if(low_2024 < high_2024) {
			int pi_2024 = partition_2024(low_2024, high_2024);
			
			quickSort_2024(low_2024, pi_2024 - 1);
			quickSort_2024(low_2024 + 1, pi_2024);
		}
	}
	
	static void merge_2024(int left_2024, int mid_2024, int right_2024) {
		int n1_2024 = mid_2024 - left_2024 + 1;
		int n2_2024 = right_2024 - mid_2024;
		
		Lagu_2511532024[] L_2024 = new Lagu_2511532024[n1_2024];
		Lagu_2511532024[] R_2024 = new Lagu_2511532024[n2_2024];
		
		for(int i_2024 = 0; i_2024 < n1_2024; i_2024++) {
			L_2024[i_2024] = dataLagu_2024[left_2024 + i_2024];
		}
		
		for(int j_2024 = 0; j_2024 < n2_2024; j_2024++) {
			R_2024[j_2024] = dataLagu_2024[mid_2024 + 1 + j_2024];
		}
		
		int i_2024 = 0;
		int j_2024 = 0;
		int k_2024 = left_2024;
		
		while(i_2024 < n1_2024 && j_2024 < n2_2024) {
			if(L_2024[i_2024].judul_2024.compareToIgnoreCase(
					R_2024[j_2024].judul_2024) <= 0) {
				
				dataLagu_2024[k_2024++] = L_2024[i_2024++]; 
			} else {
				dataLagu_2024[k_2024++] = R_2024[j_2024++];
			}
		}
		
		while(i_2024 < n1_2024) {
			dataLagu_2024[k_2024++] = L_2024[i_2024++];
		}
		while(j_2024 < n2_2024) {
			dataLagu_2024[k_2024++] = R_2024[j_2024++];
		}
	}

	static void mergeSort_2024(int left_2024, int right_2024) {
		if(left_2024 < right_2024) {
			int mid_2024 = (left_2024 + right_2024) / 2;
			
			mergeSort_2024(left_2024, mid_2024);
			mergeSort_2024(mid_2024 + 1, right_2024);
			merge_2024(left_2024, mid_2024, right_2024);
		}
	}
	
	public static void main(String[] args) {
		Scanner input_2024 = new Scanner(System.in);
		inputData_2024();
		
		System.out.println("=== Sorting Playlist NIM: 2511532024 ===");
		System.out.print("Pilih Algoritma " + "(1=shell, 2=quick, 3=merge): ");
		int pilihan_2024 = input_2024.nextInt();
		System.out.println("\nData Sebelum Sorting: ");
		
		tampilData_2024();
		switch(pilihan_2024) {
			case 1:
				shellSort_2024();
				System.out.println("\nData Seteleh Shell Sort (Judul A-Z): ");
				break;
				
			case 2:
				quickSort_2024(0, jumlahData_2024 - 1);
				System.out.println("\nData Setelah Quick Sort (Durasi Asc): ");
				break;
				
			case 3:
				mergeSort_2024(0, jumlahData_2024 - 1);
				System.out.println("\nData Setelah Merge Sort (Judul A-Z): ");
				break;
				
			default:
				System.out.println("Pilihan tidak valid");
				
			return;	
		}
		
		tampilData_2024();
	}
	
}































