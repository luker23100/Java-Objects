
class Car {
	String carName;
	int price;

	public Car(String carName, int price) {
		this.carName = carName;
		this.price = price;
	}

	public String toString() {
		return "Nazwa samochodu: " + carName + "\n" + "Cena: " + price;
	}
}

public class Main {

	public static void main(String[] args) {
		System.out.println("======= Zadanie1 =======");
		
		Car mazda = new Car("Mazda MX-5", 154000);
		System.out.println(mazda.toString());
		
		Car volvo = new Car("Volvo XC90", 376000);
		System.out.println(volvo.toString());
		
		System.out.println("========================");
	}
}
