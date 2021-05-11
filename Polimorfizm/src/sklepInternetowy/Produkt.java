package sklepInternetowy;

import java.util.Scanner;

public class Produkt {
	private String nazwa;
	private double cena;
	private int ilosc;
	public Produkt(String nazwa, double cena, int ilosc) {
		this.nazwa = nazwa;
		this.cena = cena;
		this.ilosc = ilosc;
	}
	
	@Override
	public String toString() {
		return " Nazwa: " + nazwa + "\n" + " Cena: " + cena + "z³" + "\n" + " Iloœæ: " + ilosc;
	}
}

class ProduktSpozywczy extends Produkt {
	private String dataPrzydatnosci;

	public ProduktSpozywczy(String nazwa, double cena, int ilosc, String dataPrzydatnosci) {
		super(nazwa, cena, ilosc);
		this.dataPrzydatnosci = dataPrzydatnosci;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + " Data przydatnoœci: " + dataPrzydatnosci;
	}
}

class Mleko extends ProduktSpozywczy {
	private double zawartoscBialka;

	public Mleko(String nazwa, double cena, int ilosc, String dataPrzydatnosci, double zawartoscBialka) {
		super(nazwa, cena, ilosc, dataPrzydatnosci);
		this.zawartoscBialka = zawartoscBialka;
	}
	
	@Override
	public String toString() {
		return "Mleko \n" + super.toString() + "\n" + " Zawartoœæ bia³ka: " + zawartoscBialka + "%";
	}
}

class Owoce extends ProduktSpozywczy {
	private String rodzaj;

	public Owoce(String nazwa, double cena, int ilosc, String dataPrzydatnosci, String rodzaj) {
		super(nazwa, cena, ilosc, dataPrzydatnosci);
		this.rodzaj = rodzaj;
	}
	
	@Override
	public String toString() {
		return "Owoc \n" + super.toString() + "\n" + " Rodzaj: " + rodzaj;
	}
}

class Adres {
	Scanner skaner = new Scanner(System.in, "UTF-8");
	
	private int nrDomu;
	private int nrMieszkania;
	private String miejscowosc;
	private String kodPocztowy;
	private String ulica;
	
	public Adres() {
		ustawOpcje();
	}
	
	private void ustawOpcje() {
		System.out.print("Podaj numer domu: ");
		nrDomu = skaner.nextInt();
		skaner.nextLine();
		System.out.print("Podaj numer mieszkania: ");
		nrMieszkania = skaner.nextInt();
		skaner.nextLine();
		System.out.print("Podaj miejscowosc: ");
		miejscowosc = skaner.nextLine();
		System.out.print("Podaj kod pocztowy: ");
		kodPocztowy = skaner.nextLine();
		System.out.print("Podaj ulice: ");
		ulica = skaner.nextLine();
	}
	
	@Override
	public String toString() {
		return "Adres: " + "\n" + " Numer domu: " + nrDomu + "\n" + " Numer mieszkania: " + nrMieszkania + "\n Miejscowosc: " + miejscowosc
				+ "\n" + " Kod Pocztowy: " + kodPocztowy + "\n" + " Ulica: " + ulica;
	}
}

class Producent extends Adres{
	String nip;
	String nazwa;
	Adres adres;
	
	public Producent() {
		System.out.print("Podaj Nip: ");
		nip = skaner.nextLine();
		System.out.print("Podaj nazwe producenta: ");
		nazwa = skaner.nextLine();
		
	}
	
	@Override
	public String toString() {
		return "Producent: " + "\n" + " NIP: " + nip + "\n" + " Nazwa: " + nazwa + "\n" + super.toString();
	}
}

class Autor extends Adres{
	String imie;
	String nazwisko;
	Adres adres;
	
	public Autor() {
		System.out.print("Podaj imie: ");
		imie = skaner.nextLine();
		System.out.print("Podaj nazwisko: ");
		nazwisko = skaner.nextLine();
		
		//adres = new Adres();
	}
	
	@Override
	public String toString() {
		return "Autor: " + "\n" + " Imie: " + imie + "\n" + " Nazwisko: " + nazwisko + "\n" + super.toString();
	}
}

class Ksiazka extends Produkt {
	Autor autor;

	public Ksiazka(String nazwa, double cena, int ilosc) {
		super(nazwa, cena, ilosc);
		autor = new Autor();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + autor;
	}
}

class Buty extends Produkt {
	Producent producent;

	public Buty(String nazwa, double cena, int ilosc) {
		super(nazwa, cena, ilosc);
		producent = new Producent();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + producent;
	}
}
