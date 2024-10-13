package javalessons;
import java.util.Scanner;
 abstract class Employeee{
  abstract void calcmonthsalary();
   String name;
   String type;
    Employeee(String name, String type){
   this.name=name;
   this.type=type;
  }
public String getName() {
return name;
 }
 }
class FullTimeEmployeee6 extends Employeee{
int salary;
int hra=1000;
FullTimeEmployeee6(String name, int salary)
{
super(name, "Fulltime");
this.salary=salary;
}
void calcmonthsalary() {
salary=salary+hra;
System.out.println(name+"'s Salary: Rs."+salary);
}
}

class PartTimeEmployeee6 extends Employeee
{
	int hourlywage;
	int noofhours;
	PartTimeEmployeee6(String name,int hourlywage,int noofhours)
	{
	super(name,"PartTime");
	this.hourlywage=hourlywage;
	this.noofhours=noofhours;
	}
	void calcmonthsalary()
	{
	  hourlywage=hourlywage*noofhours*25;
	  System.out.println(name+"'s salary:Rs"+hourlywage);
	}
}
class Intern extends Employeee
{
	int stipened;
	Intern(String name,int stipened)
	{
		super(name,"Intern");
		this.stipened=stipened;
	}
	void calcmonthsalary()
	{
		System.out.println(name+"'s stipened: Rs"+stipened);
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String choice;
		do
		{
			System.out.println("Enter employee name:");
			String name=sc.nextLine();
			System.out.println("Enter the employee job type(Full-Time,Part-Time,Intern):");
			String type=sc.nextLine();
			if(type.toLowerCase().equals("Full-Time"))
			{
			System.out.println("Enter the monthly Salary:");
			int salary=sc.nextInt();
			FullTimeEmployeee6 f=new FullTimeEmployeee6(name,salary);
			f.calcmonthsalary();
			}
			else if(type.toLowerCase().equals("Part-Time"))
			{
				System.out.println("Enter the hourly wage:");
				int hourlywage=sc.nextInt();
				System.out.println("Enter the no of hours worked per day:");
				int noofhours=sc.nextInt();
				PartTimeEmployeee6 p=new PartTimeEmployeee6(name,hourlywage,noofhours);
				p.calcmonthsalary();

				
			}
			else if(type.toLowerCase().equals("Intern"))
					{
				System.out.println("Enter the stipened amount:");
				int stipened=sc.nextInt();
				Intern i=new Intern(name,stipened);
				i.calcmonthsalary();
					}
			System.out.println("Do you want to continue or not(y/n):");
			sc.nextLine();
			choice =sc.nextLine();
		}
		while(choice.toLowerCase().equals("y"));
		if(choice.toLowerCase().equals("n"));
		{
			
			System.out.println("Exiting....");
			
		}

	}

}
