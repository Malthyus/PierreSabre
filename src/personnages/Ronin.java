package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	public Ronin(String nom, String boissonFav, int nbArgent) {
		super(nom, boissonFav, nbArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int arg=nbArgent/10;
		parler(beneficiaire.getNom()+" prend ces "+arg+" sous.");
		beneficiaire.recevoirArgent(arg);
	}
}
