package geometry;

import java.awt.Graphics;

public class Circle extends Shape {

	protected Point center;
	protected int radius;

	public Circle() {

	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX() - radius, center.getY() - radius, radius*2, radius*2);
	}

	@Override
	public boolean contains(int x, int y) {
		Point click = new Point(x, y);
		return center.distance(click) <= radius;
	}

	@Override
	public void moveTo(int x, int y) {
		center.moveTo(x, y);

	}

	@Override
	public void moveBy(int byX, int byY) {
		center.moveBy(byX, byY);

	}

	@Override
	public String toString() {
		return String.format("Center: (X: %s, Y: %s), radius: %s", center.getX(), center.getY(), radius);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			Circle temp = (Circle) o;
			if (radius == temp.getRadius()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Shape o) {
		if(o instanceof Circle) {
			Circle temp = (Circle)o;
			return (int) (this.area() - temp.area());
		}
		return 0;
	}

	public double area() {
		return radius * radius * Math.PI;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws Exception {
		if( !(radius>0) ) {
			throw new Exception("Radius mora biti veci od 0!");
		}
		this.radius = radius;

	}

	
	
	
}
