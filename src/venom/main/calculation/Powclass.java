package venom.main.calculation;

public class Powclass implements Calculation{
	public int x, y;
	
	public Powclass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int actCal() {
		// TODO Auto-generated method stub
		return (int)Math.pow(this.x, this.y);
	}

	@Override
	public void printCal() {
		System.out.println("x ^ y = "+ this.actCal());
		// TODO Auto-generated method stub
		
	}

}
