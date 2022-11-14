package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int nbArgent) {
		super(nom, "thé", nbArgent);
	}
	
	public int seFaireExtorquer() {
		int res = nbArgent;
		perdreArgent(nbArgent);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return res;
	}
	
	public void recevoirArgent(int arg) {
		gagnerArgent(arg);
		parler(arg+" sous! Je te remercie généreux donateur	");
	}
	
}
