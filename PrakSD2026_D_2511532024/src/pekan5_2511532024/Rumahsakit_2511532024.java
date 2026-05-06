package pekan5_2511532024;

import java.util.Scanner;

public class Rumahsakit_2511532024 {
	static Pasien_2511532024 head_2024 = null;
	static int counter_2024 = 0;
	
	// insert (daftar pasien)
	public static void insertPasien_2024(String nama_2024, String penyakit_2024) {
		counter_2024++;
		Pasien_2511532024 newNode_2024 = new Pasien_2511532024(nama_2024, penyakit_2024, counter_2024);
		
		if (head_2024 == null) {
			head_2024 = newNode_2024;
		} else {
			Pasien_2511532024 temp_2024 = head_2024;
			while (temp_2024.next_2024 != null) {
				temp_2024 = temp_2024.next_2024;
			}
			temp_2024.next_2024 = newNode_2024;
		}
		
		System.out.println("Pasien berhasil ditambahkan! Nomor Antrian: " + counter_2024);
	}
	
	// delete head (panggil pasien)
	public static void panggilPasien_2024() {
		if (head_2024 == null) {
			System.out.println("Antrian kosong!");
			return;
		}
		
		System.out.println("Memanggil pasien: " + head_2024.namaPasien_2024 + 
				" (" + head_2024.penyakit_2024 + ")");
		head_2024 = head_2024.next_2024;
	}
	
	// display
	public static void tampilkanAntrian_2024() {
		if (head_2024 == null) {
			System.out.println("Antrian kosong!");
			return;
		}
		
		Pasien_2511532024 temp_2024 = head_2024;
		while (temp_2024 != null) {
			System.out.println("No: " + temp_2024.nomorAntrian_2024 + 
					" | Nama: " + temp_2024.namaPasien_2024 +
					" | Keluhan: " + temp_2024.penyakit_2024);
			temp_2024 = temp_2024.next_2024;
		}
	}
	
	// search (case insensitive)
	public static void cariPasien_2024(String nama_2024) {
		Pasien_2511532024 temp_2024 = head_2024;
		boolean ditemukan = false;
		
		while (temp_2024 != null) {
			if (temp_2024.namaPasien_2024.equalsIgnoreCase(nama_2024)) {
				System.out.println("Pasien ditemukan: ");
				System.out.println("No: " + temp_2024.nomorAntrian_2024 +
						" | Nama: " + temp_2024.namaPasien_2024 + 
						" | Keluhan: " + temp_2024.penyakit_2024);
				ditemukan = true;
				break;
			}
			temp_2024 = temp_2024.next_2024;
		}
		
		if (!ditemukan) {
			System.out.println("Pasien tidak ditemukan.");
		}
	}
	
	// Status Antrian
	public static void statusAntrian_2024() {
		if (head_2024 == null) {
			System.out.println("Antrian kosong!");
			return;
		}
		
		int jumlah_2024 = 0;
		Pasien_2511532024 temp_2024 = head_2024;
		
		while (temp_2024 != null) {
			jumlah_2024++;
			temp_2024 = temp_2024.next_2024;
		}
		
		System.out.println("jumlah pasien: " + jumlah_2024);
		System.out.println("Pasien terdepan: " + head_2024.namaPasien_2024);
	}
	
	// main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pilihan_2024;
		
		do {
			System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532024 ===");
			System.out.println("1. Daftarkan Pasien (Insert)");
			System.out.println("2. Panggil Pasien (Delete Head)");
			System.out.println("3. Tampilkan Antrian (Display)");
			System.out.println("4. Cari Pasien (Search)");
			System.out.println("5. Cek Status Antrian");
			System.out.println("6. Keluar");
			System.out.print("\nPilihan : ");
			pilihan_2024 = sc.nextInt();
			sc.nextLine();
			
			switch (pilihan_2024) {
				case 1:
					System.out.print("\nMasukkan nama pasien: ");
					String nama_2024 = sc.nextLine();
					System.out.print("Masukkan keluhan: ");
					String keluhan_2024 = sc.nextLine();
					insertPasien_2024(nama_2024, keluhan_2024);
					break;
					
				case 2:
					panggilPasien_2024();
					break;
					
				case 3:
					tampilkanAntrian_2024();
					break;
					
				case 4:
					System.out.print("Masukkan nama yang dicari: ");
					String cari_2024 = sc.nextLine();
					cariPasien_2024(cari_2024);
					break;
					
				case 5:
					statusAntrian_2024();
					break;
					
				case 6:
					System.out.println("Terima kasih.");
					break;
					
				default:
					System.out.println("Pilihan tidak valid.");
			}
			
		} while (pilihan_2024 != 6);
	}
	
}