package ClassesObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp {
public static void main(String[] args) {

//Manager m1;
Employee emp =new Employee(1,"joseph",2500,103);
Employee emp1 =new Employee(1,"joseph",2500,103);

Employee emp2 =new Employee(1,"joseph",2500,103);

Employee emp3 =new Employee(1,"joseph",2500,103);

Employee emp4 = null;


List<Employee>EList =new ArrayList<Employee>();

EList.add(emp);
EList.add(emp1);
EList.add(emp2);
EList.add(emp3);
//EList.add(emp4);


Iterator<Employee> it = EList.iterator();
int upNum =9;
while(it.hasNext()) {
	it.next().setEmpid(0);
}
System.out.println(EList);

if(emp instanceof Employee) {
	System.out.println("Its an instance of employee");
}


Object obj= "";
if(obj instanceof Employee) {
	System.out.println("Its an instance of employee");
}
else {
	System.out.println("Its not an instance of employee");
}



System.out.println((emp instanceof Employee));  
System.out.println((emp1 instanceof Employee)); 
}
}
