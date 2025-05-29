package problemePOO;

import java.util.Date;

public class ProduitFruit extends ProduitAgricole implements Critere{

	public ProduitFruit(int id, String libelle, Date dateExpiration,String marque, double price,  String saison,
			float quantite) {
		super(id, libelle, marque, price, dateExpiration, saison, quantite);
		// TODO Auto-generated constructor stub
	}
	
	public boolean estFrais(String s)
	{
		return this.saison.equalsIgnoreCase(s);
	}

	/*@Override
	public String toString() {
		*/
	

}
