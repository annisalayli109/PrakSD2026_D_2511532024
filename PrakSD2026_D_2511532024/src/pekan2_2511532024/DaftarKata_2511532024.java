package pekan2_2511532024;

import java.util.ArrayList;

public class DaftarKata_2511532024 {
	private final ArrayList<String> data;
	// Konstruktor: inisialisasi list kosong
	public DaftarKata_2511532024() {
		this.data = new ArrayList<>();
	}
	 /** menambahkan elemen di akhir list */
	public void tambah(String elemen) {
		data.add(elemen);
	}
	 /** menambahkan elemen pada indeks tertentu (menyisipkan). */
	public void tambahPada(int index, String elemen) {
		data.add(index, elemen);
	}
	 /**
	  * mengubah elemen pada posisi 'index' menjadi 'nilaibaru'
	  * bertindak sebagai "setter" untuk elemen tertentu.
	  */
	public void ubahElemen(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	 /** 
	  * menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus
	  */
	public String hapusElemen(int index) {
		return data.remove(index);
	}
	 /**
	  * melakukan iterasi dan mencetak setiap elemen dalam format: [index] nilai
	  * (metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi)
	  */
	public void interasiCetak() {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i)+" ");
		}
	}
	
	 /** mengambil elemen berdasarkan indeks. */
	public String get(int index) {
		return data.get(index);
	}
	
	// Representasi string agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}
	
}
