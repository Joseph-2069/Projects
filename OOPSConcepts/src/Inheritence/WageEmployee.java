package Inheritence;

public class WageEmployee {
	private double DailyWage;
	private int DaysWorked;
	public WageEmployee(double dailyWage, int daysWorked) {
		super();
		DailyWage = dailyWage;
		DaysWorked = daysWorked;
	}
	public double getDailyWage() {
		return DailyWage;
	}
	public void setDailyWage(double dailyWage) {
		DailyWage = dailyWage;
	}
	public int getDaysWorked() {
		return DaysWorked;
	}
	public void setDaysWorked(int daysWorked) {
		DaysWorked = daysWorked;
	}
	
	

}
