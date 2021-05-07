package wydzialKomunikacji;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplikacja {
	private Scanner skaner = new Scanner(System.in, "UTF-8");
	private ArrayList<Wniosek> wnioski = new ArrayList<>();
	
	public Aplikacja() {
		gui();
		
	}
	
	private void gui() {
		final String[] opcje = { "[1] Z³ó¿ wniosek", "[2] Sprawdz status", "[3] Wyjscie" };
		
		System.out.println("Wnioski o wydanie tablicy rejestracyjnej");
		System.out.println("----------------------------------------");
		for(String s : opcje)
			System.out.println("\s" + s);
		
		metody(wybierak(1, opcje.length));
	}
	
	private int wybierak(int min, int max) {
		int wybor = min-1;
		
		while(wybor < min || wybor > max) {
			try {
				System.out.print("Wybierz opcje: ");
				wybor = Integer.parseInt(skaner.nextLine());
			} catch(Exception e) {}
		}
		return wybor;
	}
	
	private void metody(int wybor) {
		switch(wybor) {
		case 1 -> nowyWniosek();
		case 2 -> {
			System.out.println(sprawdzStatus() + "\n\n");
			gui();
		}
		case 3 -> skaner.close();
		}
	}
	
	private void nowyWniosek() {
		System.out.print("Podaj imie: ");
		String imie = skaner.nextLine().strip();
		System.out.print("Podaj nazwisko: ");
		String nazwisko = skaner.nextLine().strip();
		
		System.out.println("Wybierz typ tablicy: ");
		System.out.println(" [1] Samochodowa");
		System.out.println(" [2] Motorowerowa");
		System.out.println(" [3] Zabytkowa");
		int typTablicy = wybierak(1, 3);
		String numerWniosku = imie.charAt(0) + imie.charAt(1) + String.valueOf(wnioski.size()+1);
		
		Wniosek nowyWniosek = new Wniosek(imie, nazwisko, typTablicy);
		nowyWniosek.setNumerWniosku(numerWniosku);
		
		wnioski.add(nowyWniosek);
		
		System.out.println("Sukces, numer twojego wniosku to: " + numerWniosku + "\n\n");
		gui();
	}
	
	private String sprawdzStatus() {
		System.out.print("Podaj numer wniosku: ");
		String numerWniosku = skaner.nextLine();
		
		for(Wniosek w : wnioski)
			if(w.getNumerWniosku().equals(numerWniosku))
				return "Status: " + w.getStatus();
		return "Brak wniosku o takim numerze";
	}
}
