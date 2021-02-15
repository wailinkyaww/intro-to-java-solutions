package chapter10;

// Test program
public class Exercise09_Course {
	public static void main(String[] args) {
		// Create a Course
		Course c1 = new Course("Event-Driven Programming");

		c1.addStudent("John Smith");
		c1.addStudent("Alice");
		c1.addStudent("Bob");

		c1.dropStudent("Alice");

		// Before clearing
		String[] students = c1.getStudents();
		display(students, c1.getNumberOfStudents());

		// After clear
		c1.clear();
		display(students, c1.getNumberOfStudents());
	}

	public static void display(String[] s, int length) {
		for (int i = 0; i < length; i++) {
			System.out.println(s[i]);
		}
	}
}

class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	private static final int DEFAULT_SIZE = 1;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new String[DEFAULT_SIZE];
	}

	public void addStudent(String student) {
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}

		students[numberOfStudents++] = student;
	}

	public void dropStudent(String student) {
		int i = 0;
		for (; i < numberOfStudents; i++) {
			if (students[i].equals(student))
				break;
		}
		for (int j = i; j < numberOfStudents; j++) {
			students[j] = students[j + 1];
		}
		numberOfStudents--;
	}

	public void clear() {
		students = null;
		numberOfStudents = 0;
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

}
