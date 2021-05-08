import java.util.ArrayList;

public class KontoBankowe {
	private String imie;
	private String nazwisko;
	private String login;
	private String haslo;
	private ArrayList<Karta> karty = new ArrayList<>();
	
	public KontoBankowe(String imie, String nazwisko, String login, String haslo) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.login = login;
		this.haslo = haslo;
	}
	
	public void wyswietlKarty() {
		for(Karta k : karty)
			System.out.println(k);
	}
	
	public void dodajKarte(String nazwaKarty) {
		karty.add(new Karta(nazwaKarty));
	}
	
	private class Karta {
		private String nrKarty = "";
		String nazwaKarty;
		
		public Karta(String nazwaKarty) {
			this.nazwaKarty = nazwaKarty;
			ustawNumer();
		}
		
		private void ustawNumer() {
			for(int i=0; i<18; i++)
				nrKarty += String.valueOf((int) Math.floor(Math.random()*9)); 
		}

		public String getNrKarty() {
			return nrKarty;
		}

		public String getNazwaKarty() {
			return nazwaKarty;
		}
		
		public String toString() {
			return "Nazwa Karty: " + nazwaKarty + "\n" + "Numer Karty: " + nrKarty;
		}
		
	}
}
