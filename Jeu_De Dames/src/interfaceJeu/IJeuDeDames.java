package interfaceJeu;

import jeu.*;

public interface IJeuDeDames {
	
	public static final String ROUGE = "Rouge";
	public static final String BLANC = "Blanc";
	
	/**
	 *  Permet d'obtenir le pion d'une case
	 *  
	 * @param c la case en question
	 * @return une instance Pion ou null si la case est vide
	 */
	public Pion getPion(Case c);
	
	/**
	 *  Deplace un pion d'une case dans une autre case
	 *  
	 * @param c1 la case initial du pion
	 * @param c2 la case d'arriv�e
	 */
	public void deplacerPion(Case c1, Case c2);
	
	/**
	 *  Elimine un pion se trouvant sur une case
	 *  
	 * @param c la case en question
	 */
	public void prisePion(Case c);
	
	/**
	 *  Enum�re les actions possibles qu'un pion d'une case peut effectuer
	 *  
	 * @param c la case en question
	 */
	public void actionPossible(Case c);
	
	/**
	 *  Transforme un pion en dame
	 *  
	 * @param p le pion a transformer
	 */
	public void switchToDame(Pion p);
	
	/**
	 *  Determine si un joueur a gagne
	 *  
	 * @param couleur la couleur correspondant a un joueur
	 * @return true si et seulement si le joueur correspondant a la couleur a gagne
	 */
	public boolean aGagne(String couleur);
	
	/**
	 *  Affiche l'etat du plateau
	 */
	public void affichePlateau();
}

