package geometry;

import java.awt.Graphics;

public class Donut extends Circle {

	private int innerRadius;
	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center,radius);
		this.innerRadius =  innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		this.selected = selected;
	}
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", inner radius: " + innerRadius;
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g); //Iscrtava veliki krug koristeci radius
		g.drawOval(center.getX()-innerRadius, center.getY()-innerRadius, 
				innerRadius*2, innerRadius*2);
	}

	@Override
	public boolean contains(int x, int y) {
		Point click = new Point(x,y);
		return super.contains(x, y) && center.distance(click) >= innerRadius;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Donut) {
			Donut temp = (Donut) o;
			if(radius == temp.getRadius() && innerRadius == temp.getInnerRadius()) {
				return true;
			}
		}
		return false;
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
}
