
public class Samolot {
	int identyfikator;
	Rejs rejs = null;

	public Samolot(int identyfikator) {
		this.identyfikator = identyfikator;
	}

	public boolean dodajRejs(Rejs rejs) {
		if (this.rejs != null) {
			System.out.println("Ten samolot ma ju¿ aktywny rejs");
			return false;
		}

		this.rejs = rejs;
		rejs.identyfikatorSamolotu = identyfikator;
		System.out.println("Dodano rejs dla samolotu: " + identyfikator);
		return true;
	}

	public String toString() {
		if(rejs == null)
			return "Samolot: " + identyfikator + " - Brak aktywnego rejsu";
		
		return "Samolot: " + identyfikator + "\n" + "Rejs: \n" + rejs;
	}
}
