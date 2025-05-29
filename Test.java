package problemePOO;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Produit p1=new Produit(1,"tomate","sicam",4500,new Date());
		//p.setPrice(5000);
		//System.out.println(p);
		Produit p2=new Produit(2,"aaaaa","bbbb",4500,new Date());
		Produit p3=new Produit(3,"aaaa","bbb",4500,new Date());
		Produit p4=new Produit(4,"aaa","bbb",4500,new Date());
		
		//System.out.println(Produit.comparer(p3,p4));
		
		Magasin m=new Magasin(1, "fatma", "soussa", 10);
		m.ajouterProduit(p1);
		m.ajouterProduit(p2);
		m.ajouterProduit(p3);
		m.ajouterProduit(p4);
		m.supprimerProduit(p4);
		m.afficher();
		
		Magasin m1=new Magasin(2, "zayneb", "monastir", 10);
		m1.ajouterProduit(p1);
		m1.ajouterProduit(p2);
		
		System.out.println(Magasin.getTotalProduits());
		System.out.println("**********");
		//System.out.println(Magasin.max(m1, m));
		Magasin.max(m1, m).afficher();
		System.out.println("******************************");
		
		m.addEmploye(new Caissier(1, "aa", "bb", 40,5));
		m.addEmploye(new Responsable(2, "aaa", "bbb", 40,500));
		m.addEmploye(new Vendeur(3, "a", "b", 40,10.5));
		
	
		System.out.println("******** test de la partie 5 **********");
		ProduitFruit pp1=new ProduitFruit(1254, "Fraise", null, null,0, "mars",12.3f);
		ProduitFruit pp2=new ProduitFruit(1224, "pasteque", null, null,0, "juin",50);
		ProduitFruit pp3=new ProduitFruit(7896, "mandarine", null,  null,0,"decembre",25.6f);
		ProduitLegume pp4=new ProduitLegume(8521, "artichauts", null,  0,null,"janvier",14f);
		
		Magasin mg=new Magasin(1, "MG", "Sousse", 10);
		mg.ajouterProduit(pp1);
		mg.ajouterProduit(pp2);
		mg.ajouterProduit(pp3);
		mg.ajouterProduit(pp4);
		
		mg.afficher2();
		System.out.println("********");
		//System.out.println(pp1.determinerTypeProduit());
		System.out.println("********");
		System.out.println(mg.calculStock());
		System.out.println("********");
		System.out.println(pp1.estFrais("avril"));
		System.out.println("******");
		System.out.println(pp4.estFrais("fevrier"));
		
	}
	
}
