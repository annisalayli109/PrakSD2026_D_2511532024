package pekan2_2511532024;

public class DaftarKataDriver_2511532024 {

	public static void main(String[] args) {
		DaftarKata_2511532024 al = new DaftarKata_2511532024();
		
		// menambah elemen (akhir)
		al.tambah("Kami");
		al.tambah("Informatika");
		
		// menyisipkan elemen pada indeks 1
		al.tambahPada(1, "Mahasiswa");
		
		// cetak isi awal
		System.out.println("Awal          : " + al);
		
		// mengubah elemen (indeks 1)
		al.ubahElemen(1, "Departemen");
		System.out.println("Setelah Ubah  : " + al);
		
		// menghapus elemen (hapus indeks 0)
		String terhapus = al.hapusElemen(0);
		System.out.println("Terhapus      : " + terhapus);
		System.out.println("Setelah Hapus : " + al);
		
		// iterasi pada arraylist (cetak setiap elemen)
		System.out.print("Interasi      : ");
		al.interasiCetak();
		System.out.println();
	}

}
