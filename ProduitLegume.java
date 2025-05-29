package problemePOO;

import java.util.Date;

public class ProduitLegume extends ProduitAgricole implements Critere{

	public ProduitLegume(int id, String libelle, String marque, double price, Date dateExpiration, String saison,
			float quantite) {
		super(id, libelle, marque, price, dateExpiration, saison, quantite);
		// TODO Auto-generated constructor stub
	}
	private int indiceMois(String saison)
	{
		String mois[]= {"janvier","fevrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","decembre"};
		for(int i=0;i<mois.length;i++)
			if(mois[i].equalsIgnoreCase(saison))
				return i;
		return -1;
	}

	@Override
	public boolean estFrais(String s) {
		
          int a=indiceMois(this.saison);
          int b=indiceMois(s);
          if(a==b || b==a+1 || (a==11 && b==0))
        	  return true;
		return false;
	}

}
