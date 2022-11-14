package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	public Yakuza(String nom, String boissonFav, int nbArgent, String clan) {
		super(nom, boissonFav, nbArgent);
		this.clan=clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int arg=victime.seFaireExtorquer();
		gagnerArgent(arg);
		reputation++;
		parler("J’ai piqué les "+arg+" sous de "+victime.getNom()+", ce qui me fait "+nbArgent+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int arg=nbArgent;
		perdreArgent(nbArgent);
		reputation-=1;
		parler("J'ai perdu mon duel et mes "+arg+" sous, snif... J'ai déshonoré le clan de "+clan+".");
		return arg;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
}
