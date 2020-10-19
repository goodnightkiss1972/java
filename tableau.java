public class tableau {

    static String param1;
    
    public static void main (String args[]) {
	// Gestion d'un parametre optionel "trace"
	if (args.length == 0) {
	    tableau.param1 = "none";
	}
	else {
	    tableau.param1 = args[0];
	}
	System.out.println(tableau.param1);

	int[] tab1 = {4, 5, 1, 2, 3, 4, 0, -3, 2};
	afficheTableau(tab1);
	tab1 = permuteTableauParIndice(tab1, 2, 5);
	tab1 = permuteTableauParIndice(tab1, 7, 1);
	afficheTableau(tab1);

	int[] tab2 = new int[9];
	afficheTableau(tab2);

	afficheTableau(tab1);
	triBulleTableauIntegerAsc(tab1);
	afficheTableau(tab1);
	triBulleTableauIntegerDesc(tab1);
	afficheTableau(tab1);
	
    }

    static int[] triBulleTableauIntegerAsc(int[] tab) {
	if (tab.length == 0)
	    return tab;
	int permutation = 9999;
	int totalPermutations = 0;
	while (permutation > 0) {
	    permutation = 0;
	    for (int i=0; i < tab.length -1; i++) {
		if (tab[i] > tab[i+1]) {
		    permuteTableauParIndice(tab, i, i+1);
		    permutation++;
		    totalPermutations++;
		}
	    }
	}
	if (tableau.param1.equals("trace")) {
	    System.out.println("Tri terminé : " + totalPermutations + " permutations effectuées.");
	}
	return tab;
    }

    static int[] triBulleTableauIntegerDesc(int[] tab) {
	if (tab.length == 0)
	    return tab;
	int permutation = 9999;
	int totalPermutations = 0;
	while (permutation > 0) {
	    permutation = 0;
	    for (int i=0; i < tab.length -1; i++) {
		if (tab[i] < tab[i+1]) {
		    permuteTableauParIndice(tab, i, i+1);
		    permutation++;
		    totalPermutations++;
		}
	    }
	}
	if (tableau.param1.equals("trace")) {
	    System.out.println("Tri terminé : " + totalPermutations + " permutations effectuées.");
	}
	return tab;
    }


    static void afficheTableau(int[] tab) {
	if (tab.length == 0) {
	    System.out.println("Le tableau est vide.");
	}
	else {
	    System.out.print("[ ");
	    for(int i=0; i < tab.length; i++) {
		System.out.print(tab[i]);
		if (i == tab.length -1) {
		    System.out.print(" ");
		}
		else {
		    System.out.print(", ");
		}
	    }
	    System.out.print(" ]\n");
	}
    }

    static int[] permuteTableauParIndice(int[] tab, int indice1, int indice2) {
	if ((tab.length < 2) || (indice1 == indice2) || (indice1 >= tab.length) || (indice2 >= tab.length)  || (indice1
														* indice2 < 0)) {
		// Impossible de permuter, le tableau n'a pas au moins deux elements.
		// ou bien les indices sont egaux et alors il n'y a rien a faire.
		return tab;
	}
	int temp = tab[indice2];
	tab[indice2] = tab[indice1];
	tab[indice1] = temp;
	return tab;
    }

}
