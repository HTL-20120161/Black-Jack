import java.util.Random;


public class Methoden
{	
	
	
	
	public static void KartenZiehen(Karte[] stapel1,Karte[] stapel2,Karte[] stapel3,Karte[] stapel4,Karte[] stapel5,Spieler s1, Spieler s2, Spieler s3,Spieler s4 , Spieler s5)
	{
		int erg;
		String zwischenspeicher = null;
		Random rnd = new Random();
		
		
		for (int i = 0; i < 5; i++)
		{
		erg = rnd.nextInt(5);
		
		switch(erg)
		{
		case 1:
			
			int erg1,range1 = 51;
			erg1 = rnd.nextInt(range1); 
			zwischenspeicher = stapel1[erg1].wert;
			stapel1[erg1] = stapel1[range1];
			stapel1[range1] = stapel1[erg1];
			range1--;
			
			break;
		case 2:
			
			int erg2,range2 = 51;
			erg2 = rnd.nextInt(range2); 
			zwischenspeicher = stapel2[erg2].wert;
			stapel2[erg2] = stapel1[range2];
			stapel1[range2] = stapel1[erg2];
			range2--;
			
			break;
		case 3:
			
			int erg3,range3 = 51;
			erg3 = rnd.nextInt(range3); 
			zwischenspeicher = stapel3[erg3].wert;
			stapel3[erg3] = stapel3[range3];
			stapel3[range3] = stapel3[erg3];
			range3--;
			
			break;
		case 4:
			
			int erg4,range4 = 51;
			erg4 = rnd.nextInt(range4); 
			zwischenspeicher = stapel4[erg4].wert;
			stapel4[erg4] = stapel4[range4];
			stapel4[range4] = stapel4[erg4];
			range4--;
			
			break;
		case 5:
			
			int erg5,range5 = 51;
			erg5 = rnd.nextInt(range5); 
			zwischenspeicher = stapel5[erg5].wert;
			stapel5[erg5] = stapel5[range5];
			stapel5[range5] = stapel5[erg5];
			range5--;
			break;
		
		}
		if(i == 0){
		s1.karten[0] = new Karte(zwischenspeicher);
		}
		else if(i == 1)
		{
		s2.karten[0] = new Karte(zwischenspeicher);
		}
		else if(i == 2)
		{
		s3.karten[0] = new Karte(zwischenspeicher);
		}
		else if(i == 3)
		{
		s4.karten[0] = new Karte(zwischenspeicher);
		}
		else if(i == 4)
		{
		s4.karten[0] = new Karte(zwischenspeicher);
		}
		
		}
	}

}
