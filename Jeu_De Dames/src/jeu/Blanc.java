package jeu;

public class Blanc extends Pion {
	public static int nombreRestant = 12;
	
	/**
	 *  Compteur des pions restants du joueur Blanc
	 */
	public Blanc() {
		super("b");
	}
	
	@Override
	public String getCouleur() {
		return couleur;
	}
}
