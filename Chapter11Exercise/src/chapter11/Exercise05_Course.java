package chapter11;

import java.util.ArrayList;

// Test Program
public class Exercise05_Course {
		public static void main(String[] args) {
			// Create new course
			Course course = new Course("Database Programming");
			
			course.addStudent("John Smith");
			course.addStudent("Alice");
			course.addStudent("Bob");
			
			System.out.println("Course Name : " + course.getCousreName());
			System.out.println("The number of students: " + course.getNumberOfStudents());
		}
}

class Course {
	private String cousreName;
	private ArrayList<String> list = new ArrayList<>();

	public Course(String couserName) {
		this.cousreName = couserName;
	}

	public String getCousreName() {
		return cousreName;
	}

	public void setCousreName(String cousreName) {
		this.cousreName = cousreName;
	}

	public void addStudent(String name) {
		list.add(name);
	}

	public void dropStudent(String name) {
		list.remove(name);
	}

	public int getNumberOfStudents() {
		return list.size();
	}

	public void clear() {
		list.clear();
	}
}
