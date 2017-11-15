
public class Rakennus{
	private double pintaAla;
	private int asunnot;
	private String taloTyyppi;
	
	public Rakennus(String taloTyyppi, double pintaAla, int asunnot){
		this.taloTyyppi = taloTyyppi;
		this.pintaAla = pintaAla;
		this.asunnot = asunnot;

	}
	
	public String getTaloTyyppi() {
		return taloTyyppi;
	}
	
	public void setTaloTyyppi(String rakennusTyyppi) {
		taloTyyppi = rakennusTyyppi;
	}

	public Double getPintaAla(){
		return pintaAla;
	}
	
	public void setPintaAla(double rakennusAla){
		pintaAla = rakennusAla;
	}
	
	public int getAsunnot() {
		return asunnot;
	}
	
	public void setAsunnot(int rakennusAsunnot){
		asunnot = rakennusAsunnot;
	}
	
	public void rakennusPrint(){
		System.out.printf("Rakennuksen tyyppi: %s \nAsunnot: %d \n Pinta-ala: %.0f \n",getTaloTyyppi(), getAsunnot(), getPintaAla());
	}
}
