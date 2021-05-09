
public class Samochod extends Zabawka{
	String typ;

	public void ustawTyp(String typ) {
		this.typ = typ;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\s" + "Typ: " + typ;
	}
}
