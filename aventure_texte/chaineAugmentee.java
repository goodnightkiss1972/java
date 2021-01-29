package aventure_texte;

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
 
public class chaineAugmentee {
	String chaineSaisie;
	List<String> listeMots = new ArrayList<String>();
	int nbMots = 0;

	// constructeur
	public chaineAugmentee(String saisie) {
		chaineSaisie = saisie;
		chaineSaisie = chaineSaisie.replace(",", " ");
		chaineSaisie = chaineSaisie.replace(".", " ");
		chaineSaisie = chaineSaisie.replace(";", " ");
		chaineSaisie = chaineSaisie.replace("'", " ");
		decoupeMots();
	}

	public void decoupeMots() {
		StringTokenizer st = new StringTokenizer(chaineSaisie, " ", false);
		//System.out.println("Les mots: " + st.countTokens());
		while (st.hasMoreTokens()) {
			//System.out.println(st.nextToken());
			listeMots.add(st.nextToken());
			nbMots++;
		}
	}

	public void afficheMots() {
		for (String mot: listeMots) {
			System.out.format("#" + mot + "#");
		}
		System.out.format("%n");
	}
}
