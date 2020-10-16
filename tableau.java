public class tableau {

    public static void main (String args[]) {
	int[] tab1 = {4, 5, 1, 2, 3, 4, 0, -3, 2};
	afficheTableau(tab1);
	tab1 = permuteTableauParIndice(tab1, 2, 5);
	afficheTableau(tab1);
    }

    static int[] triTableauInteger(int[] tab) {
	if (tab.length == 0)
	    return tab;
	int[] tabTrie = new int[tab.length];
	return tabTrie;

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
	if ((tab.length < 2) || (indice1 == indice2) || (indice1 >= tab.length) || (indice2 >= tab.length)) {
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
