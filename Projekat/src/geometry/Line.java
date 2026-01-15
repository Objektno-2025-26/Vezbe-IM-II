package geometry;

import java.awt.Graphics;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;

	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	public double length() {
		return startPoint.distance(endPoint);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return String.format("(startX: %s, startY: %s) --> (endX: %s, endY: %s)", startPoint.getX(), startPoint.getY(),
				endPoint.getX(), endPoint.getY());
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Line) {
			Line temp = (Line) o;
			if (startPoint.equals(temp.getStartPoint()) && endPoint.equals(temp.getEndPoint())) {
				return true;
			}
		}
		return false;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
}
