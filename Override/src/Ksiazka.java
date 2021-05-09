
public class Ksiazka extends Zabawka {
	private int liczbaStron;
	private int dozwolonyWiek;

	public void ustawLiczbeStron(int liczbaStron) {
		this.liczbaStron = liczbaStron;
	}
	
	public void ustawDozwolonyWiek(int dozwolonyWiek) {
		this.dozwolonyWiek = dozwolonyWiek;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\s" + "Liczba stron: " + liczbaStron + "\n\s" + "Dozwolony wiek: " + dozwolonyWiek;
	}
}
