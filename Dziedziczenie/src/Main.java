import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Kwiat> kwiaty = new ArrayList<>();
		ArrayList<Nawoz> nawozy = new ArrayList<>();
		ArrayList<StrojRoboczy> strojeRobocze = new ArrayList<>();
		
		kwiaty.add(new Kwiat("Storczyk", 19.99, "Doniczkowe"));
		kwiaty.add(new Kwiat("Tulipan", 12.68, "Doniczkowe"));
		kwiaty.add(new Kwiat("Tuja", 11.34, "W sumie to nwm jaki typ"));
		
		nawozy.add(new Nawoz("Torf", 5, "Do truskawek"));
		nawozy.add(new Nawoz("Torf", 3, "Do kwiatów"));
		//btw nwm czy torf to nawóz ale whatever
		
		strojeRobocze.add(new StrojRoboczy("Koszula", 16.87, 'M'));
		
		System.out.println("Kwiaty: " + "\n");
		for(Kwiat k : kwiaty)
			System.out.println("\s" + k);
		System.out.println("--------------------");
		System.out.println("Nawozy: " + "\n");
		for(Nawoz n : nawozy)
			System.out.println("\s" + n);
		System.out.println("--------------------");
		System.out.println("Stroje Robocze: " + "\n");
		for(StrojRoboczy s : strojeRobocze)
			System.out.println("\s" + s);
	}

}
