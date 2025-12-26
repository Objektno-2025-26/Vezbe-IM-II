package geometry;

public class Circle {

	private Point center;
	private int radius;
	private boolean selected;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center,radius);
		this.selected = selected;
	}
	
	@Override
	public String toString() {
		return String.format("Center: (X: %s, Y: %s), radius: %s", 
				center.getX(), center.getY(), radius);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle temp = (Circle) o;
			if(radius == temp.getRadius()) {
				return true;
			}
		}
		return false;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
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
	
	public void setRadius(int radius) {
		this.radius = radius;
		
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
