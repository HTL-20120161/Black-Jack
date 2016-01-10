
public class Analyse {

	public static void main(String[] args) 
	{
		Batch b = new Batch();
		Methoden m = new Methoden();
		Karte[] stapel1 = new Karte[52];
		Karte[] stapel2 = new Karte[52];
		Karte[] stapel3 = new Karte[52];
		Karte[] stapel4 = new Karte[52];
		Karte[] stapel5 = new Karte[52];
		Karte[] karten1 = new Karte[8];
		Karte[] karten2 = new Karte[8];
		Karte[] karten3 = new Karte[8];
		Karte[] karten4 = new Karte[8];
		Karte[] karten5 = new Karte[8];
		
		stapel1 = b.StapelErzeigen();
		stapel2 = b.StapelErzeigen();
		stapel3 = b.StapelErzeigen();
		stapel4 = b.StapelErzeigen();
		stapel5 = b.StapelErzeigen();
		Spieler s1 = new Spieler("Spieler",karten1);
		Spieler s2 = new Spieler("Spieler",karten2);
		Spieler s3 = new Spieler("Spieler",karten3);
		Spieler s4 = new Spieler("Spieler",karten4);
		Spieler s5 = new Spieler("Spieler",karten5);
		
		m.KartenZiehen(stapel1, stapel2, stapel3, stapel4, stapel5, s1,s2,s3,s4,s5);
		
		System.out.println("Runde 1");
		System.out.println(""+s1.position+" "+s1.karten[0].wert);
		System.out.println(""+s2.position+" "+s2.karten[0].wert);
		System.out.println(""+s3.position+" "+s3.karten[0].wert);
		System.out.println(""+s4.position+" "+s4.karten[0].wert);
	
		
		

	}

}
