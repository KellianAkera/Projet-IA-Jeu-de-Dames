package jeu;

/* A PAS OUBLIER */ 
/* Dans toutes les boucles : l = indice de ligne et pas le numero de la ligne
/*                           c = indice de la colonne et pas numero de la colonne */

public class Plateau {     
	
	/**
	 * Tableau de tableau representant le plateau
	 */
	private Case[][] plateau = new Case[8][8];
	
	public Plateau() {
		// 1ERE ET 3EME LIGNES
		for (int l = 0; l<3; l +=2) {                          // Ligne 1 et 3
			for (int c = 0; c<8; c++) {                        // Les 8 cases en horizontal
				
				if (c%2 != 0 && l == 0) {                      // Sur les emplacements impairs sur la premi�re ligne
					Rouge r = new Rouge();                     // cr�ation du pion rouge
					plateau[l][c] = new Case(r,false,true,l,c);    // Cr�ation case avec pion sur le plateau � l'emplacement [i,j] qui transforme blanc en dame
				}else if(c%2 != 0){                            // Emplacement sur la 3�me ligne
					Rouge r = new Rouge();
					plateau[l][c] = new Case(r,false,false,l,c);   // Creation case avec pion sans basique
				}else {
					plateau[l][c] = null;                      // Case vide (jamais utilis�)
				}	
			}
		}
		
		// 2EME LIGNE
		for (int c = 0; c<8; c++) {    // Sur les 8 cases en horizontal
			if (c%2 == 0) {            // Sur les emplacements pairs
				Rouge r = new Rouge();
				plateau[1][c] = new Case(r,false,false,1,c);  
			}else {
				plateau[1][c] = null;
			}
		}
		
		// 4EME ET 5EME LIGNES
		for (int l = 3; l<5; l++) {
			for (int c = 0; c<8; c++) {
				
				if (c%2 == 0 && l == 3) {                       // Emplacements pairs, 4�me ligne
					plateau[l][c] = new Case(null,false,false,l,c);
				}else if(c%2 != 0 && l == 4) {
					plateau[l][c] = new Case(null,false,false,l,c); // Emplacements pairs, 5�mes lignes
				}else {
					plateau[l][c] = null;                       // Case vide
				}
			}
		}
		
		// 6EME ET 8EME LIGNES
		for (int l = 5; l<8; l +=2) {                       // Ligne 6 et 8
			for (int c = 0; c<8; c++) {                     // 8 cases en horizontal
				
				if (c%2 == 0 && l == 7) {                   // Emplacement pair ligne 8
					Blanc b = new Blanc();
					plateau[l][c] = new Case(b,true,false,l,c); // Case qui transforme les pions rouges en Dame
				}else if(c%2 == 0){                         // Emplacement pair ligne 6
					Blanc b = new Blanc();
					plateau[l][c] = new Case(b,false,false,l,c); 
				}else {
					plateau[l][c] = null;
				}		
			}
		}
		
		// 7EME LIGNE
		for (int c = 0; c<8; c++) {       // Pour les 8 colonnes
			if (c%2 != 0) {               // Si case impair
				Blanc b = new Blanc();
				plateau[6][c] = new Case(b,false,false,6,c);  
			}else {
				plateau[6][c] = null;
			}
		}
		
	}
	
	/**
	 * Permet de connaitre l'etat du plateau
	 * @return le String representant l'etat du plateau
	 */
	public String afficheEtat() {
		
		StringBuffer t = new StringBuffer("");      // Pour incrementer les Strings et creer le plateau
		
		t.append("    |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |\n");
		t.append("-----------------------------------------------------\n");
		
		for (int l = 0; l<8; l++) {              // Pour toutes les lignes
			t.append(l+"   |");
			for (int c = 0; c<8; c++) {          // Pour toutes les colonnes
				if (plateau[l][c] == null) {     // Si la case n'est jamai utilis�
					t.append("||||||");
				} else {
					t.append("  "+plateau[l][c].affichePion()+"  |");   // Sinon on met le pion
				}
			}
			t.append("\n-----------------------------------------------------\n");
		}
		
		return t.toString();
	}

	public Case getCase(int ligne,int colonne) {
		return plateau[ligne][colonne];
	}

	public static void main(String[] args) {
		
		System.out.println(new Plateau().afficheEtat());
	}
}




