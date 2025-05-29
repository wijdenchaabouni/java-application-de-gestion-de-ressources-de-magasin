package problemePOO;

import java.util.Date;

public class Produit {

	private int id;;
	private String libelle;
	private String marque;
	private double price;
	
	private Date dateExpiration;
	public Produit(int id, String libelle, String marque, double price, Date dateExpiration) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
		if(price>0)
		this.price = price;
		this.dateExpiration = dateExpiration;
	}
	public Produit(String libelle, String marque, double price, Date dateExpiration) {
		super();
		this.libelle = libelle;
		this.marque = marque;
		
		this.price = price;
		this.dateExpiration = dateExpiration;
	}
	public Produit() {
		super();
		
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0)
		this.price = price;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "  id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", price=" + price
				+ ", dateExpiration=" + dateExpiration + "   ";
	}
	
	public boolean comparer(Produit p)
	{
		return this.id==p.id && this.libelle.equals(p.libelle) && this.price==p.price;
	}
	
	public static boolean comparer(Produit p1,Produit p2)
	{
		return p1.comparer(p2);
	}
	public String determinertypeProduit()
	{
		if(this instanceof ProduitFruit)
			return "fruit";
		else if(this instanceof ProduitLegume)
			return "legume";
		else return "autre produit";
	}
	
	
	
}
