package EmployeePayroll;

public class Employee
{

	public String name;
	public double rate;
	public double hoursWorked;
	
	public Employee(String name, double rate, double hoursWorked)
	{
		this.name = name;
		this.rate = rate;
		this.hoursWorked = hoursWorked;
	}
	

	public String getName()
	{
		return name;
	}

	public double getHoursWorked()
	{
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	
	public double pay()
	{
		return 1;
	}
}
