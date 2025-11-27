package vezbe;

import java.util.Scanner;

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
		
	/*	int kolicina = 50;
		double cenaProizvoda = 80.99;
		double cenaBezPDV = kolicina * cenaProizvoda;
		double cenaSaPDV = cenaBezPDV * 1.2;
		
		System.out.println(String.format("%s proizvoda jedinicne cene: %s kosta %s RSD bez PDV-a"
				+ " a %s RSD sa PDV-om", 
				kolicina, cenaProizvoda, cenaBezPDV, cenaSaPDV));
		*/
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj veci od 0");
		int broj = scanner.nextInt();
		
		if(broj % 2 == 0) {
			System.out.println(String.format("Broj %s je paran!", broj));
		}else {
			System.out.println(String.format("Broj %s je neparan!", broj));
		}*/
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite koliko imate godina");
		int brojGodina = scanner.nextInt();
		
		if(brojGodina <= 12 && brojGodina >=0) {
			System.out.println("Dete");
		}
//		Logicki operator I se pise kao &&, SHIFT+7, vraca true kada su obe strane tacne
//		Logicki operator ILI se pise kao ||, SHIFT+\, vraca true kada je makar jedna strana tacna
		else if(brojGodina >= 13 && brojGodina < 20) {
			System.out.println("Tinejdzer");
		}
		else if(brojGodina >=20 && brojGodina < 65) {
			System.out.println("Odrasla osoba");
		}
		else if(brojGodina < 0) {
			System.out.println("Nevalidan unos");
		}else {
			System.out.println("Starija osoba");
		}*/
		
	/*	
//		Petlje
		for(int i = 1;i<10;i++) {
			System.out.println(i);
//			i = 1, uslov je tacan, ispis 1
//			i = 2, uslov je tacan, ispis 2
//			...
//			i = 10, uslov je netacan, zavrsava se petlja
		}
		
		int brojac = 1;
		while(brojac < 10) {
			System.out.println(brojac);
			brojac++; // Jako bitno
		}
		
		int brojac2 = 1;
		do {
			System.out.println(brojac2);
			brojac2++;
		}while(brojac2 < 10);
		*/
		
		Scanner scanner = new Scanner(System.in);
/*		System.out.println("Unesite prirodan broj");
		int brojN = scanner.nextInt();
		
//		Varijacija sa for petljom
		System.out.println("For petlja:");
		for(int i = 1; i <= brojN; i++) {
			System.out.print(i + " ");
		}
//		Varijacija sa while petljom
		System.out.println("\nWhile petlja:");
		int brojac = 1;
		while(brojac <= brojN) {
			System.out.print(brojac + " ");
			brojac++;
		}
		System.out.println("\nDruga varijacija while petlje:");
		while(brojN > 0) {
			System.out.print(brojN + " ");
			brojN--;
		}
	*/
		System.out.println("Unesite broj");
		int unetiBroj = scanner.nextInt();
		int suma = 0;
		for(int i = 1; i <= unetiBroj; i++) {
			if(i % 2 == 0) {
				suma+=i;
//				suma = suma + i;
			}
		}
		System.out.println(String.format("Suma parnih brojeva od 1 do %s je: %s",
				unetiBroj, suma));
		
		
		
		
		
		
		
		
	}

}
