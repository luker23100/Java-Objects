package wydzialKomunikacji;

public class Wniosek {
	private final String[] typTablicyTab = { "Samochodowa", "Motorowerowa", "Zabytkowa" };
	private final String[] statusTab = { "Z³o¿ono", "W Realizacji", "Do Odbioru" };
	private String imie;
	private String nazwisko;
	private String typTablicy;
	private String status;
	private boolean doOdbioru;
	private String numerWniosku;

	public Wniosek(String imie, String nazwisko, int typ) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		typTablicy = typTablicyTab[typ-1];
		status = statusTab[0];
		doOdbioru = false;
	}

	public void zmienStatus(int status) {
		// 1 - W Realizacji
		// 2 - Do Odbioru

		if (status == 1) {
			this.status = statusTab[1];
			doOdbioru = false;
		} else {
			this.status = statusTab[2];
			doOdbioru = true;
		}
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getTypTablicy() {
		return typTablicy;
	}

	public void setTypTablicy(String typTablicy) {
		this.typTablicy = typTablicy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isDoOdbioru() {
		return doOdbioru;
	}

	public void setDoOdbioru(boolean doOdbioru) {
		this.doOdbioru = doOdbioru;
	}

	public String getNumerWniosku() {
		return numerWniosku;
	}

	public void setNumerWniosku(String numerWniosku) {
		this.numerWniosku = numerWniosku;
	}

}
