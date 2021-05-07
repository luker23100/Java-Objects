
public class Main {

	public static void main(String[] args) {
		StringBuilder kodPocztowy = new StringBuilder();

		for (int i = 0; i < 5; i++)
			kodPocztowy.append(Losuj.losujLiczbe());
		kodPocztowy.insert(2, "-");

		System.out.println(kodPocztowy);

	}

}
