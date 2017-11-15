package vt1_Asikainen;

public class Pankkitili {

	private String tilinumero;
	private String tiliOmistaja;
	private double saldo;
	
	public Pankkitili(String tilinumero_par, String tiliOmistaja_par, double saldo_par) {
		super();
		this.tilinumero = tilinumero_par;
		this.tiliOmistaja = tiliOmistaja_par;
		this.saldo = saldo_par;
	}

	public String getTilinumero() {
		return tilinumero;
	}

	public void setTilinumero(String tilinumero_par) {
		this.tilinumero = tilinumero_par;
	}

	public String getTiliOmistaja() {
		return tiliOmistaja;
	}

	public void setTiliOmistaja(String tiliOmistaja_par) {
		this.tiliOmistaja = tiliOmistaja_par;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo_par) {
		this.saldo = saldo_par;
	}
	
	public double tiliOtto(double otto){
		if(otto <= saldo && otto >= 0){
			this.saldo = saldo - otto;
		}else{
			System.out.println("Tilillä ei tarpeeksi rahaa tai syötit negatiivisen luvun");
		}
		return saldo;
	}
	
	public double tiliTalletus(double talletus){
		if(talletus >= 0){
			this.saldo = saldo + talletus;
		}else{
			System.out.println("Syötit negatiivisen luvun");
		}
		return saldo;
	}
	
	public void tiliTiedot(){
		System.out.printf(" Tilin omistaja: %s \n Tilinumero: %s \n Tilin saldo:%.2f \n", tiliOmistaja, tilinumero ,saldo);
	}
	
}
