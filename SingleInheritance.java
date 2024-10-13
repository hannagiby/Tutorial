package javalessons;
import java.util.Scanner;
class Employes10
{
	String name=new String();
	int id;
	void print_Employee()
	{
		System.out.println("Name:"+name);
		System.out.println("Employee id:"+id);
	}
	
}
class manager extends Employee
{
	String department=new String();
	int managed;
	void print_Manager() {
		System.out.println("Department:"+department);
		System.out.println("no of employees managed: "+managed);
	}
	
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		manager obj1=new manager();
		System.out.println("Enter the manager details:");
		System.out.println("Name:");
		obj1.name=sc.nextLine();
		System.out.println("Employee ID:");
		obj1.id=sc.nextInt();
		System.out.println("Department:");
		obj1.department=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the no of employees mangaed by the manager:");
		obj1.managed=sc.nextInt();
		for(int i=0;i<obj1.managed;i++)
		{
			Employee obj2=new Employee();
			System.out.println("Enter the details of the employee"+(i+1)+" :");
			System.out.println("Name:");
			obj2.name=sc.nextLine();
			sc.nextLine();
			System.out.println("Employee ID:");
			obj2.id=sc.nextInt();
		}
		
	}

}
