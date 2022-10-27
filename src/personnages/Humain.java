package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int nbArgent;
	public Humain(String nom, String boissonFav, int nbArgent) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.nbArgent = nbArgent;
	}
	public String getNom() {
		return nom;
	}
	public int getNbArgent() {
		return nbArgent;
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFav+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (nbArgent>=prix) {
			parler("J'ai "+nbArgent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à"+prix+" sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+nbArgent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");
		}
	}
	
	private void perdreArgent(int perte) {
		nbArgent-=perte;
	}
	
	public void gagnerArgent(int gain) {
		nbArgent+=gain;
	}
	
	private void parler(String texte) {
		System.out.println(texte);
	}
}
