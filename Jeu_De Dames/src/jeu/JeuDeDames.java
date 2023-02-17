package jeu;

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
		
	}
	
	@Override
	public Case[] actionPossible(Case c) {
		
	}
	
	@Override
	public void switchToDame(Pion p) {
		
	}
	
	@Override
	public boolean aGagne(String couleur) {
		
	}
	
	@Override
	public void affichePlateau() {
		
	}
}

