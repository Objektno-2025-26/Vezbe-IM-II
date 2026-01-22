package vezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Drawing drawing = new Drawing();
		drawing.setBackground(Color.white);
		frame.setSize(1200,700);
		frame.setContentPane(drawing);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(500,500);
//		p1.draw(g);
		Line l1 = new Line(new Point(400,400), new Point(300,300));
//		l1.draw(g);
		Rectangle r1 = new Rectangle(new Point(700,700), 50,50);
//		r1.draw(g);
		Circle c1 = new Circle(p1, 100);
//		c1.draw(g);
		Donut d1 = new Donut(new Point(300,300),60,30);
//		d1.draw(g);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(r1);
		shapes.add(c1);
		shapes.add(d1);
		
		for(Shape s : shapes) {
//			System.out.println(s);
			g.setColor(Color.BLACK);
			s.draw(g);
			g.setColor(Color.blue);
			s.moveBy(10, 10);
			s.draw(g);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
