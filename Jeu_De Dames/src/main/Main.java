package main;
import jeu.*;
import interfaceJeu.*;

public class Main {
	public static void main(String[] args) {
		Plateau p = new Plateau();
		IEtatJeu etatjeu = new EtatJeu(new JeuDeDames(p));
		
		while(! etatjeu.estFini()) {
			String x = etatjeu.prochainJoueur();
			etatjeu.tourJoueur(x);
		}
		
		if (etatjeu.aGagne(IJeuDeDames.ROUGE)) {
			etatjeu.feliciter(IJeuDeDames.ROUGE);
		}else {
			etatjeu.feliciter(IJeuDeDames.BLANC);
		}
	}
}
