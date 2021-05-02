
public class Rejs {
	int godzinaOdlotu;
	int godzinaPrzylotu;
	int identyfikatorSamolotu;

	public Rejs(int godzinaOdlotu, int godzinaPrzylotu) {
		this.godzinaOdlotu = godzinaOdlotu;
		this.godzinaPrzylotu = godzinaPrzylotu;
	}

	public String toString() {
		return "\sGodzina odlotu: " + godzinaOdlotu + "\n\s" + "Godzina przylotu: " + godzinaPrzylotu;
	}
}
