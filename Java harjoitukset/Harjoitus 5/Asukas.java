public class Asukas extends Rakennus{
	
	private String nimi;
	private double asunnonPAla;
	int huoneet;
	
	
	public Asukas(String taloTyyppi, double pintaAla, int asunnot, String nimi, double asunnonAla, int huoneet){
		super(taloTyyppi, pintaAla, asunnot);
		this.nimi = nimi;
		this.asunnonPAla = asunnonAla;
		this.huoneet = huoneet;
	}

	public String getNimi(){
		return nimi;
	}
	
	public void setNimi(String asukasNimi){
		nimi = asukasNimi;
	}
	
	public double getAsunnonAla(){
		return asunnonPAla;
	}
	
	public void setAsunnonAla(double asunnonAla){
		asunnonPAla = asunnonAla;
	}
	
	public int getHuoneet(){
		return huoneet;
	}
	
	public void setHuoneet(int rakennusHuoneet){
		huoneet = rakennusHuoneet;
	}
	
	public void asukkaatPrint(){
		System.out.printf(" Asukkaan nimi: %s \n Asunto: %d \n Huoneiden m‰‰r‰: %d Asunnon pinta-ala: %0.f \n", getNimi(), getAsunnot(), getHuoneet(), getAsunnonAla());
	}
}
