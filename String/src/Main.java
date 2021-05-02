
class Przepis {
	String nazwa;
	String[] skladniki;
	int czasWykonania;
	String opis;
	String sformatowanyOpis = "";
	boolean czyFormat = false;

	public Przepis(String nazwa, String[] skladniki, int czasWykonania, String opis) {
		this.nazwa = nazwa;
		this.skladniki = skladniki;
		this.czasWykonania = czasWykonania;
		this.opis = opis;
	}
	
	public void formatujOpis() {
		czyFormat = true;
		System.out.println(opis.length());
		String[] zdania = opis.split("\\.");
		System.out.println(zdania.length);
		for(int i=0; i<zdania.length; i++) {
			sformatowanyOpis +=  zdania[i] + ".";
			if(i%2 != 0 && i != 0)
				sformatowanyOpis += "\n";
		}
		sformatowanyOpis += "\n" + "Zach�cam do zapoznania si� z innymi\r\n"
				+ "przepisami.";
	}
	
	public String toString() {
		String przepis = "nazwa \n" + "Czas wykonania: " + czasWykonania + "min" + "\n";
		przepis += "Sk�adniki: \n";
		for(String s : skladniki)
			przepis += "\s-" + s + "\n";
		
		if(!czyFormat)
			return przepis + opis;
		return przepis + sformatowanyOpis;
	}
}

public class Main {

	public static void main(String[] args) {

		System.out.println("======= Zadanie1 =======");

		System.out.println(sprawdzCzyPoprawnyKodPocztowy("76-200"));
		System.out.println(sprawdzCzyPoprawnyKodPocztowy("76200"));
		System.out.println(sprawdzCzyPoprawnyKodPocztowy("76-2001"));

		System.out.println("========================\n");

		System.out.println("======= Zadanie2 =======");

		Przepis gotowanieWody;
		String nazwa = "Gotowanie wody";
		String[] skladniki = { "Woda", "Pojemnik", "�r�d�o Ciep�a" };
		int czasWykonania = 2;
		String opis = "Po pozyskaniu surowca jakim jest woda, wlej t� ciecz do pojemnika."
				+ "Ustaw za� ten pojemnik na �r�dle ciep�a. Sprawdzaj temperatur� cieczy a� dojdzie do 100 stopni, najlepiej przy pomocy kamery termowizyjnej. Gdy zacznie si� przemiana cieczy w gaz, znaczy �e ca�a procedura si� uda�a. Gratulacje woda si� gotuje.";
		
		gotowanieWody = new Przepis(nazwa, skladniki, czasWykonania, opis);
		System.out.println(gotowanieWody);
		
		gotowanieWody.formatujOpis();
		System.out.println(gotowanieWody.sformatowanyOpis);
		
		System.out.println("========================");

	}

	public static boolean sprawdzCzyPoprawnyKodPocztowy(String kod) {
		if (kod.length() != 6 || kod.charAt(2) != '-')
			return false;
		return true;
	}

}
