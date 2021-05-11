import java.util.ArrayList;
import java.util.Scanner;

public class Schronisko {
	Scanner skaner = new Scanner(System.in, "UTF-8");
	
	ArrayList<Zwierze> zwierzeta = new ArrayList<>();
	
	public Schronisko() {
		gui();
	}
	
	private void gui() {
		String[] opcje = {"[1] Dodaj zwierze", "[2] Wyswietl zwierzêta", "[3] Wyjœcie"};
		
		for(String s : opcje)
			System.out.println(s);
		
		metody(wybor());
	}
	
	private int wybor() {
		int wybor = 0;
		
		while(wybor < 1 || wybor > 3) {
			try {
				System.out.print("Wybierz opcje: ");
				wybor = Integer.parseInt(skaner.nextLine());
			} catch(Exception e) {}
		}
		
		return wybor;
	}
	
	private void metody(int wybor) {
		switch(wybor) {
		case 1 -> {
			Zwierze zwierze = new Zwierze();
			System.out.println("Pies - 1" + "\n" + "Kot - 2");
			System.out.print("Wybierz rodzaj: ");
			zwierze.ustalRodzaj(skaner.nextInt()-1);
			skaner.nextLine();
			
			System.out.print("Podaj imie: ");
			zwierze.setImie(skaner.nextLine());
			
			zwierzeta.add(zwierze);
		}
		case 2 -> {
			for(Zwierze z : zwierzeta)
				System.out.println(z);
		}
		case 3 -> skaner.close();
		}
		
		if(wybor != 3)
			gui();
	}
}
