import java.util.Scanner;

public class Zadanie {
	int min;
	int max;
	int a;
	int b;

	public Zadanie() {
		wprowadzenieLiczb();
	}

	private void wprowadzenieLiczb() {
		Scanner skan = new Scanner(System.in);
		System.out.print("Wprowadz min: ");
		min = skan.nextInt();
		System.out.print("Wprowadz max: ");
		max = skan.nextInt();
		skan.close();
		losujLiczby();
	}

	private void losujLiczby() {
		a = (int) Math.floor((Math.random() * max - min + 1) + min);
		b = (int) Math.floor((Math.random() * max - min + 1) + min);
		obliczenia();
	}

	private void obliczenia() {
		System.out.println("Wylosowane liczby od " + min + " do " + max + ":");
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println("Logarytm " + a + " z " + b + " wynosi: " + (Math.log(b) / Math.log(a)));
		System.out.println("Cosinus z " + a + " wynosi: " + Math.cos(a));
		System.out.println("Tangens z " + b + " wynosi: " + Math.tan(b));
	}
}
