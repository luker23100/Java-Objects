package napoje;

import java.util.Scanner;

public class Napoj {
	Scanner sks = new Scanner(System.in);
	private double pojemnosc;
	private String sklad;

	public Napoj(double pojemnosc, String sklad) {
		this.pojemnosc = pojemnosc;
		this.sklad = sklad;
	}

	public String toString() {
		return "\sPojemnoœæ: " + pojemnosc + "\n\s" + "Sk³ad: " + sklad;
	}
}

class Woda extends Napoj {
	private String rodzaj;

	public Woda(double pojemnosc, String sklad, String rodzaj) {
		super(pojemnosc, sklad);
		this.rodzaj = rodzaj;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\s" + "Rodzaj: " + rodzaj;
	}
}

class Piwo extends Napoj {
	private double zawartoscAlkoholu;

	public Piwo(double pojemnosc, String sklad, double zawartoscAlkoholu) {
		super(pojemnosc, sklad);
		this.zawartoscAlkoholu = zawartoscAlkoholu;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\s" + "Zawartoœæ alkoholu: " + zawartoscAlkoholu + "%";
	}
}
