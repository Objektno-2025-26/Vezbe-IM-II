package vezbe;

public class AutoTestiranjeMain {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
		auto1.setMarka("Korveta");
		auto1.setUkljucen(true);
		auto1.setBrzina(120);
		
		auto2.setMarka("Golf");
		
		auto3.setMarka("BMW");
		auto3.setUkljucen(true);
		auto3.setBrzina(80);
		
		auto1.oAutu();
		auto1.ubrzaj(10);
		auto1.stani();
		auto1.oAutu();

		auto2.oAutu();
		auto2.ubrzaj(10);
		auto2.stani();
		auto2.oAutu();
		
		auto3.oAutu();
		auto3.ubrzaj(10);
		auto3.stani();
		auto3.oAutu();


	}

}
