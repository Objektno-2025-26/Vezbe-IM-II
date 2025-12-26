package vezbe;

public class Auto {

	private int brzina;
	private String marka;
	private boolean ukljucen;
	
	public Auto() {
		
	}
	
	public Auto(int brzina, String marka) {
		this.brzina = brzina;
		this.marka = marka;
	}
	
	public Auto(int brzina, String marka, boolean ukljucen) {
		this(brzina,marka);
		this.ukljucen = ukljucen;
	}

	public void ubrzaj(int brzina) {
		if (ukljucen)
			this.brzina += brzina;
		return;
	}

	public void stani() {
		if (ukljucen) {
			if (brzina < 50)
				System.out.println("Auto je zaustavljen za 4 sekunde!");
			else if (brzina >= 50 && brzina <= 100)
				System.out.println("Auto je zaustavljen za 8 sekundi!");
			else if (brzina > 100)
				System.out.println("Auto je zaustavljen za 12 sekundi!");
		}
		return;
	}

	public void oAutu() {
		System.out.println(String.format("Auto marke: %s, je trenutno %s"
//				Koristimo unarni operator ? za cistiji uslov, ukoliko je ukljucen true 
//				onda se koristi prvi string nakon upitnika a u suprotnom prazan string posle :
				+ (ukljucen ? " i krece se brzinom od: %s km/h" : ""),
//				Slicnu stvar radimo i sa listom argumenata, gde se vraca string uklucen/iskljucen 
//				u zavisnosti od vrednosti atributa ukljucen koji moze biti true/false
				marka, ukljucen ? "ukljucen" : "iskljucen", brzina));
	}
	
	@Override
	public String toString() {
		return String.format("Objekat klase Auto, marke: %s, koji je trenutno %s"
				+ (ukljucen ? " i krece se brzinom od: %s km/h" : ""), 
				marka, ukljucen ? "ukljucen" : "iskljucen", brzina);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Auto) {
			Auto temp = (Auto)o;
			if(marka == temp.getMarka()) return true;
		}
		return false;
	}
	

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public boolean isUkljucen() {
		return ukljucen;
	}

	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}

}
