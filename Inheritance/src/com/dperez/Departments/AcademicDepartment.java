package com.dperez.Departments;
import com.dperez.UniversityMembers.Employee;
import com.dperez.UniversityMembers.Student;

public class AcademicDepartment extends Department {
	private Student [] listOfStudents;
	static int countStudent = 0;
	protected Employee [] listOfEmployees;
	static int countEmployee = 0;
	
	public AcademicDepartment (String n) {
		super(n);
		listOfStudents = new Student[1000];
		listOfEmployees = new Employee[100];
	}
	public void addStudent (Student i) {
		if (countStudent >= 1000) {
			return;
		}
		listOfStudents[countStudent] = i;
		countStudent++;
	}
	public void addEmployee (Employee i) {
		if (countEmployee >= 100) {
			return;
		}
		listOfEmployees[countEmployee] = i;
		countEmployee++;
	}
	public String toString() {
		String s;
		s = super.toString();
		
		s += "--------------Employees--------------\n";
		for (int i = 0; i < countEmployee; i++) {
			if (listOfEmployees[i].getDepartment() == "Faculty") {
				s += listOfEmployees[i].toString();
				s += "AcademicDepartment: " + name + "\n";
				s += "------------------------------------\n";
			}
			if (listOfEmployees[i].getDepartment() == "SupportPersonnel") {
				s += listOfEmployees[i].toString();
				s += "Department: " + name + "\n";
				s += "------------------------------------\n";
			}
		}
		s += "--------------Students--------------\n";
		for (int i = 0; i < countStudent; i++) {
			s += "Student\n";
			s += listOfStudents[i].toString();
			s += "AcademicDepartment: " + name + "\n";
			s += "------------------------------------\n";
		}
		return s;
	}
}