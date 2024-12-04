package scenarioTest;

import personnages.Gaulois;
import produit.IProduit;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IVillage;

public class ScenarioTest {
	
	IVillage village = new IVillage() {
		
		//Il n'y a pas d'implémentation de la classe village

		@Override
		public <P extends IProduit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
			
			return false;
		}

		@Override
		public void acheterProduit(String produit, int quantiteSouhaitee) {	
		}
		
		public String toString(Etal[] marche) {
			StringBuilder sortie = new StringBuilder();
			
			for(int i = 0; i < marche.length; i++) {
				sortie.append(marche[i].etatEtal() + "\n");
			}
			
			return sortie.toString();
		}
		
	};

	public static void acheterProduit(Etal[] marche, String produit, int quantiteSouhaitee) {
		int quantiteRestante = quantiteSouhaitee;
		for (int i = 0; i < marche.length && quantiteRestante != 0; i++) {
			Etal etal = marche[i];
			int quantiteDisponible = etal.contientProduit(produit, quantiteRestante);
			if (quantiteDisponible != 0) {
				int prix = etal.acheterProduit(quantiteDisponible);
				String chaineProduit = accorderNomProduit(produit, quantiteDisponible);
				System.out.println("A l'étal n° " + (i + 1) + ", j'achete " + quantiteDisponible + " " + chaineProduit
						+ " et je paye " + prix + " sous.");
				quantiteRestante -= quantiteDisponible;
			}
		}
		String chaineProduit = accorderNomProduit(produit, quantiteSouhaitee);
		System.out.println("Je voulais " + quantiteSouhaitee + " " + chaineProduit + ", j'en ai acheté "
				+ (quantiteSouhaitee - quantiteRestante) + ".");
	}

	private static String accorderNomProduit(String produit, int quantiteSouhaitee) {
		String chaineProduit = produit;
		if (quantiteSouhaitee > 1) {
			chaineProduit = produit + "s";
		}
		return chaineProduit;
	}

	public static void main(String[] args) {
		Etal[] marche = new Etal[3];
		Gaulois ordralfabetix = new Gaulois("Ordralfab�tix",9);
		Gaulois obelix = new Gaulois("Ob�lix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		marche[0].installerVendeur(asterix, sangliersAsterix, 5);
		marche[1].installerVendeur(asterix, sangliersObelix, 5);
		marche[2].installerVendeur(ordralfabetix, poissons, 5);
		
		acheterProduit(marche, "sanglier", 3);
		
		//classe anonyme

	}

}
