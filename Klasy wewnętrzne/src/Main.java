
public class Main {

	public static void main(String[] args) {
		
		KontoBankowe konto = new KontoBankowe("Adam", "Kowalski", "adam123", "adam321");
		konto.dodajKarte("Visa");
		konto.dodajKarte("Mastercard");
		konto.dodajKarte("jakastamkarta");
		
		konto.wyswietlKarty();
	}

}
