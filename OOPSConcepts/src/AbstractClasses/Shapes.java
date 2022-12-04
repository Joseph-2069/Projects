package AbstractClasses;

public abstract class Shapes {
	
private int side1,side2,side3;

public Shapes() {
	
}

public abstract int Perimeter();

public abstract int Area();

public Shapes(int side1) {
	this.side1=side1;
}
public Shapes(int side1,int side2) {
	this.side1=side1;
	this.side2=side2;
}
public Shapes(int side1,int side2,int side3) {
	this.side1=side1;
	this.side2=side2;
	this.side3=side3;
}

public int getSide1() {
	return side1;
}

public void setSide1(int side1) {
	this.side1 = side1;
}

public int getSide2() {
	return side2;
}

public void setSide2(int side2) {
	this.side2 = side2;
}

public int getSide3() {
	return side3;
}

public void setSide3(int side3) {
	this.side3 = side3;
}

}
