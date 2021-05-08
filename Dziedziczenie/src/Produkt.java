
public class Produkt {
	String nazwa;
	double cena;

	public Produkt(String nazwa, double cena) {
		this.nazwa = nazwa;
		this.cena = cena;
	}

}

class Kwiat extends Produkt {
	private String rodzaj;

	public Kwiat(String nazwa, double cena, String rodzaj) {
		super(nazwa, cena);
		this.rodzaj = rodzaj;
	}

	public String toString() {
		return nazwa + "\n" + "Cena: " + cena + " z³" + "\n" + "Rodzaj: " + rodzaj;
	}
}

class Nawoz extends Produkt {
	private String przeznaczenie;

	public Nawoz(String nazwa, double cena, String przeznaczenie) {
		super(nazwa, cena);
		this.przeznaczenie = przeznaczenie;
	}

	public String toString() {
		return nazwa + "\n" + "Cena: " + cena + " z³" + "\n" + "Przeznaczenie: " + przeznaczenie;
	}

}

class StrojRoboczy extends Produkt {
	private char rozmiar;

	public StrojRoboczy(String nazwa, double cena, char rozmiar) {
		super(nazwa, cena);
		this.rozmiar = rozmiar;
	}

	public String toString() {
		return nazwa + "\n" + "Cena: " + cena + " z³" + "\n" + "Rozmiar: " + rozmiar;
	}
}
