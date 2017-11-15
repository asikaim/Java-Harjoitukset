
public class Rakennus{
	
	private double pintaAla;
	private int huoneet;

	
	public Rakennus(double rakennusAla, int rakennusHuoneet){
		pintaAla = rakennusAla;
		huoneet = rakennusHuoneet;

	}

	public Double getPintaAla(){
		return pintaAla;
	}
	
	public void setPintaAla(double rakennusAla){
		pintaAla = rakennusAla;
	}
	
	public int getHuoneet(){
		return huoneet;
	}
	
	public void setHuoneet(int rakennusHuoneet){
		huoneet = rakennusHuoneet;
	}
	
	public void rakennusPrint(){
		System.out.printf(" Huoneiden m‰‰r‰: %d \n Pinta-ala: %.0f \n", getHuoneet(), getPintaAla());
	}
}
