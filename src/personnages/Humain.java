package personnages;

import java.util.Iterator;

public class Humain {
	private static final int NB_CONNAISSANCE_MAX=30;
	private String nom;
	private String boissonFav;
	protected int nbArgent;
	protected int nbConnaissance=0;
	protected Humain[] memoire= new Humain[NB_CONNAISSANCE_MAX];
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
	
	protected void perdreArgent(int perte) {
		nbArgent-=perte;
	}
	
	protected void gagnerArgent(int gain) {
		nbArgent+=gain;
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+")-"+texte);
	}
	
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance<NB_CONNAISSANCE_MAX) {
			memoire[nbConnaissance]=autreHumain;
			nbConnaissance++;
		} else {
			int i=0;
			while (i<NB_CONNAISSANCE_MAX-1) {
				memoire[i]=memoire[i+1];
				i++;
			}
			memoire[i]=autreHumain;
		}
		
	}
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
		
	}
	
	public void listerConnaissance() {
		String texte= "Je connais beaucoup de monde dont:";
		for (int i = 0; i < nbConnaissance-1; i++) {
			texte+=memoire[i].getNom()+",";
		}
		if (nbConnaissance!=0) {
			texte+=memoire[nbConnaissance-1].getNom();
		}
		parler(texte);
	}
}
