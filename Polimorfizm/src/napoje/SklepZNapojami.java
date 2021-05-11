package napoje;

import java.util.ArrayList;
import java.util.Scanner;

public class SklepZNapojami {
	Scanner skaner = new Scanner(System.in, "UTF-8");
	ArrayList<Napoj> napoje = new ArrayList<>();
	
	public SklepZNapojami() {
		gui();
	}
	
	private void gui() {
		System.out.println("------ Sklep z napojami ------");
		String[] opcje = {"[1] Dodaj wode", "[2] Dodaj piwo", "[3] Wyswietl sklep", "[4] Wyjscie"};
		
		for(String s : opcje)
			System.out.println("\s" + s);
		
		metody(wybor());
	}
	
	private int wybor() {
		int wybor = 0;
		while(wybor < 1 || wybor > 4) {
			try {
				System.out.print("Wybierz opcje: ");
				wybor = Integer.parseInt(skaner.nextLine());
			} catch(Exception e) {}
		}
		return wybor;
	}
	
	private void metody(int wybor) {
		double pojemnosc = 0;
		String sklad = null;
		
		if(wybor < 3) {
			System.out.print("Podaj pojemnosc: ");
			pojemnosc = skaner.nextDouble();
			skaner.nextLine();
			System.out.print("Podaj sk³ad: ");
			sklad = skaner.nextLine();
		}
		
		switch(wybor) {
		case 1 -> {
			String rodzaj;
			System.out.print("Podaj rodzaj: ");
			rodzaj = skaner.nextLine();
			
			napoje.add(new Woda(pojemnosc, sklad, rodzaj));
		}
		case 2 -> {
			double zawartoscAlkoholu;
			System.out.print("Podaj zawartosc alkoholu: ");
			zawartoscAlkoholu = skaner.nextDouble();
			skaner.nextLine();
			
			napoje.add(new Piwo(pojemnosc, sklad, zawartoscAlkoholu));
		}
		case 3 -> {
			System.out.println("Produkty: ");
			for(Napoj n : napoje) {
				System.out.println(n + "\n---------------\n");
			}
		}
		case 4 -> skaner.close();
		}
		
		if(wybor != 4)
			gui();
	}
}
