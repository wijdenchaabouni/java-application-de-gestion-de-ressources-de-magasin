package problemePOO;

public class Vendeur extends Employe{
	
	private double tauxDeVente;

	public Vendeur(int id, String nom, String adresse, int nbHeures, double tauxDeVente) {
		super(id, nom, adresse, nbHeures);
		this.tauxDeVente = tauxDeVente;
	}
	public double salaire()
	{
		return 600;
	}

}
