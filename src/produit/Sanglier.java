package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	
	public String decrireProduit() {
		return(getNom() + " de " + poids + Unite.KILOGRAMME.toString() + " chass� par " + chasseur.getNom());
	}
	

}
