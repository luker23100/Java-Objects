import java.util.ArrayList;

public class RejestrLotow {
	ArrayList<Samolot> samoloty = new ArrayList<>();
	
	public boolean dodajSamolot(Samolot samolot) {
		for(Samolot s : samoloty) {
			if(s.identyfikator == samolot.identyfikator) {
				System.out.println("Taki samolot ju¿ jest w rejestrze");
				return false;
			}
		}
		
		samoloty.add(samolot);
		return true;
	}
	
	public void wyswietlSamoloty() {
		for(Samolot s : samoloty)
			System.out.println(s);
	}
}
