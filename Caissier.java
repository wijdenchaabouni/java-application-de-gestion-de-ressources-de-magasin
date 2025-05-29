package problemePOO;

public class Caissier extends Employe{
	
	private int numCaisse;

	public Caissier(int id, String nom, String adresse, int nbHeures, int numCaisse) {
		super(id, nom, adresse, nbHeures);
		this.numCaisse = numCaisse;
	}
	public String toString()
	{
		return "Caissier-->"+super.toString()+", numero de caisse:"+numCaisse;
	}
	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	
}
