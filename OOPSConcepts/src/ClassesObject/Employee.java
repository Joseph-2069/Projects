package ClassesObject;

public class Employee {

	private int empid;
	private String empName;
	private double salary;
	private int deptno;
	
	
	public Employee(int empid, String empName, double salary, int deptno) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.deptno = deptno;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + ", deptno=" + deptno + "]";
	}
	
//	@Override 
//	public boolean equals(Object obj) {
//		if(obj instanceof Employee ) {
//			return this.empid == ((Employee)obj).empid;
//		}else {
//			return false;
//		}
//	}
}
