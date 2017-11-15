public class Tontti{
	
	
	private String nimi;
	private String osoite;
	private double pintaAla;
	
	
	public Tontti(String nimi, String osoite, double pintaAla) {
		super();
		this.nimi= nimi;
		this.osoite = osoite;
		this.pintaAla = pintaAla;
	}
	

	public void setNimi(String tonttiNimi){
		nimi = tonttiNimi;
	}
	
	public String getNimi(){
		return nimi;
	}
	
	public String getOsoite(){
		return osoite;
	}
	
	
	public void setOsoite(String tonttiOsoiteL){
		osoite = tonttiOsoiteL;
	}

	public void setPintaAla(double tonttiAla){
		pintaAla = tonttiAla;
	}
	
	public double getPintaAla(){
		return pintaAla;
	}
	
	public void tonttiPrint(){
		System.out.printf(" Tontin nimi: %s \n Osoite: %s \n Pinta-ala: %.0f \n", getNimi(), getOsoite(), getPintaAla());
	}

}