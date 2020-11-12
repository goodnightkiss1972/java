public class IP1Seance05Exercice04 {

    public static void main(String args[]) {
	int[][] essai1 = {{1,2}, {2,3}};
	System.out.println("Pour essai1 ça doit etre (true) = " + isGrilleCarree(essai1));
	afficherTableauPlat(aplatir(essai1));
	int[][] essai2 = {{1,2,3},{4,5},{6,7,8}};
	System.out.println("Pour essai2 ça doit etre (false) = " + isGrilleCarree(essai2));
	afficherTableauPlat(aplatir(essai2));
    }

    public static boolean isGrilleCarree(int tableau[][]) {
	// si le tableau a une longueur zero ou un
	//on considere qu'il n'est pas carre (on ne pourra rien faire dessus)
	if (tableau.length == 0 && tableau.length == 1) {
	    return false;
	}

	// a partir d'une taille 2 et plus on peut faire
	// la verification de forme carre
	for (int i = 0; i < tableau.length; i++) {
	    if (tableau[i].length != tableau.length) {
		return false;
	    }
	}
	return true;
    }

    public static int[] aplatir(int tableau[][]) {
	if (!isGrilleCarree(tableau)) {
	    System.out.println("Impossible d'aplatir la grille, elle n'est pas carrée.");
	    int[] retour = {-1};
	    return retour;
	}
	int[] retour = new int[tableau.length * tableau.length];
	int positionRetour = 0;
	for (int i = 0; i < tableau.length; i++) {
	    for (int j = 0; j < tableau.length; j++) {
		retour[positionRetour] = tableau[i][j];
		positionRetour++;
	    }
	}
	return retour;
    }

    public static void afficherTableauPlat(int[] tableau) {
	if (tableau.length == 0) {
	    System.out.println("Rien à afficher car le tableau est vide");
	}
	else {
	    System.out.print("[ ");
	    for (int i = 0; i < tableau.length; i++) {
		System.out.print(tableau[i]);
		if (i != tableau.length -1) {
		    System.out.print(", ");
		}
	    }
	    System.out.println(" ]");
	}
    }

}
