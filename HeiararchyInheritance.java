package javalessons;
import java.util.Scanner;
class Employee
{
	String name;
	int id;
	void EmployeeDetails()
	{
		System.out.print("\nName:"+name);
		System.out.print("\nId:"+id);
	}
	
}
class FullTimeEmployee extends Employee
{
	int salary;
	void Employee1Details ()
	{
		System.out.println("\nSalary:"+salary);
	}
}
class PartTimeEmployee extends Employee
{
	int hourlyrate;
	void Employee2Details()
	{
		System.out.println("\nHourly Rate:"+hourlyrate);
	}
	
}
public class HeiararchyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FullTimeEmployee f=new FullTimeEmployee();
		PartTimeEmployee p =new PartTimeEmployee();
		System.out.println("Enter the details of full time employee:");
		System.out.println("Name:");
		f.name=sc.nextLine();
		System.out.println("Id:");
		f.id=sc.nextInt();
		System.out.println("Salary:");
		f.salary=sc.nextInt();
		
		System.out.println("Enter the details of part time employee:");
		sc.nextLine();
		System.out.println("\nName:");
		p.name=sc.nextLine();
		System.out.println("Id:");
		p.id=sc.nextInt();
		System.out.println("Hourly Salary:");
		p.hourlyrate=sc.nextInt();
		System.out.println("Full Time Employee Details");
		f.EmployeeDetails();
		f.Employee1Details();
		System.out.println("Part Time Employee Details");
		p.EmployeeDetails();
		p.Employee2Details();
			     
		

	}

}
