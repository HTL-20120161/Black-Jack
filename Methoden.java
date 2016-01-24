import java.util.Random;


public class Methoden
{	
		
	 static Karte[] hand = new Karte[4];
	
	public static Karte[] gezogenesArray(Karte[] stapel)
	{ 
		int range = stapel.length-1;
		int zufall = stapel.length;
		
		for (int i = 0; i< hand.length; i++ )
		{
			 int erg = (int) (Math.random()*zufall);
			Karte zwischen;
			zwischen = stapel[erg];
			stapel[erg] = stapel[range];
			stapel[range] = zwischen;
			hand[i] = stapel[range];
			range --;
			zufall--;
			
		}
		return hand;
		
	}

	public static int summe (Karte[] spielerArray)
	{
		int erg = 0, zwischenInINT = 0,ergDavor = 0;
		String zwischen;
		
		for (int i = 0; i< spielerArray.length;i++ )
		{
			zwischen = spielerArray[i].wert;
			
			if( (zwischen.equals( "10")) ||( zwischen.equals("D")) ||( zwischen.equals("B")) ||(zwischen.equals("K"))||( zwischen.equals("A")))
			{
				zwischenInINT = 10;
			}
			else if(zwischen.equals("2"))
			{
				zwischenInINT = 2;
			}
			else if(zwischen.equals("3"))
			{
				zwischenInINT = 3;
			}
			else if(zwischen.equals("4"))
			{
				zwischenInINT = 4;
			}
			else if(zwischen.equals("5"))
			{
				zwischenInINT = 5;
			}
			else if(zwischen.equals("6"))
			{
				zwischenInINT = 6;
			}
			else if(zwischen.equals("7"))
			{
				zwischenInINT = 7;
			}
			else if(zwischen.equals("8"))
			{
				zwischenInINT = 8;
			}
			else if(zwischen.equals("9"))
			{
				zwischenInINT = 9;
			}
			
			erg = zwischenInINT + ergDavor; 
		ergDavor = erg;
			
		}
		
		
		return erg;
	}
}
