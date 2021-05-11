package sklepInternetowy;

import java.util.ArrayList;
import java.util.Scanner;

public class SklepInternetowy {
	Scanner skaner = new Scanner(System.in, "UTF-8");
	ArrayList<Produkt> produkty = new ArrayList<>();
	
	public SklepInternetowy() {
		gui();
	}
	
	private void gui() {
		System.out.println("------ Sklep z napojami ------");
		String[] opcje = {"[1] Dodaj mleko", "[2] Dodaj owoc", "[3] Dodaj Ksiazke", "[4] Dodaj Buty", "[5] wyswietl sklep", "[6] wyjscie"};
		
		for(String s : opcje)
			System.out.println("\s" + s);
		
		metody(wybor());
	}
	
	private int wybor() {
		int wybor = 0;
		while(wybor < 1 || wybor > 6) {
			try {
				System.out.print("Wybierz opcje: ");
				wybor = Integer.parseInt(skaner.nextLine());
			} catch(Exception e) {}
		}
		return wybor;
	}
	
	private void metody(int wybor) {
		String nazwa = null;
		double cena = 0;
		int ilosc = 0;
		String dataPrzydatnosci = null;
		
		if(wybor < 5) {
			System.out.print("Podaj nazwe: ");
			nazwa = skaner.nextLine();
			System.out.print("Podaj cene: ");
			cena = skaner.nextDouble();
			skaner.nextLine();
			System.out.print("Podaj ilosc: ");
			ilosc = skaner.nextInt();
			skaner.nextLine();
		}
		
		if(wybor < 3) {
			System.out.print("Podaj date przydatnosci: ");
			dataPrzydatnosci = skaner.nextLine();
		}
		
		switch(wybor) {
		case 1 -> {
			double zawartoscBialka;
			System.out.print("Podaj zawartosc bialka: ");
			zawartoscBialka = skaner.nextDouble();
			skaner.nextLine();
			
			produkty.add(new Mleko(nazwa, cena, ilosc, dataPrzydatnosci, zawartoscBialka));
		}
		case 2 -> {
			String rodzaj;
			System.out.print("Podaj rodzaj: ");
			rodzaj = skaner.nextLine();
			
			produkty.add(new Owoce(nazwa, cena, ilosc, dataPrzydatnosci, rodzaj));
		}
		case 3 -> produkty.add(new Ksiazka(nazwa, cena, ilosc));
		case 4 -> produkty.add(new Buty(nazwa, cena, ilosc));
		case 5 -> {
			System.out.println("Produkty: ");
			for(Produkt p : produkty) {
				System.out.println(p + "\n---------------\n");
			}
		}
		case 6 -> skaner.close();
		}
		
		if(wybor != 6)
			gui();
	}
}
