package guviPortalTaskTwo;

// Problem 1.1

public class Person {
	static String name;
	static int age;
	
	Person(String str){
		this.name = str;
		this.age = 18;
	}
	
	Person(String str, int age){
		this.name = str;
		this.age = age;
	}
	
	public static void display() {
		System.out.println(" Name :: " + name);
		System.out.println(" Age :: " + age);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Kannan");
		p1.display();
		Person p2 = new Person("Kannan", 25);
		p2.display();
	}

}
