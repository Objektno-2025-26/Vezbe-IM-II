package vezbe;

public class Vezbe2 {

	public static void main(String[] args) {
//		int broj = 20;
//		double decimalniBroj = 20.5;
//		String tekst = "Ovo je vas prvi string!";
//			
//		System.out.println(broj);
//		broj = 55;
//		System.out.println(broj);
//		broj = 32;
//		System.out.println(String.format("Obican broj je: %s\nDecimalni broj je: %s"
//				+ "\nTekstualni zapis je: %s",
//				broj,decimalniBroj,tekst));
		
		int kolicina = 50;
		double cenaProizvoda = 80.99;
		double cenaBezPDV = kolicina * cenaProizvoda;
		double cenaSaPDV = cenaBezPDV * 1.2;
		
		System.out.println(String.format("%s proizvoda jedinicne cene: %s kosta %s RSD bez PDV-a"
				+ " a %s RSD sa PDV-om", 
				kolicina, cenaProizvoda, cenaBezPDV, cenaSaPDV));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
