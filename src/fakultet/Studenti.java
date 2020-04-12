package fakultet;
		//Subklasa			superklasa
public class Studenti extends Osobe {
	
	private int brIndeksa;
	private int godina; // godina studiranja
	
	public Studenti (String ime, String prezime, String adresa, String jmbg, String brLk, int brIndeksa, int godina) {
		super (ime, prezime, adresa, jmbg, brLk); //konstruktor super klase
		this.brIndeksa = brIndeksa;
		this.godina = godina;
	}

	public int getBrIndeksa() {
		return brIndeksa;
	}

	public int getGodina() {
		return godina;
	}

	
	

}
