package pekan7_2511532024;

public class Mahasiswa_2511532024 {
	private String nama_2024;
	private String nim_2024;
	private String prodi_2024;
	
	public Mahasiswa_2511532024(String nama_2024, String nim_2024, String prodi_2024) {
        this.nama_2024 = nama_2024;
        this.nim_2024 = nim_2024;
        this.prodi_2024 = prodi_2024;
    }
	
	public String getNama_2024() {
        return nama_2024;
    }

    public String getNim_2024() {
        return nim_2024;
    }

    public String getProdi_2024() {
        return prodi_2024;
    }
    
    public void setNama_2024(String nama_2024) {
        this.nama_2024 = nama_2024;
    }

    public void setNim_2024(String nim_2024) {
        this.nim_2024 = nim_2024;
    }

    public void setProdi_2024(String prodi_2024) {
        this.prodi_2024 = prodi_2024;
    }

    @Override
    public String toString() {
        return nama_2024;
    }
}
