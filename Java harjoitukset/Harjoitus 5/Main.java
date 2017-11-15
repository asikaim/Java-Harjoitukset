import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Syötä tontin nimi: ");
		String tonttiNimi = scan.nextLine();

		
		System.out.print("Syötä tontin osoite: ");
		String osoite = scan.nextLine();
		
		
		System.out.print("Syötä tontin pinta-ala: ");
		double tonttiAla = scan.nextDouble();
		
		String rakennusTyyppi = null;
		while(rakennusTyyppi == null){
			System.out.println("Syötä rakennuksen tyyppi. (1. kerrostalo 2. rivitalo 3. omakotitalo): ");
			int valinta = scan.nextInt();
			switch(valinta){
				case 1:
					rakennusTyyppi = "kerrostalo";
					break;
				case 2:
					rakennusTyyppi = "rivitalo";
					break;
				case 3:
					rakennusTyyppi = "omakotitalo";
					break;
			}
		}
		
		System.out.println("Syötä rakennuksen pinta-ala: ");
		double rakennusAla = scan.nextDouble();
		
		
		List<Object> asunnot = new ArrayList<Object>();
		
		System.out.println("Syötä rakennuksen asuntojen lukumäärä: ");
		int rakennusAsunnot = scan.nextInt();
		for (int k = 0; k < rakennusAsunnot; k++){
			System.out.println("Syötä asunnon pinta-ala: ");
			double asunnonAla = scan.nextDouble();
			scan.nextLine();
			
			System.out.println("Syötä asunnon huoneiden lukumäärä: ");
			int rakennusHuoneet = scan.nextInt();
			scan.nextLine();
			
			System.out.println("Syötä asukkaan nimi: ");
			String asukasNimi = scan.nextLine();
			
			Asukas a = new Asukas(rakennusTyyppi, rakennusAla, rakennusAsunnot, asukasNimi, asunnonAla, rakennusHuoneet);
			asunnot.add(a);
			a.asukkaatPrint();
		}
		
		Tontti t = new Tontti(tonttiNimi, osoite, tonttiAla);
		Rakennus r= new Rakennus(rakennusTyyppi, rakennusAla, rakennusAsunnot);
		t.tonttiPrint();
		r.rakennusPrint();
		
		
	}
}
