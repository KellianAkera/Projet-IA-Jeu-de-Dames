package jeu;

public class Case {
	
	/**
	 * Pion pr�sent dans la case ou null si pas de pion
	 */
	private Pion p;    // pion contenu dans la case
	
	/**
	 * True si la case transforme un pion rouge en dame, false sinon
	 */
	private boolean rougeToDame;
	
	/**
	 * True si la case transforme un pion blanc en dame, false sinon
	 */
	private boolean blancToDame;
	private int ligne;
	private int colonne;    
	
	public Case(Pion p, boolean rToD, boolean bToD,int ligne , int colonne) {
		this.p = p;
		blancToDame = rToD;
		rougeToDame = bToD;
		this.ligne=ligne;
		this.colonne= colonne;
	}
	
	/**
	 *  Donne le symbole du pion ("R" ou "B") ou rien si la case est vide
	 *  
	 * @return le String "R" ou "B", ou " " si la case ne contient pas de pion
	 */
	public String affichePion() {
		if (p==null) {
			return " ";
		}
		return p.getCouleur();
	}
	
	/**
	 *  Donne le pion de la case
	 *  
	 * @return le pion ou null si la case est vide
	 */
	public Pion getPion() { 
		return p;
	}

	/**
	 * Modifie la valeur de la case
	 * 
	 * @param pion Nouvelle valeur du pion qui est dans la case
	 */
	public void setPion(Pion pion){
		p=pion;
	}

	public int getLigne(){
		return ligne;
	}

	public int getColonne(){
		return colonne;
	}
}

