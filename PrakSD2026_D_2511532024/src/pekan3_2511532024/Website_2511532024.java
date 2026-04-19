package pekan3_2511532024;

public class Website_2511532024 {
	private String judul_2024;
	private String url_2024;
	
	// Konstruktor
	public Website_2511532024(String judul, String url) {
		this.judul_2024 = judul;
		this.url_2024 = url;
	}
	
	// Getter
	public String getJudul_2024() {
		return judul_2024;
	}
	
	public String getUrl_2024() {
		return url_2024;
	}
	
	// Setter
	public void setJudul_2024(String judul) {
		this.judul_2024 = judul;
	}
	
	public void setUrl_2024(String url) {
		this.url_2024 = url;
	}
	
	@Override
	public String toString() {
		return "Judul : " + judul_2024 +
				"\nURL : " + url_2024;
	}
	
}
