package chapter11;

public class Exercise02_Person {
	public static void main(String[] args) {
		// Create Objects
		Person person = new Person("John Doe");
		Student student = new Student("Steve");
		Employee employee = new Employee("Bob");
		Faculty faculty = new Faculty("Mark");
		Staff staff = new Staff("Alice");

		// Display results
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());

		// Or you can invoke with .toString()
		System.out.println(faculty);
		System.out.println(staff.toString());
	}
}

class Person {
	protected String name, address, phoneNumber, email;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classname: Student, Person name: " + name;
	}
}

class Student extends Person {
	public static final int FRESHMAN = 1, SOPHOMORE = 2, JUNIOR = 3, SENIOR = 4;
	protected int classStatus;

	public Student(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Classname: Student, Person name: " + name;
	}
}

class Employee extends Person {
	protected String office;
	protected double salary;
	protected MyDate dateHired;

	public Employee(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Classname: Employee, Person name: " + name;
	}
}

class Faculty extends Employee {
	private int officeHour;
	private String rank;

	public Faculty(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Classname: Faculty, Person name: " + name;
	}
}

class Staff extends Employee {
	private String title;

	public Staff(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Classname: Staff, Person name: " + name;
	}
}
