
/**
 * Aggregation
 */
class Student {
	String name;
	int id;
	String dept;

	Student(String pname, int pid, String pdept) {
		this.name = pname;
		this.id = pid;
		this.dept = pdept;
	}
}

class Course {
	String name;
	private List<Student> students;

	Course(String pname, List<Student> pstudents) {
		this.name = pname;
		this.students = pstudents;
	}

	public List<Student> getStudents() {
	return students
	}
}



/**
 * Java Collections Framework
 */

import java.util.LinkedList;
import java.util.ListIterator;

class Main {
	public static void main(String[] args){
	LinkedList<String> presidents = new LinkedList<>();
	presidents.add(e: "1789 George Washington");
	presidents.add(e: "1789 George Washington");
	presidents.add(e: "1789 George Washington");
	presidents.add(e: "1789 George Washington");
	System.out.println("LinkedList: " + presidents);

	ListIterator<String> it = presidents.listIterator();
	while (it.hasNext()) {
		String p = it.next();
		if (p.compareTo(anotherString: "1809 James Maddison") > 0) {
			it.previous();
			it.add(e: "1809 James Maddison");
			break;
		}
	}
	presidents.add(e: "1825 John Quincy Adams");
	System.out.println("Updated LinkedList: " + presidents);
	}
}
