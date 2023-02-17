package jeu;

public class Rouge extends Pion {
	
	/**
	 *  Compteur des pions restants du joueur Rouge
	 */
	public static int nombreRestant = 12;
	
	public Rouge() {
		super("r");
	}
	
	@Override
	public String getCouleur() {
		return couleur;
	}
}