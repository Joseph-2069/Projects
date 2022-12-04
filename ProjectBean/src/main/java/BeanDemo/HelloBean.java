package BeanDemo;

public class HelloBean {
private String Message;


public HelloBean() {
	
}
public HelloBean(String Message) {
	super();
	this.Message=Message;
}
public String getMessage() {
	return Message;
}

public void setMessage(String message) {
	Message = message;
}
@Override
public String toString() {
	return "HelloBean [Message=" + Message + "]";
}

}
