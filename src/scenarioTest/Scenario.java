package scenarioTest;

import personnages.Gaulois;
import produit.IProduit;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IVillage;

public class Scenario {

	public static void main(String[] args) {/*
		IVillage village = new IVillage() {
			

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


		Etal[] marche = new Etal[3];
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		etalSanglierObelix.installerVendeur( obelix, sangliersObelix, 10);
		etalSanglierAsterix.installerVendeur( asterix, sangliersAsterix, 8);
		etalPoisson.installerVendeur(ordralfabetix, poissons, 5);
		
		System.out.println(etalSanglierAsterix.etatEtal());
		System.out.println(etalSanglierObelix.etatEtal());
		System.out.println(etalPoisson.etatEtal());
		
		System.out.println("A l'étal n°1, j'achète 2 sanglier pour " + etalSanglierAsterix.acheterProduit(2));
		System.out.println("A l'étal n°2, j'achète 1 sanglier pour " + etalSanglierObelix.acheterProduit(1));
		
		System.out.println(etalSanglierAsterix.etatEtal());
		System.out.println(etalSanglierObelix.etatEtal());
//
//		System.out.println(village);
//
//		village.acheterProduit("sanglier", 3);
//
//		System.out.println(village); */
	}

}
