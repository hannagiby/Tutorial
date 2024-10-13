package java2024;
import javalessons.Man;
import java.util.Scanner;
public class Woman{
	public String name;
	public int age;
	public Woman(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayMe() {
		System.out.println("Woman's Name:"+name+",Woman's Age:"+age);
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name and age of Man:");
		String name=sc.next();
		int age=sc.nextInt();
		Man m=new Man(name,age);
		System.out.println("Enter the name and age of Woman:");
		String n=sc.next();
		int a=sc.nextInt();
		Woman w=new Woman(n,a);
		m.displayMe();
		w.displayMe();
		}
}
