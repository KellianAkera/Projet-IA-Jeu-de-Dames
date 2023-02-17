package interfaceJeu;

public interface IEtatJeu {
	/**
	 *  Indique si le jeu est fini 
	 * @return true si et seulement si le jeu est fini
	 */
	public boolean estFini();
	
	/**
	 *  Determine quel est le prochain joueur
	 * @return la couleur du joueur qui doit joueur
	 */
	public String prochainJoueur();
	
	/**
	 *  Effectue le tour d'un joueur
	 * @param couleur la couleur du joueur qui doit jouer
	 */
	public void tourJoueur(String couleur);
	
	/**
	 *  Indique si un joueur a gagne le jeu
	 *  
	 * @param couleur le joueur qui doit être testé
	 * @return true si et seulement si le joueur couleur a gagne le jeu
	 */
	public boolean aGagne(String couleur);
	
	/**
	 *  Permet de feliciter le joueur gagnant
	 * @param couleur le gagnant de la partie
	 */
	public void feliciter(String couleur);
	
	
}
