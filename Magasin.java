package problemePOO;

public class Magasin {
	private int id;
	private String nom;
	private String adresse;
	private final int CAPACITE;

	private Produit[] produits;
	private int nbProduit;
	private static int totalProduits;

	private static final int CAP_EMP = 20;
	private Employe tabEmp[] = new Employe[CAP_EMP];
	private int nbEmp;

	public void addEmploye(Employe e) {
		tabEmp[nbEmp++] = e;
	}

	public void afficherEmployer() {
		for (int i = 0; i < nbEmp; i++) {
			System.out.println(tabEmp[i] + " " + tabEmp[i].salaire());
			/*
			 * if(tabEmp[i] instanceof Caissier) System.out.println(tabEmp[i]+" "
			 * +((Caissier) tabEmp[i]).salaire());
			 * 
			 * if(tabEmp[i] instanceof Responsable) System.out.println(tabEmp[i]+" "
			 * +((Responsable) tabEmp[i]).salaire());
			 */
		}

	}

	public Magasin(int id, String nom, String adresse, int cAPACITE) {

		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		if (cAPACITE > 0 && cAPACITE <= 50)
			this.CAPACITE = cAPACITE;
		else
			CAPACITE = 0;
		// if(cAPACITE>0 && cAPACITE<=50)
		produits = new Produit[CAPACITE];
	}

	public void ajouterProduit(Produit p) {
		if (nbProduit < CAPACITE) {
			if (rechercher(p) == -1) {
				produits[nbProduit++] = p;
				totalProduits++;
			} else
				System.out.println("produit existe...");
		} else
			System.out.println("espace insuffisant...");
	}

	public void afficher() {
		System.out.println("id:" + id + "  nom:" + nom + "  adresse:" + adresse);
		for (int i = 0; i < nbProduit; i++)
			System.out.println(produits[i].getLibelle() + " , " + produits[i].getPrice());

	}
	


	public void afficher2() {
		
		for (int i = 0; i < nbProduit; i++)
			System.out.println(produits[i]);
	}

	public static int getTotalProduits() {
		return totalProduits;
	}

	public int rechercher(Produit p) {
		for (int i = 0; i < nbProduit; i++)
			if (produits[i].comparer(p))
				return i;
		return -1;
	}

	public void supprimerProduit(Produit p) {
		int pos = rechercher(p);
		if (pos != -1) {
			for (int i = pos; i < nbProduit - 1; i++)
				produits[i] = produits[i + 1];
			nbProduit--;
			totalProduits--;
		}

	}

	public static Magasin max(Magasin m1, Magasin m2) {
		return m1.nbProduit > m2.nbProduit ? m1 : m2;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < nbProduit; i++)
			;
		return sb.toString();

	}
	
	public float calculStock()
	{
		float somme=0;
		for (int i = 0; i < nbProduit; i++)
			if(produits[i].determinertypeProduit().equals("fruit"))
				somme+=((ProduitAgricole)produits[i]).quantite;
		return somme;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
