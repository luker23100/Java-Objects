package algorytmy;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutacje {
	Scanner skaner = new Scanner(System.in, "UTF-8");

	private ArrayList<String> wyrazy = new ArrayList<>();
	private ArrayList<String> indexy = new ArrayList<>();

	public Permutacje() {
		odczytWyrazow();
	}

	private void odczytWyrazow() {
		boolean koniec = false;
		System.out.println("Podaj wyrazy, wpisz \" quit \" aby zakoñczyæ wprowadzanie");
		String wyraz = null;

		do {
			System.out.print("Podaj wyraz: ");
			wyraz = skaner.nextLine();

			if (wyraz.equalsIgnoreCase("quit"))
				koniec = true;
			else
				wyrazy.add(wyraz);

		} while (!koniec);

		skaner.close();

		wyraz = "";

		for (int i = 0; i < wyrazy.size(); i++)
			wyraz += i;

		permutacje(wyraz, "");
		wyswietl();
	}

	private void permutacje(String wyraz, String odpowiedz) {
		if (wyraz.length() == 0) {
			indexy.add(odpowiedz);
			return;
		}

		for (int i = 0; i < wyraz.length(); i++) {

			char litera = wyraz.charAt(i);
			String reszta = wyraz.substring(0, i) + wyraz.substring(i + 1);

			permutacje(reszta, odpowiedz + litera);
		}
	}
	
	private void wyswietl() {
		StringBuilder wynik = new StringBuilder();
		
		for(String s : indexy) {
			
			for(int i=0; i<s.length(); i++)
				wynik.append(wyrazy.get(Integer.parseInt(s.substring(i, i+1))) + "\s");
			
			wynik.append("\n");
		}
		
		System.out.println(wynik);
	}
	
}
