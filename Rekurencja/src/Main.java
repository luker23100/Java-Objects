
public class Main {

	public static void main(String[] args) {

		// TWORZENIE DRZEWA (Trochê na odwal) IGNOROWAÆ

		Osoba edwardKamien = new Osoba("Edward", "Kamien");
		Osoba mariaKamien = new Osoba("Maria", "Kamien");
		Osoba[] p1 = { edwardKamien, mariaKamien };

		Osoba stefanPiasek = new Osoba("Stefan", "Piasek");
		Osoba kamilKamien = new Osoba("Kamil", "Kamien");
		kamilKamien.potomkowie = p1;
		Osoba igorPiasek = new Osoba("Igor", "Piasek");
		Osoba[] p2 = { stefanPiasek, kamilKamien, igorPiasek };

		Osoba annaPiasek = new Osoba("Anna", "Piasek");
		annaPiasek.potomkowie = p2;
		Osoba weronikaStal = new Osoba("Weronika", "Stal");
		Osoba maciejStal = new Osoba("Maciej", "Stal");
		Osoba[] p3 = { annaPiasek, maciejStal, weronikaStal };

		Osoba teofiliaKrol = new Osoba("Teofilia", "Krol");
		teofiliaKrol.potomkowie = p3;
		Osoba jozejKrol = new Osoba("Jozej", "Krol");
		Osoba darekKrol = new Osoba("Darek", "Krol");
		Osoba[] p4 = { new Osoba("Kazik", "Krol") };
		darekKrol.potomkowie = p4;
		Osoba[] p5 = { darekKrol, jozejKrol, teofiliaKrol };

		Osoba majaKrol = new Osoba("Maja", "Krol");
		majaKrol.potomkowie = p5;
		Osoba stefanJanowczyk = new Osoba("Stefan", "Janowczyk");
		Osoba[] p6 = { majaKrol, stefanJanowczyk };

		Osoba[] r1 = { new Osoba("Maja", "Nowak") };
		Osoba marekNowak = new Osoba("Marek", "Nowak");
		Osoba annaKowalska = new Osoba("Anna", "Kowalska");
		marekNowak.potomkowie = r1;
		Osoba[] r2 = { marekNowak, annaKowalska };

		Osoba andrzejNowak = new Osoba("Andrzej", "Nowak");
		andrzejNowak.potomkowie = r2;
		Osoba[] r3 = { andrzejNowak };
		Osoba jurekJanowczyk = new Osoba("Jurek", "Janowczyk");
		jurekJanowczyk.potomkowie = p6;
		Osoba kasiaNowak = new Osoba("Kasia", "Nowak");
		kasiaNowak.potomkowie = r3;
		Osoba kasiaJanowczyk = new Osoba("Kasia", "Janowczyk");
		Osoba[] f1 = { kasiaJanowczyk, kasiaNowak, jurekJanowczyk };
		Osoba marekJanowczyk = new Osoba("Marek", "Janowczyk");
		marekJanowczyk.potomkowie = f1;

		// TWORZENIE DRZEWA (Trochê na odwal) IGNOROWAÆ

		Osoba panNienalezacy = new Osoba("Wladek", "dlar");

		wyswietlRodzine(marekJanowczyk, 0);

		System.out.println(czyNalezyDoRodziny(marekJanowczyk, maciejStal));

	}

	public static void wyswietlRodzine(Osoba osoba, int wciecie) {
		int iloscWciec = wciecie;
		for (int i = 0; i < iloscWciec; i++)
			System.out.print("-");
		System.out.println(osoba.imie + " " + osoba.nazwisko);

		for (Osoba o : osoba.potomkowie) {
			wyswietlRodzine(o, iloscWciec + 1);
		}

	}

	public static boolean czyNalezyDoRodziny(Osoba drzewo, Osoba osoba) {
		if (drzewo.imie.equalsIgnoreCase(osoba.imie) && drzewo.nazwisko.equalsIgnoreCase(osoba.nazwisko))
			return true;
		else {
			for (Osoba o : drzewo.potomkowie)
				if (czyNalezyDoRodziny(o, osoba))
					return true;
		}
		return false;
	}

}
