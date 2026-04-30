package pekan4_2511532024;

import java.util.Scanner;

public class AntrianLoket_2511532024 {

	public static void main(String[] args) {
		Scanner sc_2024 = new Scanner(System.in);
		Queue_2511532024 q_2024 = new Queue_2511532024(100);
		int pilih_2024;
		
		do {
			System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
			System.out.println("1. Tambah Antrian");
			System.out.println("2. Hapus Antrian");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Reverse");
			System.out.println("5. Keluar");
			System.out.print("Pilih menu: ");
			pilih_2024 = sc_2024.nextInt();
			sc_2024.nextLine();
			
			switch (pilih_2024) {
				case 1:
					System.out.print("\nMasukkan nama pelanggan: ");
					String nama_2024 = sc_2024.nextLine();
					q_2024.enqueue_2024(nama_2024);
					break;
					
				case 2:
					String hapus_2024 = q_2024.dequeue_2024();
					if (hapus_2024 == null) {
						System.out.println("\nAntrian kosong.");
					} else {
						System.out.println();
						System.out.println(hapus_2024 + " telah dilayani");
					}
					break;
					
				case 3:
					q_2024.display_2024();
					break;
					
				case 4:
					q_2024.reverse_2024();
					q_2024.display_2024();
					break;
					
				case 5:
					System.out.println("\nProgram selesai");
					break;
					
				default:
					System.out.println("\nPilihan tidak valid.");
			}
		} while (pilih_2024 != 5);
		
		sc_2024.close();
	}
}