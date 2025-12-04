package geometry;

public class Point {
	
	private int x;
	private int y;
	private boolean selected;
	
	public double distance(Point p) {
//		int dx = x - p.getX();
		int dx = this.x - p.getX();
//		int dy = y - p.getY();
		int dy = this.y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
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
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
