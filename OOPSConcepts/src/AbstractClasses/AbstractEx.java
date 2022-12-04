package AbstractClasses;

/*
 * -> if a class is abstract then it can have both non-abstract and abstract methods.
 * -> it is not wrong to implement an abstract class without abstract methods being present in them.
 *    The compiler will not throw error
 * -> the use of abstract methods is that the method can be called in multiple classes and can be changed 
 * 	  according to the need in the class.
 * -> Abstraction can be achieved by the abstract classes.
 * -> if a abstract method needs to be implemented then the class should also be abstract but
 *    the visa-versa is not true
 * -> Objects cannot not be instantiated in them
 * -> the class which extends the abstract class is called concrete class because it has implemented methods in it
 * 
 * 
 * 
 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
   Abstraction can be achieved with either abstract classes or interfaces
   The abstract keyword is a non-access modifier, used for classes and methods:
   Abstract class: is a restricted class that cannot be used to create objects.
   Abstract method: can only be used in an abstract class, and it does not have a body.
   The body is provided by the subclass.
 * 
 * 
 * 
 * 
 */

public class AbstractEx {
	public static void main(String[] args) {
//	Shapes s= new Shapes();
		Shapes s;

		s = new Square(5);
		System.out.println(s.Area());
		System.out.println(s.Perimeter());

		Shapes r = new Rectangle(5, 2);
		System.out.println(r.Area());
		System.out.println(r.Perimeter());

	}

}