package geometry;

public class Main {

	public static void main(String[] args) {
		/*
//		Primitivni tip podatka - value type
		int broj = 20;
//		Slozeni tip podatka - reference type
		Point p1 = new Point();
		System.out.println(broj);
		System.out.println(p1);
//		p1.x = 55;
		p1.setX(55);
		System.out.println(p1.getX());
		p1.setSelected(true);;
		System.out.println(p1.isSelected());
		
		p1.setY(broj);
		broj = 33;
//		System.out.println(p1.y);
		
		Point p2 = new Point();
//		Prva situacija, primitiv u primitiv
		p2.setY(p1.getY());
		p1.setY(66);
		System.out.println(p2.getY());
//		Druga situacija, referenca u referencu
		p2 = p1;
		p2.setX(22);
		p1.setY(99); 
		System.out.println(p2.getY());
		System.out.println(p1.getY());
		*/
		
//		Vezbe 5
		Point p1 = new Point();
		Point p2 = new Point();
		Line l1 = new Line();
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
//		Atributu startPoint se dodeljuje referenca p1, nakon cega te dve reference pokazuju
//		na isti objekat. Ista prica je i za endPoint i p2
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		
//		startPoint i p1 sada pokazuju na isti objekat i to je vidljivo u ispisu na konzoli
		System.out.println(l1.getStartPoint());
		System.out.println(p1);
		
//		Promena vrednosti x ili y vrednosti tog objekta je moguca kroz i jednu i drugu referencu
//		Sustinski, u ovom trenutku, p1 i startPoint pokazuju na isti objekat i getX() i getY() kroz
//		bilo koju referencu ce uvek vratiti isti rezultat
		p1.setX(50);
		System.out.println(l1.getStartPoint().getX());
		l1.getStartPoint().setY(20);
		System.out.println(p1.getY());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
