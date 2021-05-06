public class Osoba {
	String imie;
	String nazwisko;
	Osoba[] potomkowie;
	
	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		potomkowie = new Osoba[0];
	}
	
	public Osoba(String imie, String nazwisko, Osoba[] potomkowie) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.potomkowie = potomkowie;
	}
}
