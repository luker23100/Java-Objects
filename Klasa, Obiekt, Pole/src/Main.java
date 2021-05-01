class HotelRoom {
	int number = (int) Math.floor(Math.random() * 50 + 1);
	boolean isFree = ((Math.floor(Math.random() * 2 + 1) % 2 == 0)) ? true : false;

	public String toString() {
		return "Numer Pokoju: " + number + "\n" + "Czy Wolny: " + isFree;
	}
}

class Car {
	int horsePower = (int) Math.floor(Math.random() * 150 + 50);
	String fuelType = (Math.floor(Math.random() * 2 + 1) % 2 == 0) ? "Petrol" : "Diesel";
	boolean isExpensive = (horsePower >= 150) ? true : false;

	public String toString() {
		return "Horse Power: " + horsePower + "\n" + "Type of Fuel: " + fuelType + "\n" + "Is this car expensive: "
				+ isExpensive;
	}
}

public class Main {

	public static void main(String[] args) {
		System.out.println("======= Zadanie1 =======");

		for (int i = 0; i < 5; i++)
			System.out.println(new HotelRoom().toString());

		System.out.println("========================" + "\n");

		System.out.println("======= Zadanie2 =======");

		for (int i = 0; i < 5; i++)
			System.out.println(new Car().toString());

		System.out.println("========================" + "\n");
	}
}
