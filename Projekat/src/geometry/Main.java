package geometry;

import javax.swing.JOptionPane;

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
//		System.out.println(l1.getStartPoint());
//		System.out.println(l1.getEndPoint());
//		Atributu startPoint se dodeljuje referenca p1, nakon cega te dve reference pokazuju
//		na isti objekat. Ista prica je i za endPoint i p2
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		
//		startPoint i p1 sada pokazuju na isti objekat i to je vidljivo u ispisu na konzoli
//		System.out.println(l1.getStartPoint());
//		System.out.println(p1);
		
//		Promena vrednosti x ili y vrednosti tog objekta je moguca kroz i jednu i drugu referencu
//		Sustinski, u ovom trenutku, p1 i startPoint pokazuju na isti objekat i getX() i getY() kroz
//		bilo koju referencu ce uvek vratiti isti rezultat
		p1.setX(50);
//		System.out.println(l1.getStartPoint().getX());
		l1.getStartPoint().setY(20);
//		System.out.println(p1.getY());
		
//		Vezbe 6
	/*	System.out.println(p1.toString());
		System.out.println(p1);
		
		Line l2 = new Line(new Point(10,20), new Point(50,100));
		System.out.println(l2);
		
		Rectangle r1 = new Rectangle(p1, 50, 50);
		Rectangle r2 = new Rectangle(p1, 50, 50);
		
//		System.out.println(r1.equals(r2));
//		System.out.println(r1 == r2);
		
//		Object test = new Circle();
		Point p3 = new Point(50,20);
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));
	*/
		
//		Vezbe 7
		Donut d1 = new Donut(new Point(50,50),50,30);
//		System.out.println(d1);
		
//		Vezbe 9
		
		int[] brojevi = new int[5];
//		Point[] tacke = new Point[5];
		
//		System.out.println(brojevi[3]);
//		System.out.println(tacke[3]);
		brojevi[0] = 4;
		brojevi[1] = 5;
		brojevi[2] = 6;
		brojevi[3] = 7;
		brojevi[4] = 8;
		
//		for(int i = brojevi.length - 1; i >= 0; i--) {
//			System.out.print(brojevi[i] + " ");
//		}
		
		int[] drugiBrojevi = {10,9,8,7,6,5,4,3,2,1};
		
/*		for(int i = 0; i < drugiBrojevi.length; i++) {
//			drugiBrojevi[i] = drugiBrojevi[i] * 5;
			drugiBrojevi[i] *= 5;
			System.out.print(drugiBrojevi[i] + " ");
		}*/
		
		try {
			System.out.println(drugiBrojevi[20]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program i dalje radi!");
		
		
	/*	String xKoordinata = "50  aaa";
		try {
			int xKoor  = Integer.valueOf(xKoordinata);
			JOptionPane.showMessageDialog(null, xKoor);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Unesite samo broj");
		}*/
		
		Circle c1 = new Circle(p1, 80);
		
		try {
			c1.setRadius(50);
			System.out.println("Radius je: " + c1.getRadius());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
