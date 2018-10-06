package venom.main.calculation;

public class Subclass implements Calculation {
	public int x, y;
	
	public Subclass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int actCal() {
		// TODO Auto-generated method stub
		return this.x - this.y;
	}

	@Override
	public void printCal() {
		// TODO Auto-generated method stub
		System.out.println("x - y = "+ this.actCal());
//		System.out.println(this);
	}
	
}
