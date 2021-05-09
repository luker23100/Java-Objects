
public class Zabawka {
	private String nazwa;
	private double cena;

	public void ustawNazwe(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void ustawCene(double cena) {
		this.cena = cena;
	}

	public String toString() {
		return "\sNazwa: " + nazwa + "\n\s" + "Cena: " + String.valueOf(cena);
	}
}
