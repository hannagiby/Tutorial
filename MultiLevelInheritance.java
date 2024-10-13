package javalessons;
import java.util.Scanner;
class vechile
{
	int model;
	int year;
	void print_vechile()
	{
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
	}
}
class Car extends vechile
{
	int doors;
	void print_Car() {
		System.out.println("No of Doors:"+doors);
	}
}
class ElectricCar extends Car
{
	int capacity;
	void print_ElectricCar() {
		System.out.println("Battery Capacity:"+capacity);
	}
}
class worker
{
	String name;
	int id;
	String type=new String();
	void print_worker()
	{
		System.out.println("Name:"+name);
		System.out.println("Employee id:"+id);
		System.out.println("Type of employee:"+type);
	}
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ElectricCar e=new ElectricCar();
		System.out.println("Enter the car details:");
		System.out.println("Model:");
		e.model=sc.nextInt();
		System.out.println("Year:");
		e.year=sc.nextInt();
		System.out.println("No of Doors:");
		e.doors=sc.nextInt();
		System.out.println("Battery Capacity:");
		e.capacity=sc.nextInt();
		worker w=new worker();
		System.out.println("Enter the employee details:");
		sc.nextLine();
		System.out.println("Name:");
		w.name=sc.nextLine();
		System.out.println("Employee id:");
		w.id=sc.nextInt();
		sc.nextLine();
		System.out.println("Type of employee:");
		w.type=sc.nextLine();
		System.out.println("Car Details:");
		e.print_vechile();
		e.print_Car();
		e.print_ElectricCar();
		System.out.println("Employee Details:");
		w.print_worker();
		
		
		
		

	}

}
