package produit;

public enum Unite {
	GRAMME("g"),
	KILOGRAMME("kg"),
	LITRE("l"),
	CENTILITRE("cl"),
	MILLILITRE("ml"),
	PIECE("pi�ce");
	
	private String unite;
	
	private Unite(String unite) {
		this.unite = unite;
	}
	
	public String getUnite() {
		return this.unite;
	}

}
