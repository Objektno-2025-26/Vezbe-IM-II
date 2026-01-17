package geometry;

import java.awt.Graphics;

public class Point extends Shape{
	
	private int x;
	private int y;
	
	public Point(){
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	
	public double distance(Point p) {
//		int dx = x - p.getX();
		int dx = this.x - p.getX();
//		int dy = y - p.getY();
		int dy = this.y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x-3, y, x+3, y);
		g.drawLine(x, y-3, x, y+3);
	}

	@Override
	public boolean contains(int x, int y) {
		Point click = new Point(x,y);
		return this.distance(click) <= 3;
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.x += byX;
		this.y += byY;
		
	}
	
	@Override
	public String toString() {
		return String.format("(X: %s, Y: %s)", x,y);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Point) {
			Point temp = (Point) o;
			if(x == temp.getX() && y == temp.getY()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Shape o) {
		if(o instanceof Point) {
			Point temp = (Point)o;
			Point coordinateStart = new Point(0,0);
			return (int) (this.distance(coordinateStart) - 
					temp.distance(coordinateStart));
		}
		return 0;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
//		x = parametar;
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}



	

	
	
	

}
