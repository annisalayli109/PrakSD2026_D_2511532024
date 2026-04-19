package pekan2_2511532024;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532024 {

	public static void main(String[] args) {
		ArrayList<Musik_2511532024> playlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int pilihan;
		
		do {
			System.out.println("\n=== Playlist Musik NIM: 2511532024 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Lihat Playlist");
			System.out.println("3. Hapus Lagu");
			System.out.println("4. Check Jumlah Lagu");
			System.out.println("5. Keluar");
			System.out.print("Pilihan: ");
			pilihan = sc.nextInt();
			sc.nextLine();
			
			switch (pilihan) {
				case 1:
					System.out.print("\nMasukkan Judul          : ");
					String judul = sc.nextLine();
					
					System.out.print("Masukkan Penyanyi       : ");
					String penyanyi = sc.nextLine();
					
					System.out.print("Masukkan Durasi (detik) : ");
					int durasi = sc.nextInt();
					sc.nextLine();
					
					playlist.add(new Musik_2511532024(judul, penyanyi, durasi));
					System.out.println("Data berhasil ditambahkan!");
					break;
					
				case 2:
					if(playlist.isEmpty()) {
						System.out.println("\nPlaylist kosonng.");
					} else {
						System.out.println("\nDaftar Lagu:");
						for (int i = 0; i < playlist.size(); i++) {
							System.out.println((i + 1) + ". " + playlist.get(i));
						}
					}
					break;
					
				case 3:
					if (playlist.isEmpty()) {
						System.out.println("\nPlaylist Kosong.");
					} else {
						System.out.print("\nMasukkan nomor lagu yang ingin dihapus: ");
						int index = sc.nextInt();
						sc.nextLine();
						
						if (index > 0 && index <= playlist.size()) {
							playlist.remove(index - 1);
							System.out.println("Lagu berhasil dihapus.");
						} else {
							System.out.println("Nomor tidak valid.");
						}
					}
					break;
					
				case 4:
					System.out.println("\nJumlah lagu dalam playlist: " + playlist.size());
					break;
					
				case 5:
					System.out.println("\nKeluar dari program.");
					break;
					
				default:
					System.out.println("\nPilihan tidak valid.");
			}
			
		} while (pilihan != 5);
		
		sc.close();

	}
}
