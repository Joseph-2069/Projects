package SingleInterface;

public class interfaceEx {

	public static void main(String[] args) {
		
		Bounceable b;  //reference
		
//		Bounceable b = new Bounceable(); //cannot create object  of interface 
		
		Ball ball =new Ball();
		System.out.println(ball.color());
		System.out.println(ball.noOfBounce());
		
		
		

	}

}
