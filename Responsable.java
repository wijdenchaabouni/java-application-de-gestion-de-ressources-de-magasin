package problemePOO;

public class Responsable extends Employe {
	
	private double prime;

	public Responsable(int id, String nom, String adresse, int nbHeures, double prime) {
		super(id, nom, adresse, nbHeures);
		this.prime = prime;
	}
	public double salaire()
	{
		return 800;
	}

}
