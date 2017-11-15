public class Asukkaat {
	
	private String nimi;
	private String syntAika;
	
	
	public Asukkaat(String asukasNimi, String asukasSynt) {
		super();
		nimi = asukasNimi;
		syntAika = asukasSynt;
	}

	public String getNimi(){
		return nimi;
	}
	
	public void setNimi(String asukasNimi){
		nimi = asukasNimi;
	}
	
	public String getSyntAika(){
		return syntAika;
	}
	
	public void setSyntAika(String asukasSynt){
		syntAika = asukasSynt;
	}
	
	public void asukkaatPrint(){
		System.out.printf(" Asukkaan nimi: %s \n Asukkaan syntymäaika: %s \n", getNimi(), getSyntAika());
	}
}
