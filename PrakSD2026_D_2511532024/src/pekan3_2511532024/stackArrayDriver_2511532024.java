package pekan3_2511532024;

public class stackArrayDriver_2511532024 {

	public static void main(String[] args) {
		stackArray_2511532024 s = new stackArray_2511532024();
		s.push_2024(10);
		s.push_2024(20);
		s.push_2024(30);
		System.out.println(s.pop_2024() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : " + s.peek_2024());
		System.out.print("Elemen pada stack     :");
		s.print_2024();
	}

}
