package javalessons;

public class Man {
	public String name;
	public int age;
	public Man(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayMe() {
		System.out.println("Man's Name:"+name+",Man's Age:"+age);
	}
}
