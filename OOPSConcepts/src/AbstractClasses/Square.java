package AbstractClasses;

public class Square extends Shapes{
	
	private int side;
	
	Square(int side){
	this.side= side;		
	}
	
	@Override
	public int Area() {
	
		return this.side*this.side;
	}
	
	@Override
	public int Perimeter() {
		return 4*this.side;
	}
	
}
