package jeu;

import java.util.ArrayList;
import java.util.List;

import interfaceJeu.*;


public class JeuDeDames implements IJeuDeDames {
	
	/**
	 *  Plateau de jeu
	 */
	private Plateau plateau;
	
	public JeuDeDames(Plateau p) {
		plateau=p;
	}
	
	@Override
	public Pion getPion(Case c) {
		return c.getPion();
	}
	
	@Override
	public void deplacerPion(Case c1, Case c2) {
		c2.setPion(c1.getPion());
		c1.setPion(null);
	}
	
	@Override
	public void prisePion(Case c) {
		c.setPion(null);
	}

	

	/**
	 * Fonction qui renvoie true si la case existe
	 * @param ligne ligne de la case en question
	 * @param colonne collone de la ligne en question
	 * @return true si la case est libre
	 */
	private boolean caseExist(int ligne,int colonne){
		if (ligne < 0 || ligne > 7 || colonne < 0 || colonne > 7 ){
			return false;
		}
		return true;
	}

	@Override
	public List<Action> actionPossibleBlanc(Case cD) {

		List<Action> liste = new ArrayList<Action>();
		int ligne = cD.getLigne();
		int colonne = cD.getColonne();
		int i= -1;
		while(i != 3){
			if(caseExist(ligne-1, colonne+i)){
				Case c=plateau.getCase(ligne-1,colonne+i);
				if(c.isVide()){
					liste.add(new Action(cD, c));
				}else{
					if (c.isRouge() && caseExist(ligne -2, colonne + i*2) ){
						if (plateau.getCase(ligne -2, colonne + i*2).isVide()) {
							
						}

					}

				}
			}
			i+=2;
		}
		return liste;
	}


	@Override
	public List<Action> actionPossibleRouge(Case c) {
		// TODO 
	}

	@Override
	public void switchToDame(Pion p) {
		p.setToDame();
	}
	
	@Override
	public boolean aGagne(String couleur) {
		
	}

	@Override
	public void affichePlateau() {
		this.plateau.afficheEtat();
	}
	
}

