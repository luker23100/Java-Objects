
public class Main {

	public static void main(String[] args) {
		
		String jeden = "http://kurczaki.pl/blog";
		String dwa = "http://kurczaki.pl/blog/kura-w-miescie";
		String replace = "kurczaki.pl";
		String replacement = "naukajavy.pl";
		
		StringBuilder builder = new StringBuilder(jeden);
		builder.replace(builder.indexOf(replace), builder.indexOf(replace) + replace.length(), replacement);
		System.out.println(builder);
		builder = new StringBuilder(dwa);
		builder.replace(builder.indexOf(replace), builder.indexOf(replace) + replace.length(), replacement);
		System.out.println(builder);
		
		System.out.println("ZADANIE 2");
		
		String znaki = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                 + "0123456789"
                 + "abcdefghijklmnopqrstuvxyz";
		
		String poczatek = "http://wp.pl/";
		String zamiennik = "wirtualnapolska.pl";
		
		String[] adresy = new String[3];
		String[] zmienioneAdresy = new String[adresy.length];
		
		String random = "";
		StringBuilder randomizer;
		for(int i=0; i<adresy.length; i++) {
			randomizer = new StringBuilder(random);
			randomizer.append(poczatek);
			for(int j=0; j<((int) Math.floor(Math.random()*50 + 25)); j++)
				randomizer.append(znaki.charAt((int) Math.floor(Math.random()*znaki.length())));
			adresy[i] = randomizer.toString();
		}
		
		System.out.println("Przed zamian¹");
		for(String s : adresy)
			System.out.println(s);
		
		StringBuilder zamieniacz;
		for(int i=0; i<adresy.length; i++) {
			zamieniacz = new StringBuilder(adresy[i]);
			zamieniacz.replace(6, 12, zamiennik);
			adresy[i] = zamieniacz.toString();
		}
		
		System.out.println("Po zamianie");
		for(String s : adresy)
			System.out.println(s);
	}

}
