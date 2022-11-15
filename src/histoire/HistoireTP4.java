package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;
public class HistoireTP4 {
	
	public static void main(String[] args) {
//		Humain prof= new Humain("Prof","kombucha",54);
//		prof.acheter("une boisson",12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		Commercant marco= new Commercant("Marco",20);
		Commercant chonin= new Commercant("Chonin",40);
		Commercant kumi= new Commercant("Kumi",10);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
		Yakuza yaku= new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		Ronin roro= new Ronin("Roro","shochu",60);
		Samourai akimoto= new Samourai("Miyamoto","Akimoto","saké",80);
//		roro.direBonjour();
//		roro.donner(marco);
//		roro.provoquer(yaku);
		marco.faireConnaissance(roro);
		marco.faireConnaissance(yaku);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
	}
}
