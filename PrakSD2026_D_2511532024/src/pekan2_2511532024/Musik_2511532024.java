package pekan2_2511532024;

public class Musik_2511532024 {
	private String judul_2024;
	private String penyanyi_2024;
	private int durasi_2024;
	
	// Konstruktor
	public Musik_2511532024(String judul, String penyanyi, int durasi) {
		this.judul_2024 = judul;
		this.penyanyi_2024 = penyanyi;
		this.durasi_2024 = durasi;
	}
	
	// Getter
	public String getJudul_2024() {
		return judul_2024;
	}
	
	public String getPenyanyi_2024() {
		return penyanyi_2024;
	}
	
	public int getDurasi_2024() {
		return durasi_2024;
	}
	
	// Setter
	public void setJudul_2024(String judul) {
		this.judul_2024 = judul;
	}

	public void setPenyanyi_2024(String penyanyi) {
		this.penyanyi_2024 = penyanyi;
	}
	
	public void setDurasi_2024(int durasi) {
		this.durasi_2024 = durasi;
	}
	
	@Override
	public String toString() {
		return "Judul    : " + judul_2024 +
				"\n   Penyanyi : " + penyanyi_2024 +
				"\n   Durasi   : " + durasi_2024 + " detik";
	}
	
}
