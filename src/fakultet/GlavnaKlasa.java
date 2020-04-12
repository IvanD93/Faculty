package fakultet;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		Osobe o1 = new Osobe("Maja", "Veselinovic", "Bg", "54136431", "32154");
		
		Studenti s1 = new Studenti ("Ivan", "Damnjanovic" , "Bg", "52234", "42351", 000001, 4);
		
		Studenti s2 = new Studenti("Pera", "Peric" , "Bg", "34565", "42351231", 000002, 3);

		Profesori p1 = new Profesori ("Dragoljub", "Boranijasevic", "Bg", "5641361", "5616564", "Manuelno testiranje");
		
		System.out.println(p1.getBrLk());
		System.out.println(o1.getPrezime());
		System.out.println(s1.getIme());
		
		
	}

}
