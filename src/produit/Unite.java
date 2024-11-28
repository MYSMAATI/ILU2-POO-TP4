package produit;

public enum Unite {
	GRAMME("g"),
	KILOGRAMME("kg"),
	LITRE("l"),
	CENTILITRE("cl"),
	MILLILITRE("ml"),
	PIECE("pièce");
	
	private String unite;
	
	private Unite(String unite) {
		this.unite = unite;
	}
	
	public String getUnite() {
		return this.unite;
	}

}
