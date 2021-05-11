
public class Zwierze {
	private String rodzaj;
	private final String[] rodzaje = {"Pies", "Kot"};
	private String imie;
	
	@Override
	public boolean equals(Object obj) {
		Zwierze zwierze = (Zwierze) obj;
		return imie.equalsIgnoreCase(zwierze.getImie());
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public void ustalRodzaj(int rodzaj) {
		this.rodzaj = rodzaje[rodzaj];
	}
	
	@Override
	public String toString() {
		return rodzaj + "\n " + "Imie: " + imie;
	}
}
