
public class Mis extends Zabawka{
	private String material;

	public void ustawMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\s" + "Material: " + material;
	}
}
