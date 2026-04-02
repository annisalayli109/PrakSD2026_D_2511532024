package pekan1_2511532024;

public class MobilDriver_2511532024 {

	public static void tampilkanData(Mobil_2511532024[] arr, int size) {
		System.out.println("===========================================");
		System.out.println("  Nama  |Tahun |  CC  |  Harga  |  Merk");
		System.out.println("===========================================");
		
		for (int i = 0; i < size; i++) {
			System.out.println(
					arr[i].getNama() + " | " +
					arr[i].getTahun() + " | " +
					arr[i].getCc() + " | Rp" +
					arr[i].getHarga() + " | " +
					arr[i].getMerk()
			);
		}
		
		System.out.println("===========================================");
	}
	
	public static void main(String[] args) {
		
		Mobil_2511532024[] daftar = new Mobil_2511532024[10];
		int size = 0;
		
		Mobil_2511532024 m1 = new Mobil_2511532024("911 GT3", 2022, 3996, 2500000000.0, "Porsche");
		Mobil_2511532024 m2 = new Mobil_2511532024("488 GTB", 2022, 3900, 5000000000.0, "Ferrari");
		
		// tambah
		size = Mobil_2511532024.tambahMobil(daftar, size, m1);
		size = Mobil_2511532024.tambahMobil(daftar, size, m2);
		
		System.out.println("\n=== DAFTAR MOBIL ===");
		tampilkanData(daftar, size);
		
		// update
		daftar[0].setHarga(2600000000.0);
		
		System.out.println("\n=== SETELAH UPDATE ===");
		tampilkanData(daftar, size);
		
		// hapus
		size = Mobil_2511532024.hapusMobil(daftar, size, "488 GTB");
		
		System.out.println("\n=== SETELAH HAPUS ===");
		tampilkanData(daftar, size);
	}
	
}