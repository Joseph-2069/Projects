package Inheritence;

public class Employee {

	private int EmpId;
	private String EmpName;
	private double EmpSalary;
	private int deptNo;
	
	
	public Employee(int EmpId,String EmpName,double EmpSalary,int deptNo) {
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.EmpSalary=EmpSalary;
		this.deptNo=deptNo;
	}


	public int getEmpId() {
		return EmpId;
	}


	public void setEmpId(int empId) {
		EmpId = empId;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public double getEmpSalary() {
		return EmpSalary;
	}


	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}


	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
}
