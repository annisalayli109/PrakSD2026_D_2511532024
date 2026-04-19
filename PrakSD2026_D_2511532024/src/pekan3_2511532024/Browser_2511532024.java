package pekan3_2511532024;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532024 {

	public static void main(String[] args) {
		Stack<Website_2511532024> history = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511532024 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("\nMasukkan Judul: ");
                    String judul = sc.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = sc.nextLine();

                    history.push(new Website_2511532024(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (history.isEmpty()) {
                        System.out.println("\nTidak ada halaman untuk kembali.");
                    } else {
                        Website_2511532024 removed = history.pop();
                        System.out.println("\nKembali dari halaman:");
                        System.out.println(removed.getJudul_2024());
                    }
                    break;

                case 3:
                    if (history.isEmpty()) {
                        System.out.println("\nTidak ada halaman aktif.");
                    } else {
                        System.out.println("\nHalaman saat ini:");
                        System.out.println(history.peek());
                    }
                    break;

                case 4:
                    System.out.println("\nJumlah history: " + history.size());
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("History tidak kosong.");
                    }
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
