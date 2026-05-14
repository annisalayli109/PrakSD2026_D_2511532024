package pekan6_2511532024;

public class Lagu_2511532024 {
	// kelas lagu
	String judul_2024;
	String penyanyi_2024;
	Lagu_2511532024 next_2024;
	Lagu_2511532024 prev_2024;
	
	// konstruktor
	public Lagu_2511532024(String judul_2024, String penyanyi_2024) {
		this.judul_2024 = judul_2024;
		this.penyanyi_2024 = penyanyi_2024;
		this.next_2024 = null;
		this.prev_2024 = null;
	}
}
