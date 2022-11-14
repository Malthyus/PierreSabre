package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	public Ronin(String nom, String boissonFav, int nbArgent) {
		super(nom, boissonFav, nbArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int arg=nbArgent/10;
		perdreArgent(arg);
		parler(beneficiaire.getNom()+" prend ces "+arg+" sous.");
		beneficiaire.recevoirArgent(arg);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force=honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(nbArgent);
			perdreArgent(nbArgent);
			honneur-=1;
		}
	}
}
