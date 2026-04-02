package pekan1_2511532024;

public final class Mobil_2511532024{
	private String nama;
	private int tahun;
	private int cc;
	private double harga;
	private String merk;
	
	// --- Validator ---
	public static boolean isValid(String nama, int tahun, int cc, double harga, String merk) {
		return (nama != null && !nama.isEmpty())
				&& (tahun > 1900)
				&& (cc > 0)
				&& (harga >= 0)
				&& (merk != null && !merk.isEmpty());
	}
	
	// --- Konstruktor ---
	public Mobil_2511532024(String nama, int tahun, int cc, double harga, String merk) {
		this.nama = nama;
		this.tahun = tahun;
		this.cc = cc;
		this.harga = harga;
		this.merk = merk;
	}
	
	// --- Selektor ---
	public String getNama() { return nama; }
	public int getTahun() { return tahun; }
	public int getCc() { return cc; }
	public double getHarga() { return harga; }
	public String getMerk() { return merk; }
	
	// --- Mutator ---
	public void setNama(String nama) { this.nama = nama; }
	public void setTahun(int tahun) { this.tahun = tahun; }
	public void setCc(int cc) { this.cc = cc; }
	public void setHarga(double harga) { this.harga = harga; }
	public void setMerk(String merk) { this.merk = merk; }
	
	// --- Tambah Mobil ---
	public static int tambahMobil(Mobil_2511532024[] arr, int size, Mobil_2511532024 m) {
		if (size < arr.length) {
			arr[size] = m;
			return size + 1;
		} else {
			System.out.println("Array penuh!");
			return size;
		}
	}
	
	// --- Hapus Mobil ---
	public static int hapusMobil(Mobil_2511532024[] arr, int size, String nama) {
		for (int i = 0; i < size; i++) {
			if (arr[i].getNama().equalsIgnoreCase(nama)) {
				for (int j = i; j < size - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[size - 1] = null;
				return size - 1;
			}
		}
		return size;
	}
	
	// --- Output ---
	public String toString() {
		return String.format("%s %d %dcc Rp%.0f %s", nama, tahun, cc, harga, merk);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}