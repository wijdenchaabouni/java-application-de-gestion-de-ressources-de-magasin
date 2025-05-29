package problemePOO;

import java.util.Date;

public class ProduitAgricole extends Produit {
	
	protected String saison;
	protected float quantite;
	public ProduitAgricole(int id, String libelle, String marque, double price, Date dateExpiration, String saison,
			float quantite) {
		super(id, libelle, marque, price, dateExpiration);
		this.saison = saison;
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"[saison=" + saison + ", quantite=" + quantite + ",  " + super.toString()
				+ "]";
	}
	
	
	

}
