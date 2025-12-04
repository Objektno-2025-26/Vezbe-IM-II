package geometry;

public class Main {

	public static void main(String[] args) {
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
		

	}

}
