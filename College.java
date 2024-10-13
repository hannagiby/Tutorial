package javalessons;
import java.util.Scanner;
class Student1{
String name;
int id;
String dept;
Student1(String name, int id, String dept)
 {
 this.name=name;
 this.id=id;
 this.dept=dept;
 }
void printdisplay()
 {
  System.out.println("Name :"+name);
  System.out.println("ID :"+id);
  System.out.println("Department :"+dept);
 }
}
class Hosteler extends Student1{
String HostelName;
Hosteler(String name, int id, String dept, String HostelName){
super(name, id, dept);
this. HostelName=HostelName;
}
void printdisplay()
{ 
	super.printdisplay();

System.out.println("Hostel name is:"+HostelName);
}

}
class Dayscholar extends Student1{
String busroute;
Dayscholar(String name, int id, String dept, String busroute){
super(name, id, dept);
this.busroute=busroute;
}
void printdisplay() 
{
super.printdisplay();
System.out.println("Bus Route is:"+busroute);
}
}
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Deparment:");
		String dept=sc.nextLine();
		System.out.println("Enter ID:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the student type:");
        String type=sc.nextLine();
        if(type.equalsIgnoreCase ("Hosteler")) {
        	System.out.println("Enter Hostel name:");
        String HostelName=sc.nextLine();
        Hosteler h=new Hosteler(name, id, dept, HostelName);
        h.printdisplay();
	}
	else if(type.equalsIgnoreCase( "Dayscholar")){
       System.out.println("Enter Bus Route:");
       String route=sc.nextLine();
		Dayscholar d=new Dayscholar(name,id,dept,route);
		d.printdisplay();
        }
       else {
       System.out.println("Invalid");
        }


	}
	}

