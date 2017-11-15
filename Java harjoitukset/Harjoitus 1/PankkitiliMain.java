package vt1_Asikainen;
import java.util.Scanner;

public class PankkitiliMain {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String [] args){

	String tiliOmistaja;
	String tilinumero;
	double saldo;
	double otto;
	double talletus;
	
	System.out.println("Syötä tilin omistajan nimi: ");
	tiliOmistaja = scan.nextLine();
	
	System.out.println("Syötä tilinumero: ");
	tilinumero = scan.nextLine();
	
	System.out.println("Syötä tilin saldo: ");
	saldo = scan.nextDouble();
	
	Pankkitili tili = new Pankkitili(tiliOmistaja, tilinumero, saldo);
	
	tili.tiliTiedot();
	
	System.out.println("Syötä otettava rahamäärä: ");
	otto = scan.nextDouble();
	tili.tiliOtto(otto);
	
	tili.tiliTiedot();
	
	System.out.println("Syötä talletettava rahamäärä: ");
	talletus = scan.nextDouble();
	tili.tiliTalletus(talletus);
	
	tili.tiliTiedot();
		
	}
	
	
}
