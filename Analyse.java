
public class Analyse {

	public static void main(String[] args) 
	{
		Methoden m = new Methoden();
		Batch b = new Batch();
		Karte[] k = new Karte[312];
		Karte[] s1 = new Karte[4];
		Karte[] s2 = new Karte[4];
		Karte[] s3 = new Karte[4];
		Karte[] s4 = new Karte[4];
		Karte[] c = new Karte[4];
		
		k = b.StapelErzeugen();
		
		s1 = m.gezogenesArray(k);
		s2 = m.gezogenesArray(k);
		for(int i =0;i<s1.length;i++)
		{
		System.out.println(s1[i].wert);
		}
		for(int i =0;i<s2.length;i++)
		{
		System.out.println(s2[i].wert);
		}
		
		s3 = m.gezogenesArray(k);
		s4 = m.gezogenesArray(k);
		c =  m.gezogenesArray(k);
		
		Spieler spieler1 = new Spieler("Spieler",s1);
		Spieler spieler2 = new Spieler("Spieler",s2);
		Spieler spieler3 = new Spieler("Spieler",s3);
		Spieler spieler4 = new Spieler("Spieler",s4);
		Spieler croupier = new Spieler("croupier",c);
		
		System.out.println();
		
		System.out.println(""+spieler1.position+" "+""+m.summe(s1));
		System.out.println(""+spieler2.position+" "+""+m.summe(s2));
		System.out.println(""+spieler3.position+" "+""+m.summe(s3));
		System.out.println(""+spieler4.position+" "+""+m.summe(s4));
		System.out.println(""+croupier.position+" "+""+m.summe(c));
		
		
		
		
	}

}
