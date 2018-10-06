package venom.main.calculation;

public class Addclass implements Calculation {
	private int x, y;
	
	public Addclass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int actCal() {
		// TODO Auto-generated method stub
		return this.x + this.y;
	}

	@Override
	public void printCal() {
		// TODO Auto-generated method stub
		System.out.println("x + y = "+ this.actCal());
//		System.out.println(this);
	}
	
	// getter and setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
