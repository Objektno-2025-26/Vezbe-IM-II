package geometry;

public interface Moveable {

//	Pisanje public abstract kljucnih reci je opciono u interfejsu zato sto se podrazumeva
	public abstract void moveTo(int x, int y);
	public abstract void moveBy(int byX, int byY);
}
