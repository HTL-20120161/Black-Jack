
public class Batch 
{
	static Karte[] spielKarten = new Karte[312];
	
	public static Karte[] StapelErzeugen () 
	{
		int j =0;
		int k =2;
		
		for(int i =0; i < spielKarten.length; i++ )
		{
			if (j > 51 ){j=0;}
			
			if(k > 10){k=2;}
			
			if( j == 9)
			{
				spielKarten[i] = new Karte( "B");
			}
			else if ( j ==10)
			{
				spielKarten[i]= new Karte( "D");
			}
			else if ( j ==11)
			{
				spielKarten[i]= new Karte( "K");
			}
			else if ( j ==12)
			{
				spielKarten[i]= new Karte( "A");
			}
			else if ( j ==22)
			{
				spielKarten[i]= new Karte( "B");
			}
			else if ( j ==23)
			{
				spielKarten[i]= new Karte( "D");
			}
			else if ( j ==24)
			{
				spielKarten[i]= new Karte( "K");
			}
			else if ( j ==25)
			{
				spielKarten[i]= new Karte( "A");
			}
			else if ( j ==35)
			{
				spielKarten[i] = new Karte ("B");
			}
			else if ( j ==36)
			{
				spielKarten[i]= new Karte ("D");
			}
			else if ( j ==37)
			{
				spielKarten[i]= new Karte ("K");
			}
			else if ( j ==38)
			{
				spielKarten[i]= new Karte ("A");
			}
			else if ( j ==48)
			{
				spielKarten[i]= new Karte ("B");
			}
			else if ( j ==49)
			{
				spielKarten[i]= new Karte ("D");
			}
			else if ( j ==50)
			{
				spielKarten[i]= new Karte ("K");
			}
			else if ( j ==51)
			{
				spielKarten[i]= new Karte ("A");	
			}
			else
			{
				spielKarten[i] = new Karte( ""+k);
			}
			    j++;
			    k++;
		}
		return spielKarten;
		
	}
}
