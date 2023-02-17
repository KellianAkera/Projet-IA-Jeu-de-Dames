package jeu;

public abstract class Pion {
	
	/**
	 *  Couleur du pion 
	 */
	protected String couleur;
	
	/**
	 *  False si le pion n'est pas une dame, True sinon
	 */
	private boolean dame = false;
	
	public Pion(String c) {
		couleur = c;
	}
	
	/**
	 * Donne la couleur du pion ("R" ou "B")
	 * 
	 *  @return "R" si le pion est rouge, "B" si le pion est blanc
	 */
	public abstract String getCouleur();
	
	/**
	 * Tranformme le pion en Dame
	 */
	public void setToDame(){
		dame=true;
		couleur=couleur.toUpperCase();
	}
	
}
