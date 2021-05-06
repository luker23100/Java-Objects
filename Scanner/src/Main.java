import java.text.DecimalFormat;
import java.util.Scanner;

class SrednieSpalanie {
	Scanner skan = new Scanner(System.in);
	DecimalFormat format = new DecimalFormat(".##");
	int iloscWpisow = 0;
	double[] srednieSpalanie = new double[5];
	
	
	public SrednieSpalanie() {
		gui();
	}
	
	private void gui() {
		System.out.println("Monitorowanie Sredniego Spalania");
		final String[] opcje = {"[1] Dodaj wpis",
								"[2] Wyswietl Spalanie",
								"[3] Wyjscie"};
		for(String s : opcje)
			System.out.println("\s" + s);
		
		metody(wyborOpcji());
	}
	
	private int wyborOpcji() {
		Scanner skan = new Scanner(System.in);
		int wybor = 0;
		
		while(wybor < 1 || wybor > 3) {
			try {
				System.out.print("Wybierz opcje: ");
				wybor = Integer.parseInt(skan.nextLine());
			} catch(Exception e) {}
		}
		return wybor;
	}
	
	private void metody(int wybor) {
		switch (wybor) {
		case 1 -> dodajWpis();
		case 2 -> wyswietlSpalanie();
		case 3 -> skan.close();
		}
	}
	
	private void dodajWpis() {
		System.out.print("Ile kilometrów przejechano ?: ");
		double liczbaPrzejechanychKilometrow = skan.nextDouble();
		System.out.print("Ile spalono paliwa ?: ");
		double iloscSpalonegoPaliwa = skan.nextDouble();
		
		double srednieSpalanie = (iloscSpalonegoPaliwa/liczbaPrzejechanychKilometrow)*100.0;
		
		if(iloscWpisow == 5)
			iloscWpisow = 0;
		
		iloscWpisow++;
		this.srednieSpalanie[iloscWpisow-1] = srednieSpalanie;
		
		gui();
	}
	
	private void wyswietlSpalanie() {
		if(iloscWpisow == 0)
			System.out.println("Brak danych");
		else {
			double srednia = 0;
			for(double d : srednieSpalanie)
				srednia += d;
			srednia /= srednieSpalanie.length;
			System.out.println("Œrednie spalanie: " + format.format(srednia));
		}
		gui();
	}
}

public class Main {

	public static void main(String[] args) {
		
		new SrednieSpalanie();

	}

}
