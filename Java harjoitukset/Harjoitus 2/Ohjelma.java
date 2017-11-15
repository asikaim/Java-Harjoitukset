import java.util.Scanner;

public class Ohjelma {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sy�t� tontin nimi: ");
		String tonttiNimi = scan.nextLine();

		
		System.out.print("Sy�t� tontin sijainnin pituus: ");
		String sijaP = scan.nextLine();


		System.out.print("Sy�t� tontin sijainnin leveys: ");
		String sijaL = scan.nextLine();
		
		
		System.out.print("Sy�t� tontin pinta-ala: ");
		double tonttiAla = scan.nextDouble();

		
		System.out.println("Sy�t� rakennuksen pinta-ala: ");
		double rakennusAla = scan.nextDouble();
		
		System.out.println("Sy�t� rakennuksen huoneiden lukum��r�: ");
		int rakennusHuoneet = scan.nextInt();
		
		System.out.println("Sy�t� asukkaan nimi: ");
		String asukasNimi = scan.nextLine();
		
		System.out.println("Sy�t� asukkaan syntym�aika: ");
		String asukasSynt = scan.nextLine();
		
		Tontti Tontti = new Tontti(tonttiNimi, sijaP, sijaL, tonttiAla);
		Asukkaat Asukkaat = new Asukkaat(asukasNimi, asukasSynt);
		Rakennus Rakennus = new Rakennus(rakennusAla, rakennusHuoneet);
		Tontti.tonttiPrint();
		Rakennus.rakennusPrint();
		Asukkaat.asukkaatPrint();
		
	}
}
