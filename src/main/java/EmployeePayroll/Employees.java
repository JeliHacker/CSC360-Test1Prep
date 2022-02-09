package EmployeePayroll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employees
{
	public List<Employee> employees;
	
	public Employees()
	{
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
	}
	
	public List<Double> payAll()
	{
		List<Double> employeePayments = new ArrayList<Double>();
		for(int i = 0; i < employees.size(); i++)
		{
			System.out.println(employees.get(i).getName() + " has been paid!");
			employeePayments.add(employees.get(i).pay());
		}
		return employeePayments;
	}
	
	public void printEmployees()
	{
		//System.out.println(Arrays.toString(list.employees));
		for(int i = 0; i < employees.size(); i++)
		{
			System.out.println(employees.get(i).getName());
		}
	}
}
