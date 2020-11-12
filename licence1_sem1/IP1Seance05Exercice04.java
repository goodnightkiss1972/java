public class IP1Seance05Exercice04 {

    public static void main(String args[]) {
	int[][] essaiKo1 = {{1,2,3},{4,5},{6,7,8}};
	System.out.println("ça doit etre (false) = " + carre(essaiKo1));
	afficherTableauPlat(aplatir(essaiKo1));
	int[][] essaiKo2 = {{1,2}, {2,3}};
	System.out.println("ça doit etre (false) = " + carre(essaiKo2));
	afficherTableauPlat(aplatir(essaiKo2));
	int[][] essaiKo3 = {{10,2,3},{4,5,6},{7,8,9}};
	System.out.println("ça doit etre (false) = " + domaine(aplatir(essaiKo3)));
	int[][] essaiKo4 = {{1,2,30},{4,5,6},{7,8,9}};
	System.out.println("ça doit etre (false) = " + domaine(aplatir(essaiKo4)));
	int[][] essaiKo5 = {{1,2,3},{40,5,6},{7,8,9}};
	System.out.println("ça doit etre (false) = " + domaine(aplatir(essaiKo5)));
	int[][] essaiKo6 = {{1,2,3},{4,5,6},{7,8,90}};
	System.out.println("ça doit etre (false) = " + domaine(aplatir(essaiKo6)));
	int[][] essaiOk7 = {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("ça doit etre (true) = " + domaine(aplatir(essaiOk7)));
	System.out.println("Est ce que essaiOk7 a bien ses elements differents ? normalement (true) = " + differents(aplatir(essaiOk7)));
	int[][] essaiKo8 = {{1,2,1},{4,5,6},{7,8,9}};
	System.out.println("Est ce que essaiOk7 a bien ses elements differents ? normalement (false) = " + differents(aplatir(essaiKo8)));
	int[][] essaiKo9 = {{1,2,1},{4,5,6},{7,8,9}};
	System.out.println("Est ce que essaiOk7 a bien ses elements differents ? normalement (false) = " + differents(aplatir(essaiKo9)));
	int[][] essaiKo10 = {{1,2,3},{4,1,6},{7,8,9}};
	System.out.println("Est ce que essaiOk7 a bien ses elements differents ? normalement (false) = " + differents(aplatir(essaiKo10)));
	int[][] essaiKo11 = {{1,2,3},{4,5,6},{7,8,1}};
	System.out.println("Est ce que essaiOk7 a bien ses elements differents ? normalement (false) = " + differents(aplatir(essaiKo11)));
    }

    public static boolean carre(int tableau[][]) {
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
	if (!carre(tableau)) {
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

    public static boolean domaine(int[] tableau) {
	if (tableau.length == 0) {
	    return false;
	}
	for (int i = 0; i < tableau.length; i++) {
	    if (tableau[i] < 1 || tableau[i] > tableau.length) {
		return false;
	    }
	}
	return true;
    }

    public static boolean differents(int[] tableau) {
	if (tableau.length == 0 || tableau.length == 1) {
	    return true;
	}
	int present = 0;
	for (int i = 0; i < tableau.length; i++) {
	    for (int j = 0; j < tableau.length; j++) {
		if (tableau[j] == tableau[i]) {
		    present++;
		}
	    }
	    if (present > 1) {
		return false;
	    }
	    else {
		present = 0;
	    }
	}
	return true;
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
