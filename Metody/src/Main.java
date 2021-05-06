
class Bursztyn {
	String barwa;
	double twardosc;
	double gestosc;
	int temperaturaTopnieniaCelsjusz;

	public Bursztyn(String barwa, double twardosc, double gestosc, int temperaturaTopnieniaCelsjusz) {
		this.barwa = barwa;
		this.twardosc = twardosc;
		this.gestosc = gestosc;
		this.temperaturaTopnieniaCelsjusz = temperaturaTopnieniaCelsjusz;
	}

	public void zmienGestosc(double gestosc) {
		this.gestosc = gestosc;
	}

	public int temperaturaTopnieniaWFarenheitach() {
		return (int) ((9.0 / 5.0) * temperaturaTopnieniaCelsjusz + 32);
	}
}

class Obraz {

	public String obraz1(int n, char character) {
		String obraz = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				obraz += character;
			obraz += "\n";
		}
		return obraz;
	}
}

public class Main {

	public static void main(String[] args) {

		System.out.println("======= Zadanie1 =======");

		Bursztyn bursztyn1 = new Bursztyn("Bursztynowahehe", 2.1, 1.07, 289);
		System.out.println(bursztyn1.temperaturaTopnieniaWFarenheitach());
		System.out.println("gestosc1 = " + bursztyn1.gestosc);
		bursztyn1.zmienGestosc(1.1);
		System.out.println("gestosc2 = " + bursztyn1.gestosc);

		System.out.println("========================\n");

		System.out.println("======= Zadanie2 =======");

		Obraz obraz = new Obraz();
		System.out.println(obraz.obraz1(5, '&'));
		System.out.println(obraz.obraz1(100, 'K'));
		System.out.println(obraz.obraz1(59, 't'));

		System.out.println("========================\n");
	}

}
