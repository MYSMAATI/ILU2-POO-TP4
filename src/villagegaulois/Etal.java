package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal<T extends IProduit> implements IEtal {
	private Gaulois vendeur;
	private T[] produits;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	private int prix;
	private int nbProduit = 0;
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}
	
	public void installerVendeur(Gaulois vendeur, T[] produit, int prix) {
		this.vendeur = vendeur;
		this.produits = produit;
		this.quantiteDebutMarche = produit.length;
		this.prix = prix;
		this.etalOccupe = true;
	}
	
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
			if (nbProduit >= quantiteSouhaitee) {
				quantiteAVendre = quantiteSouhaitee;
			} else {
				quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}
	
	@Override
	public int acheterProduit(int quantiteSouhaite) {
		int prixPaye = 0;
		/*for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaite - 1 || i > 1; i--) {
			prixPaye += produits[i].calculerPrix(prix); //question 3.d
		}*/
		if (nbProduit >= quantiteSouhaite) {
			nbProduit -= quantiteSouhaite;
		} else {
			nbProduit = 0;
		}
		return prixPaye;
	}
	
	public int donnerPrix() {
		return prix;
	}
	
	public String etatEtal() {
		return "";
	}

}
