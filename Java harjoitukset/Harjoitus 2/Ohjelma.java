import java.util.Scanner;

public class Ohjelma {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Syötä tontin nimi: ");
		String tonttiNimi = scan.nextLine();

		
		System.out.print("Syötä tontin sijainnin pituus: ");
		String sijaP = scan.nextLine();


		System.out.print("Syötä tontin sijainnin leveys: ");
		String sijaL = scan.nextLine();
		
		
		System.out.print("Syötä tontin pinta-ala: ");
		double tonttiAla = scan.nextDouble();

		
		System.out.println("Syötä rakennuksen pinta-ala: ");
		double rakennusAla = scan.nextDouble();
		
		System.out.println("Syötä rakennuksen huoneiden lukumäärä: ");
		int rakennusHuoneet = scan.nextInt();
		
		System.out.println("Syötä asukkaan nimi: ");
		String asukasNimi = scan.nextLine();
		
		System.out.println("Syötä asukkaan syntymäaika: ");
		String asukasSynt = scan.nextLine();
		
		Tontti Tontti = new Tontti(tonttiNimi, sijaP, sijaL, tonttiAla);
		Asukkaat Asukkaat = new Asukkaat(asukasNimi, asukasSynt);
		Rakennus Rakennus = new Rakennus(rakennusAla, rakennusHuoneet);
		Tontti.tonttiPrint();
		Rakennus.rakennusPrint();
		Asukkaat.asukkaatPrint();
		
	}
}
