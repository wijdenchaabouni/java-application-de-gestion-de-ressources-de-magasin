package problemePOO;

public abstract class Employe {
	
	protected int id;
	protected String nom,adresse;
	protected int nbHeures;
	public Employe(int id, String nom, String adresse, int nbHeures) {
		
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbHeures = nbHeures;
	}
	@Override
	public String toString() {
		return "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbHeures=" + nbHeures;
	}
	
	public abstract double salaire();
	
	
	

}
