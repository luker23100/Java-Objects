class Student {
	String imie;
	String nazwisko;
	int wiek;
	String email;
	int index;

	public Student(String imie, String nazwisko, int wiek, String email, int index) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.email = email;
		this.index = index;
	}

	public Student(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public void danePodstawowe() {
		System.out.println("Imie: " + imie);
		System.out.println("Nazwisko: " + nazwisko);
	}

	public void kompletDanych() {
		System.out.println("Imie: " + imie);
		System.out.println("Nazwisko: " + nazwisko);
		System.out.println("Wiek: " + wiek + " lat");
		System.out.println("Email: " + email);
		System.out.println("Index: " + index);
	}
}

public class Main {

	public static void main(String[] args) {

		System.out.println(sumuj(5, 4, 5, 3, 2, 4, 6, 67, 34, -5));
		System.out.println();

		Student studentPodstawowy = new Student("Jan", "Nowak");
		studentPodstawowy.danePodstawowe();
		System.out.println("===================");
		Student studentRozszerzony = new Student("Marcin", "Kowalski", 43, "marcinK@gmail.com", 5);
		studentRozszerzony.kompletDanych();

	}

	public static int sumuj(int... liczby) {
		int wynik = 0;
		for (int i : liczby)
			wynik += i;
		return wynik;
	}
}
