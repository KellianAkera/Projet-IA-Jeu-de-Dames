package jeu;

import java.util.Scanner;
import interfaceJeu.*;
import jeu.*;

public class EtatJeu implements IEtatJeu{
	
	/**
	 * Plateau de jeu
	 */
	private IJeuDeDames jeuDeDames;
	
	/**
	 * Indique le prochain joueur qui doit jouer
	 */
	private String prochainJoueur;
	
	/**
	 * Pour les interactions avec les joueurs
	 */
	private Scanner sc;
	
	public EtatJeu(IJeuDeDames jeuDeDames) {
		this.jeuDeDames = jeuDeDames;
		prochainJoueur = IJeuDeDames.BLANC;
		sc = new Scanner(System.in);
	}
	
	@Override
	public boolean estFini() {
		
	}
	
	@Override
	public String prochainJoueur() {
		
	}
	
	@Override
	public void tourJoueur(String couleur) {
		
	}
	
	@Override
	public boolean aGagne(String couleur) {
		
	}
	
	@Override
	public void feliciter(String couleur) {
		
	}
}

