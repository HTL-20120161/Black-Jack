
public class Spieler 
{
	String position;
	Karte[] karten = new Karte[8];
	
	Spieler(){}
	
	Spieler(String position, Karte[] karten)
	{
		this.karten = karten;
		this.position = position;
	}

	//getters und setters
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Karte[] getKarten() {
		return karten;
	}

	public void setKarten(Karte[] karten) {
		this.karten = karten;
	}
	

	
	

}
