package AbstractClasses;

public class Rectangle extends Shapes{
	private int side1;
	private int side2;
	public Rectangle(int side1,int side2) {
		this.side1 =side1;
		this.side2=side2;
	}
	
	@Override
	public int Area() {
		return this.side1*this.side2;
	}
	@Override
	public int Perimeter() {
		return 2*(this.side1+this.side2);
	}
}