package pekan5_2511532024;

public class Pasien_2511532024 {
	String namaPasien_2024;
	String penyakit_2024;
	int nomorAntrian_2024;
	Pasien_2511532024 next_2024;
	
	// konstruktor
	public Pasien_2511532024(String namaPasien_2024, String penyakit_2024, int nomorAntrian_2024) {
		this.namaPasien_2024 = namaPasien_2024;
		this.penyakit_2024 = penyakit_2024;
		this.nomorAntrian_2024 = nomorAntrian_2024;
		this.next_2024 = null;
	}
	
	// getter
	public String getNamaPasien_2024() {
		return namaPasien_2024;
	}
	public String getPenyakit_2024() {
		return penyakit_2024;
	}
	public int getNomorAntrian_2024() {
		return nomorAntrian_2024;
	}
	
	// setter
	public void setNext_2024(Pasien_2511532024 next_2024) {
		this.next_2024 = next_2024;
	}
}
