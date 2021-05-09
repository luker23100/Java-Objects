import java.util.ArrayList;
import java.util.Scanner;

public class Sklep {
	private Scanner skaner = new Scanner(System.in, "UTF-8");
	private ArrayList<Samochod> samochody = new ArrayList<>();
	private ArrayList<Mis> misie = new ArrayList<>();
	private ArrayList<Puzzle> puzzle = new ArrayList<>();
	private ArrayList<Ksiazka> ksiazki = new ArrayList<>();

	public Sklep() {
		gui();
	}

	private void gui() {
		System.out.println("======= Sklep =======");
		String[] opcje = { "[1] Dodaj Samochod", "[2] Dodaj Misia", "[3] Dodaj Puzzle", "[4] Dodaj Ksiazke",
				"[5] Wyswietl produkty", "[6] Wyjscie" };

		for (String s : opcje)
			System.out.println("\s" + s);

		System.out.print("Wybierz opcje: ");
		metody(Integer.parseInt(skaner.nextLine()));
	}

	private void metody(int wybor) {
		String nazwa = null;
		double cena = 0;
		if (wybor < 5) {
			System.out.print("Podaj nazwe: ");
			nazwa = skaner.nextLine();
			System.out.print("Podaj cene: ");
			cena = Double.parseDouble(skaner.nextLine());
		}

		switch (wybor) {
		case 1 -> {
			Samochod samochod = new Samochod();
			samochod.ustawNazwe(nazwa);
			samochod.ustawCene(cena);
			System.out.print("Podaj typ: ");
			samochod.ustawTyp(skaner.nextLine());
			samochody.add(samochod);
		}
		case 2 -> {
			Mis mis = new Mis();
			mis.ustawNazwe(nazwa);
			mis.ustawCene(cena);
			System.out.println("Podaj material: ");
			mis.ustawMaterial(skaner.nextLine());
			misie.add(mis);
		}
		case 3 -> {
			Puzzle puzzle = new Puzzle();
			puzzle.ustawNazwe(nazwa);
			puzzle.ustawCene(cena);
			System.out.println("Podaj liczbe elementow: ");
			puzzle.ustawliczbaElementow(Integer.parseInt(skaner.nextLine()));
			this.puzzle.add(puzzle);
		}
		case 4 -> {
			Ksiazka ksiazka = new Ksiazka();
			ksiazka.ustawNazwe(nazwa);
			ksiazka.ustawCene(cena);
			System.out.println("Podaj liczbe stron: ");
			ksiazka.ustawLiczbeStron(Integer.parseInt(skaner.nextLine()));
			System.out.println("Podaj odpowiedni wiek: ");
			ksiazka.ustawDozwolonyWiek(Integer.parseInt(skaner.nextLine()));
			ksiazki.add(ksiazka);
		}
		case 5 -> {
			System.out.println("--- Samochody ---");
			for (Samochod s : samochody)
				System.out.println(s);

			System.out.println("--- Misie ---");
			for (Mis s : misie)
				System.out.println(s);

			System.out.println("--- Puzzle ---");
			for (Puzzle p : puzzle)
				System.out.println(p);

			System.out.println("--- Ksiazki --- ");
			for (Ksiazka k : ksiazki)
				System.out.println(k);
		}
		case 6 -> skaner.close();
		}
		
		if(wybor != 6)
			gui();
	}
}
