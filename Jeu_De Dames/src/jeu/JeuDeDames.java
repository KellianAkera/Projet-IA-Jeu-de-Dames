package jeu;

import java.util.ArrayList;
import java.util.List;

import interfaceJeu.*;
import jeu.*;

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
	
	@Override
	public List<Case> actionPossible(Case c) {
		List<Case> liste = new ArrayList<Case>();
		String couleur = c.getPion().couleur;
		Case[][] plateau=plateau.getPlateau;
		
		if (couleur.equals("b") || couleur.equals("B")) {
			if(plateau[][])
		}else{

		}
		return liste;
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

