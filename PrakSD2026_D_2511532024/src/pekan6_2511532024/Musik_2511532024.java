package pekan6_2511532024;

import java.util.Scanner;

public class Musik_2511532024 {
	Lagu_2511532024 head_2024;
	Lagu_2511532024 tail_2024;
	
	public void tambahLagu_2024(String judul_2024, String penyanyi_2024) {
		Lagu_2511532024 laguBaru_2024 = new Lagu_2511532024(judul_2024, penyanyi_2024);
		
		// jika playlist kosong
		if (head_2024 == null) {
			head_2024 = laguBaru_2024;
			tail_2024 = laguBaru_2024;
		} else {
			tail_2024.next_2024 = laguBaru_2024;
			laguBaru_2024.prev_2024 = tail_2024;
			tail_2024 = laguBaru_2024;
		}
		System.out.println("Lagu berhasil ditambahkan!");
	}
	
	// menghapus lagu pertama
	public void hapusLaguAwal_2024() {
		if (head_2024 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		System.out.println("Lagu " + head_2024.judul_2024 + " berhasil dihapus.");
		
		// jika hanya ada saru lagu
		if (head_2024 == tail_2024) {
			head_2024 = null;
			tail_2024 = null;
		} else {
			head_2024 = head_2024.next_2024;
			head_2024.prev_2024 = null;
		}
	}
	
	// menampilkan playlist dari awal ke akhir
	public void tampilMaju_2024() {
		if (head_2024 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511532024 current_2024 = head_2024;
		
		System.out.println("\n=== Playlist Maju ===");
		while (current_2024 != null) {
			System.out.println("Judul    : " + current_2024.judul_2024);
			System.out.println("Penyanyi : " + current_2024.penyanyi_2024);
			System.out.println();
			current_2024 = current_2024.next_2024;
		}
	}
	
	// menampilkan playlist dari akhir ke awal
	public void tampilMundur_2024() {
		if (tail_2024 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511532024 current_2024 = tail_2024;
		
		System.out.println("\n=== Playlist Mundur ===");
		while (current_2024 != null) {
			System.out.println("Judul    : " + current_2024.judul_2024);
			System.out.println("Penyanyi : " + current_2024.penyanyi_2024);
			System.out.println();
			current_2024 = current_2024.prev_2024;
		}
	}
	
	// mencari lagu berdasarkan judul
	public void cariLagu_2024(String judulCari_2024) {
		if (head_2024 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		Lagu_2511532024 current_2024 = head_2024;
		boolean ditemukan_2024 = false;
		
		while (current_2024 != null) {
			if (current_2024.judul_2024.equalsIgnoreCase(judulCari_2024)) {
				System.out.println("\nLagu ditemukan!");
				System.out.println("Judul    : " + current_2024.judul_2024);
				System.out.println("Penyanyi : " + current_2024.penyanyi_2024);
				ditemukan_2024 = true;
				break;
			}
			current_2024 = current_2024.next_2024;
		}
		
		if (!ditemukan_2024) {
			System.out.println("Lagu tidak ditemukan!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc_2024 = new Scanner(System.in);
		Musik_2511532024 playlist_2024 = new Musik_2511532024();
		int pilihan_2024;
		
		do {
			System.out.println("\n=== Playlist Musik NIM: 2511532024 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari Lagu");
			System.out.println("6. Keluar");
			System.out.print("Pilihan: ");
			pilihan_2024 = sc_2024.nextInt();
			sc_2024.nextLine();
			
			switch (pilihan_2024) {
			case 1:
				System.out.print("Judul: ");
				String judul_2024 = sc_2024.nextLine();
				
				System.out.print("Penyanyi: ");
				String penyanyi_2024 = sc_2024.nextLine();
				
				playlist_2024.tambahLagu_2024(judul_2024, penyanyi_2024);
				break;
				
			case 2:
				playlist_2024.hapusLaguAwal_2024();
				break;
				
			case 3:
				playlist_2024.tampilMaju_2024();
				break;
				
			case 4:
				playlist_2024.tampilMundur_2024();
				break;
				
			case 5:
				System.out.print("Masukkan judul lagu: ");
				String cari_2024 = sc_2024.nextLine();
				playlist_2024.cariLagu_2024(cari_2024);
				break;
				
			case 6:
				System.out.println("Program selesai.");
				break;
				
			default:
				System.out.println("Pilihan tidak valid!");
			}
		} while (pilihan_2024 != 6);
		
		sc_2024.close();
	}
}
