
public class Analyse {

	public static void main(String[] args) 
	{
		
		Batch b = new Batch();
		Karte[] Stapel1 = new Karte[52];
		
		 Stapel1 = b.kartenErzeugen();
		 
		 for(int i = 0; i>Stapel1.length; i++)
		 {
			 System.out.println(Stapel1[i]);
		 }
		
		

	}

}
