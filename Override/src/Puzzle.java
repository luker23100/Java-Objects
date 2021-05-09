
public class Puzzle extends Zabawka{
	private int liczbaElementow;

	public void ustawliczbaElementow(int liczbaElementow) {
		this.liczbaElementow = liczbaElementow;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\s" + "Liczba Elementow: " + liczbaElementow;
	}
}
