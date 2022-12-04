package SingleInterface;

public class Ball implements Bounceable {
	
	//A class that implements the interface agrees to implement all the methods defined in it
	//if all the methods are not implemented then that class must be declared as abstract.
	
	@Override
	public int noOfBounce() {
		return 2;

	}
	@Override
	public String color() {
		return "Red";
	}
	

}
