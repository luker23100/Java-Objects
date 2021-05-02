class Adres {
	String ulica;
	int nrDomu;
	int nrMieszkania;

	public Adres(String ulica, int nrDomu, int nrMieszkania) {
		this.ulica = ulica;
		this.nrDomu = nrDomu;
		this.nrMieszkania = nrMieszkania;
	}

	public String toString() {
		return "\sUlica: " + ulica + "\n\s" + "Numer Domu: " + nrDomu + "\n\s" + "Numer Mieszkania: " + nrMieszkania;
	}
}

class Firma {
	String nazwa;
	long nip;
	Adres adres;

	public Firma(String nazwa, long nip, Adres adres) {
		this.nazwa = nazwa;
		this.nip = nip;
		this.adres = adres;
	}

	public String toString() {
		return "Nazwa Firmy: " + nazwa + "\n" + "NIP: " + nip + "\n" + "Adres: " + "\n" + adres.toString();
	}
}

class ZarejestrowaneFirmy {
	private final int limitFirm = 3;
	Firma[] firmy = new Firma[0];

	public void dodaj(Firma firma) {
		if (czyMoznaDodacFirme())
			dodajFirme(firma);
		else
			System.out.println("Przekroczono limit firm");
	}
	
	public Firma wyszukajPoNip(long nip) {
		for(Firma f : firmy)
			if(f.nip == nip)
				return f;
		System.out.println("Brak takiej firmy");
		return null;
	}
	
	public Firma wyszukajFirme(String nazwa) {
		for(Firma f : firmy)
			if(f.nazwa.equalsIgnoreCase(nazwa))
				return f;
		System.out.println("Brak takiej firmy");
		return null;
	}

	private boolean czyMoznaDodacFirme() {
		if (firmy.length + 1 > limitFirm)
			return false;
		return true;
	}

	private void dodajFirme(Firma firma) {
		Firma[] buffor = firmy;
		firmy = new Firma[buffor.length + 1];

		for (int i = 0; i < buffor.length; i++)
			firmy[i] = buffor[i];
		firmy[firmy.length - 1] = firma;
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("======= Zadanie1 =======");
		ZarejestrowaneFirmy rejestr = new ZarejestrowaneFirmy();

		Adres adres1 = new Adres("Mickiewicza", 43, 5);
		Adres adres2 = new Adres("Koœciuszki", 56, 33);
		Adres adres3 = new Adres("Kazimierza Wielkiego", 18, 4);
		Adres adres4 = new Adres("Leœna", 21, 7);

		Firma firma1 = new Firma("Drutex", 5842751979L, adres1);
		Firma firma2 = new Firma("Apple", 7622712939L, adres2);
		Firma firma3 = new Firma("Microsoft", 1234567890L, adres3);
		Firma firma4 = new Firma("Nvidia", 1102945826L, adres4);
		
		rejestr.dodaj(firma1);
		rejestr.dodaj(firma2);
		rejestr.dodaj(firma3);
		System.out.println(rejestr.wyszukajFirme("apple"));
		System.out.println("/////////////////////////");
		System.out.println(rejestr.wyszukajPoNip(1234567890L));
		
		
		System.out.println("======================== \n");
		
		System.out.println("======= Zadanie2 =======");
		
		RejestrLotow rejestrLotow = new RejestrLotow();
		Samolot rayanair = new Samolot(1);
		Samolot emirates = new Samolot(2);
		Samolot lot = new Samolot(3);
		
		rejestrLotow.dodajSamolot(rayanair);
		rejestrLotow.dodajSamolot(emirates);
		rejestrLotow.dodajSamolot(lot);
		
		Rejs hiszpania = new Rejs(8, 12);
		rejestrLotow.samoloty.get(rayanair.identyfikator-1).dodajRejs(hiszpania);
		
		rejestrLotow.wyswietlSamoloty();
		
		System.out.println("========================");
	}
}
