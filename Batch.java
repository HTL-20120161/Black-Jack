
public class Batch 
{
	static Karte[] stapel = new Karte[52]; 
	
	public static Karte[] StapelErzeigen()
	{
		
		int j = 2;
		
		for (int i = 0; i< 13; i++)
		{
			if(i == 9){stapel[9] = new Karte("B");}
			else if (i == 10){stapel[10] = new Karte("D");}
			else if (i == 11){stapel[11] = new Karte("K");}
			else if (i == 12){stapel[12] = new Karte("A");}
			else {stapel[i] = new Karte (""+j);}
			j++;	
		}
		j =2;
		for (int i = 13; i< 26; i++)
		{
			if(i == 22){stapel[22] = new Karte("B");}
			else if (i == 23){stapel[23] = new Karte("D");}
			else if (i == 24){stapel[24] = new Karte("K");}
			else if (i == 25){stapel[25] = new Karte("A");}
			else {stapel[i] = new Karte (""+j);}
			j++;	
		}
		j =2;
		for (int i = 26; i< 39; i++)
		{
			if(i == 35){stapel[35] = new Karte("B");}
			else if (i == 35){stapel[35] = new Karte("D");}
			else if (i == 35){stapel[35] = new Karte("K");}
			else if (i == 35){stapel[35] = new Karte("A");}
			else {stapel[i] = new Karte (""+j);}
			j++;	
		}j =2;
		for (int i = 39; i< 52; i++)
		{
			if(i == 48){stapel[48] = new Karte("B");}
			else if (i == 49){stapel[49] = new Karte("D");}
			else if (i == 50){stapel[50] = new Karte("K");}
			else if (i == 51){stapel[51] = new Karte("A");}
			else {stapel[i] = new Karte (""+j);}
			j++;	
		}
		return stapel;
	}

}
