package EmployeePayroll;

public class Example
{

	public static void main(String[] args)
	{
	
		Employees employees = new Employees();
		Employee muhammad = new Employee("Muhammad", 7.25, 60);
		employees.addEmployee(muhammad);
		System.out.println(employees);
		employees.printEmployees();
		employees.payAll();
	}
	
	

}
