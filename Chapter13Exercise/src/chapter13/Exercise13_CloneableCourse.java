package chapter13;

// Driver class
public class Exercise13_CloneableCourse {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course course1 = new Course("Database Programming");
		course1.addStudent("John Smith");
		course1.addStudent("Alice");
		course1.addStudent("Bob");

		Course course2 = (Course) course1.clone();
		System.out.println("Is course1 == course2 ? " + (course1 == course2));
	}
}

class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
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

	public void dropStudent() {

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Perform a shallow copy
		Course courseClone = (Course) super.clone();

		// Deep copy on students[]
		courseClone.students = (String[]) students.clone();

		return courseClone;
	}
}
