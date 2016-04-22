package com.dperez.Departments;
import com.dperez.UniversityMembers.Employee;

public class NonAcademicDepartment extends Department {
	protected Employee [] listOfEmployee;
	static int countEmployees = 0;
	public NonAcademicDepartment (String n) {
		super(n);
		listOfEmployee = new Employee[100];
	}
	public void addEmployee (Employee i) {
		if (countEmployees >= 100 ) {
			return;
		}
		listOfEmployee[countEmployees] = i;
		countEmployees++;
	}
	public String toString() {
		String s = super.toString();
		s = super.toString();
		s += "--------------Employees--------------\n";		
		for (int i = 0; i < countEmployees; i++) {
			if (listOfEmployee[i].getDepartment() == "SupportPersonnel") {
				s += listOfEmployee[i].toString();
				s += "Department: " + name + "\n";
				s += "------------------------------------\n";
			}
		}
		return s;
	}
}